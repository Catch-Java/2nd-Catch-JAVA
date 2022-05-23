package BOJ;
import java.util.*;

public class BOJ_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String PS = sc.nextLine();
		int result = 0;
		
		for(int i = 0; i < PS.length(); i++) {
			//String[] arr = PS.split("");
			
			if(PS.charAt(i) == '(') {
				result += 1;
			}
			
			else if(PS.charAt(i) == ')') {
				result -= 1;
			}
			
		}
		
		if (result == 0) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
	}

}
