package web.util.system.plugins;


public class PagingDialect
{
  public boolean supportsLimit()
  {
    return false;
  }

  public boolean supportsLimitOffset() {
    return supportsLimit();
  }

  public String getLimitString(String sql, int offset, int limit)
  {
    return getLimitString(sql, offset, Integer.toString(offset), limit, 
      Integer.toString(limit), "");
  }

  public String getLimitString(String sql, int offset, int limit, String orderBy)
  {
    return getLimitString(sql, offset, Integer.toString(offset), limit, 
      Integer.toString(limit), orderBy);
  }

  public String getLimitString(String sql, int offset, String offsetPlaceholder, int limit, String limitPlaceholder, String _orderBy)
  {
    throw new UnsupportedOperationException("paged queries not supported");
  }
}