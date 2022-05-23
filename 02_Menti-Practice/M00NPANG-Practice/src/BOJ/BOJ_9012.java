package BOJ;

import java.util.Stack;
import java.util.Scanner;

public class BOJ_9012 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int T = scanf.nextInt();
		Stack<Character> stack = new Stack();
		String tar = scanf.nextLine();
		
		for (int i = 0; i < T; i++) {
			tar = scanf.nextLine();
			for (int j = 0; j < tar.length(); j++) {
				char c = tar.charAt(j);
				if(stack.isEmpty()) stack.push(c);
				else {
					if(c == ')') {
						if(stack.peek() == '(') {
							stack.pop();
						}
						else {
							stack.push(c);
						}
					}
					else {
						stack.push(c);
					}
				}
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}