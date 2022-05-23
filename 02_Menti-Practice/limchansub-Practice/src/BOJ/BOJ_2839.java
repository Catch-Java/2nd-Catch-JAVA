package BOJ;
import java.util.*;
//설탕배달 
public class BOJ_2839 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int n = sc.nextInt();
	      
	      int result=-1; 
			
	      if(n%5==0) {
	    	  result = n/5; 
	      } 
	      else {
	    	  for(int i=1; i <= n/5 ; i++) {
	    		  if((n-i*5)% 3==0) {
	    			  result = i+(n-i*5)/3; 
	    		  }
	    	  }
	    	  if(result==-1 && n%3 == 0) {
  			  result = n/3; 
  		  }
	      }
	      
	      
	      System.out.println(result);
	  }
}
