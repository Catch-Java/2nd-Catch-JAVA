package BOJ;

import java.util.*;

public class BOJ_2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1=1;
		int f2=1;
		int sum=0;
		if(n==1) {
			sum=f1;
		}else if(n==2) {
			sum=f2;
		}
		else {
			for(int i=2;i<n;i++) {
				sum = f2+ f1;
				f1=f2;
				f2=sum;
			}
		}
		
		System.out.println(sum);
	}
}