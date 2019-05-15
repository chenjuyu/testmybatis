package sy.test;

public class TestDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sumWeight,winrate;
		winrate =0;
		sumWeight =0.D;
		
		for (int i=0 ;i<=20 ;i++){
		winrate +=i;
		
		sumWeight += winrate;
		System.out.println(winrate);
		System.out.println(sumWeight);
		}
		System.out.println(sumWeight);
		
	
      for (int i=0 ;i<=args.length;i++){
    	  
    	  System.out.println(args.length);  
    	  
    	  
      }

		
		
	}

}
