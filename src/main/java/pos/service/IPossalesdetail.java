package pos.service;

import java.util.HashMap;



public interface IPossalesdetail {
		
	HashMap<String,Object> possalesdetaillist(String conditions, int pageno, int pagesize);

}
