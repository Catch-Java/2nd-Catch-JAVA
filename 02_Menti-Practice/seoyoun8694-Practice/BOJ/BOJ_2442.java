package BOJ;

import java.util.*;

public class BOJ_2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int k=N-1; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}