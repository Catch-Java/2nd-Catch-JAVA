package BOJ;

import java.util.Stack;
import java.util.Scanner;

public class BOJ_10773 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		Scanner scanf = new Scanner(System.in);
		int k = scanf.nextInt();
		
		for(int i = 0; i < k; i++ ) 
		{
			int num = scanf.nextInt();
			
			if (num != 0)
				stack.push(num);
				
			else 
				stack.pop();
		}
		
		int sum = 0;
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);

	}

}
