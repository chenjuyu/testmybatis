package web.util.system.plugins;	
import java.util.List;
	public class PagingView
	{
	  private String orderBy;
	  private List records;
	  private PagingIndex pagingIndex;
	  private long pageCount;
	  private int pageSize = 10;

	  private int pageNow = 1;
	  private long rowCount;
	  private int startPage;
	  private int pagecode = 5;

	  public String getOrderBy()
	  {
	    return this.orderBy;
	  }

	  public void setOrderBy(String orderBy) {
	    this.orderBy = orderBy;
	  }

	  public PagingView()
	  {
	  }

	  public int getFirstResult()
	  {
	    return (this.pageNow - 1) * this.pageSize;
	  }

	  public int getPagecode() {
	    return this.pagecode;
	  }

	  public void setPagecode(int pagecode) {
	    this.pagecode = pagecode;
	  }

	  public PagingView(int pageSize, int pageNow)
	  {
	    this.pageSize = pageSize;
	    this.pageNow = pageNow;
	  }

	  public PagingView(int pageNow)
	  {
	    this.pageNow = pageNow;
	    this.startPage = ((this.pageNow - 1) * this.pageSize);
	  }

	  public void setQueryResult(long rowCount, List records)
	  {
	    setRowCount(rowCount);
	    setRecords(records);	    
	  }

	  public void setRowCount(long rowCount) {
	    this.rowCount = rowCount;
	    setPageCount(this.rowCount % this.pageSize == 0L ? 
	      this.rowCount / this.pageSize : 
	      this.rowCount / this.pageSize + 1L);
	  }

	  public List getRecords()
	  {
	    return this.records;
	  }

	  public void setRecords(List records) {
	    this.records = records;
	  }

	  public PagingIndex getPagingIndex()
	  {
	    return this.pagingIndex;
	  }

	  public void setPagingIndex(PagingIndex PagingIndex) {
	    this.pagingIndex = PagingIndex;
	  }

	  public void setPageCount(long pageCount)
	  {
	    this.pageCount = pageCount;
	    if (pageCount < this.pageNow) this.pageNow = ((int)pageCount);

	    this.pagingIndex = PagingTools.getPageIndex(this.pagecode, this.pageNow, pageCount);
	  }

	  public int getPageNow() {
	    return this.pageNow;
	  }

	  public void setPageNow(int pageNow)
	  {
	    this.pageNow = pageNow;
	    if (this.pageNow < 1) this.pageNow = 1; 
	  }

	  public long getPageCount()
	  {
	    return this.pageCount;
	  }

	  public int getPageSize() {
	    return this.pageSize;
	  }

	  public void setPageSize(int pageSize) {
	    this.pageSize = pageSize;
	  }

	  public long getRowCount() {
	    return this.rowCount;
	  }

	  public int getStartPage() {
	    return this.startPage;
	  }

	  public void setStartPage(int startPage) {
	    this.startPage = startPage;
	  }
	}

