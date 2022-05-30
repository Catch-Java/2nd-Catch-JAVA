package programmers;

import java.util.*;

public class PG_68935 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int N = scanf.nextInt();
		int answer = 0;
		
		List<Integer> num =new ArrayList<Integer>();
		 
		while(N != 0) {
			 num.add(N%3);
			 N = N/3;
		}
		
		for (int i = 0; i < num.size(); i++) {
			answer += power(num.get(i), (num.size()-i));
		}
		System.out.println(answer);
	}
	
	static int power(int n , int pv) {
		int result = n;
		
		if (pv == 1)return n;
		for (int i = pv ; i > 1; i--) {
			result *= 3;
		}return result;
	}
	

}
