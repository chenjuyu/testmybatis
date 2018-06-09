package web.util.system.plugins;
import web.util.Common;
import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import javax.xml.bind.PropertyException;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;

/*
 * * Mybatis的分页查询插件，通过拦截StatementHandler的prepare方法来实现。 
 * 只有在参数列表中包括Pagie类型的参数时才进行分页查询。 
 * 在多参数的情况下，只对第一个PagingView类型的参数生效。 
 * 另外，在参数列表中，Page类型的参数无需用@Param来标注 
 * 
 * xml 中配置业查询PagingView
 *  <property name="plugins">  
       <list>  
          <!-- 配置自己实现的分页插件 -->  
          <bean class="xx.xx.xx.mybatis.PagingPlugin">  
            <property name="dialect" value="mysql"/>  
          </bean>  
        </list>  
    </property>  
 * 
 * */
@Intercepts({@org.apache.ibatis.plugin.Signature(type=org.apache.ibatis.executor.statement.StatementHandler.class, method="prepare", args={Connection.class})})
public class PagingPlugin
  implements Interceptor
{
  private static PagingDialect dialectObject = null;
  private static String pageSqlId = "";

  public Object intercept(Invocation ivk) throws Throwable {
    if ((ivk.getTarget() instanceof RoutingStatementHandler)) {
      RoutingStatementHandler statementHandler = (RoutingStatementHandler)ivk
        .getTarget();
      BaseStatementHandler delegate = (BaseStatementHandler)
        ReflectHelper.getValueByFieldName(statementHandler, "delegate");
      MappedStatement mappedStatement = (MappedStatement)
        ReflectHelper.getValueByFieldName(delegate, "mappedStatement");

      BoundSql boundSql = delegate.getBoundSql();
      Object parameterObject = boundSql.getParameterObject();
      if (parameterObject == null)
      {
        return ivk.proceed();
      }

      PagingView PagingView = null;
      if ((parameterObject instanceof PagingView)) {
        PagingView = (PagingView)parameterObject;
      } else if ((parameterObject instanceof Map))
      {
        Iterator localIterator = ((Map)parameterObject)
          .entrySet().iterator();

        while (localIterator.hasNext()) {
          Map.Entry entry = (Map.Entry)localIterator.next();
          if ((entry.getValue() instanceof PagingView)) {
            PagingView = (PagingView)entry.getValue();
            break;
          }
        }
      } else {
        PagingView = (PagingView)ReflectHelper.getValueByFieldType(
          parameterObject, PagingView.class);
      }

      if (PagingView == null) {
        return ivk.proceed();
      }
      String sql = boundSql.getSql();
      PreparedStatement countStmt = null;
      ResultSet rs = null;
      try {
        String temp1 = sql.toLowerCase().replace('\n', ' ')
          .replace('\t', ' ').replaceAll("  by", " by");
        String[] ss = temp1.split(" from");
        if ((ss != null) && (ss.length > 1) && 
          (ss[(ss.length - 1)].indexOf("order by") > 0)) {
          ss[(ss.length - 1)] = ss[(ss.length - 1)]
            .split("order by")[0];
          String temp2 = "";
          for (int j = 0; j < ss.length; j++) {
            if (temp2 != "") {
              temp2 = temp2 + " from";
            }
            temp2 = temp2 + ss[j];
          }

          temp1 = temp2;
        }

        Connection connection = (Connection)ivk.getArgs()[0];
        String countSql = "select count(1) from (" + temp1 + 
          ") tmp_count";
        countStmt = connection.prepareStatement(countSql);

        ReflectHelper.setValueByFieldName(boundSql, "sql", countSql);
        DefaultParameterHandler parameterHandler = new DefaultParameterHandler(
          mappedStatement, parameterObject, boundSql);
        parameterHandler.setParameters(countStmt);
        rs = countStmt.executeQuery();
        int count = 0;
        if (rs.next()) {
          count = ((Number)rs.getObject(1)).intValue();
        }
        PagingView.setRowCount(count);
      } finally {
        try {
          rs.close();
        } catch (Exception localException) {
        }
        try {
          countStmt.close();
        } catch (Exception localException1) {
        }
      }
      String pageSql = generatePagesSql(sql, PagingView);
      ReflectHelper.setValueByFieldName(boundSql, "sql", pageSql);
    }

    return ivk.proceed();
  }

  private String generatePagesSql(String sql, PagingView page)
  {
    if ((page != null) && (dialectObject != null))
    {
      int pageNow = page.getPageNow();
      return dialectObject.getLimitString(sql, (pageNow <= 0 ? 0 : 
        pageNow - 1) * page.getPageSize(), page.getPageSize(), 
        page.getOrderBy());
    }
    return sql;
  }

  public Object plugin(Object target) {
    return Plugin.wrap(target, this);
  }

  public void setProperties(Properties p) {
    String dialect = "";
    dialect = p.getProperty("dialect");
    if (Common.isEmpty(dialect))
      try {
        throw new PropertyException("dialect property is not found!");
      } catch (PropertyException e) {
        e.printStackTrace();
      }
    else {
      try
      {
        dialectObject = 
          (PagingDialect)Class.forName(dialect)
          .getDeclaredConstructor(new Class[0])
          .newInstance(new Object[0]);
      }
      catch (Exception e) {
        throw new RuntimeException(dialect + ", init fail!\n" + e);
      }
    }
    pageSqlId = p.getProperty("pageSqlId");
    if (Common.isEmpty(pageSqlId))
      try {
        throw new PropertyException("pageSqlId property is not found!");
      } catch (PropertyException e) {
        e.printStackTrace();
      }
  }
}
