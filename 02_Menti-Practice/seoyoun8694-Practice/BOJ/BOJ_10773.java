package BOJ;
import java.util.Stack;
import java.util.Scanner;

public class BOJ_10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i < K; i++) {
			int num = sc.nextInt();
			
			if (num == 0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}

		while(stack.isEmpty() != true) {
	          result += stack.pop();
	    }
		
		System.out.println(result);
	}
}
