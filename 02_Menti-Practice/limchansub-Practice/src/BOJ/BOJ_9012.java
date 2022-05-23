package BOJ;
import java.util.*;
//괄호 
public class BOJ_9012 {
	
	   public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int check=0;
	      sc.nextLine();
	      for (int i = 0; i<n;i++) {
	         String par = sc.nextLine();
	         for (int j = 0; j<par.length();j++) {
	            char c =par.charAt(j);
	            if(c =='(') {
	               check++;
	            }else if(c==')'){
	               check--;
	               if(check<0) {
	                  break;
	               }
	            }
	         }
	         
	         
	         if(check!=0) {
	            System.out.println("NO");
	         }else {
	            System.out.println("YES");
	         }
	         check=0;
	      }
	      
	      
	   }
}
