package web.util.system.plugins;

public class PagingIndex {
	private long startindex;
	  private long endindex;

	  public PagingIndex(long startindex, long endindex)
	  {
	    this.startindex = startindex;
	    this.endindex = endindex;
	  }
	  public long getStartindex() {
	    return this.startindex;
	  }
	  public void setStartindex(long startindex) {
	    this.startindex = startindex;
	  }
	  public long getEndindex() {
	    return this.endindex;
	  }
	  public void setEndindex(long endindex) {
	    this.endindex = endindex;
	  }
}
