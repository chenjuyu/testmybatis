package pos.service;

import java.util.HashMap;

public interface IColor {
	
	HashMap<String,Object> searchcolor(boolean brandFlag,String conditions,int pageno,int pagesize);


}
