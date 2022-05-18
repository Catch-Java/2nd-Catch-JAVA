package BOJ;
import java.util.*;

public class BOJ_2839 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		while(true) {
			if(N % 5 == 0) {
				result += N/5;
				System.out.println(result);
				break;
			}
			
			else {
				N -= 3;
				result++;
			//	System.out.println(result);
			}
			
			//if ( (N % 5) % 3 != 0) {
			//	System.out.println("-1");
			//	break;
			//}
			
			if (N<0) {
				System.out.println("-1");
				break;
			}
		}
		
	}

}
