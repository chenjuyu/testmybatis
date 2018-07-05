package sy.test;

import java.text.DecimalFormat;



public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array1 ="200.000,100.000";
		String[] ary= array1.split(",");
		  float[] score  =new float[ary.length];
		    
		 // String newNumber=dnf.format(testnumber);
      		for (int i=0;i<ary.length;i++){   
      			score[i]=Float.valueOf(ary[i]);
      			System.out.println( String.valueOf(score[i]));
      		}
      		   
      	   }

	

}
