package sy.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetNextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Date date=GetNextDate();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.format(date);
		System.out.println(sdf.format(date));
    
		
		
		
		
		
	}

	public static Date GetNextDate(){
		try {
			Thread.sleep(24*60*60*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		return new Date();
	}	
	
	
}
