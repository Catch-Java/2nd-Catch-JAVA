package BOJ;

import java.util.*;
public class BOJ_2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i <= n;i++) {
			
			
			for(int j =i;j < n;j++) {
				System.out.print(" ");
			}
			for(int k =i*2-1; k > 0 ;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
