package BOJ;
import java.util.*;
//제로   
public class BOJ_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++ ) {
			int getnum = sc.nextInt();
			if(getnum !=0) {
				stack.push(getnum);
			}
			else {
				stack.pop();
			}
		}
		
		while(stack.isEmpty()!=true) {
			
			result+= stack.pop();
		}
		System.out.println(result);
		
	}
}
