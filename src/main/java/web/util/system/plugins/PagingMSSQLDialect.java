package web.util.system.plugins;

public class PagingMSSQLDialect extends PagingDialect {
	public boolean supportsLimit()
	  {
	    return true;
	  }

	  public boolean supportsLimitOffset()
	  {
	    return true;
	  }

	  public String getLimitString(String querySqlString, int offset, String offsetPlaceholder, int limit, String limitPlaceholder, String _orderBy)
	  {
	    StringBuffer pagingBuilder = new StringBuffer();
	    String orderby = _orderBy;

	    if ((orderby == null) || (orderby.length() == 0)) {
	      orderby = getOrderByPart(querySqlString);

	      if ((orderby == null) || (orderby.length() == 0) || (orderby.indexOf(")") > -1)) {
	        orderby = "ORDER BY CURRENT_TIMESTAMP";
	      }

	    }

	    String distinctStr = "";

	    String loweredString = querySqlString.toLowerCase();
	    String sqlPartString = querySqlString;
	    if (loweredString.trim().startsWith("select")) {
	      int index = 6;
	      if (loweredString.startsWith("select distinct")) {
	        distinctStr = "DISTINCT ";
	        index = 15;
	      }
	      sqlPartString = sqlPartString.substring(index);
	    }
	    pagingBuilder.append(sqlPartString);

	    StringBuffer result = new StringBuffer();
	    result.append("WITH query AS (SELECT ")
	      .append(distinctStr)
	      .append("TOP 100 PERCENT ")
	      .append(" ROW_NUMBER() OVER (")
	      .append(orderby)
	      .append(") as __row_number__, ")
	      .append(pagingBuilder)
	      .append(") SELECT * FROM query WHERE __row_number__ BETWEEN ")
	      .append(offset + 1).append(" AND ").append(offset + limit)
	      .append(" ORDER BY __row_number__");

	    return result.toString();
	  }

	  static String getOrderByPart(String sql) {
	    String loweredString = sql.toLowerCase();
	    int orderByIndex = loweredString.indexOf("order by");
	    if (orderByIndex != -1)
	    {
	      return sql.substring(orderByIndex);
	    }
	    return "";
	  }
}
