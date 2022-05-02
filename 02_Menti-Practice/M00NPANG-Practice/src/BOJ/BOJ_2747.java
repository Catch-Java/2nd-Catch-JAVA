package BOJ;

import java.util.Scanner;

public class BOJ_2747 {

	public static int fib(int n) {
		int result ;
		
		if (n <= 2) 
			return 1;
		else
			result = fib(n-1)+ fib(n-2);
		
		return result;
	}
	
	public static void main(String[] args) {
		int result;
		Scanner scanf = new Scanner(System.in);
			int num = scanf.nextInt();
			result = fib(num);
			
			System.out.print(result);
	}
}
