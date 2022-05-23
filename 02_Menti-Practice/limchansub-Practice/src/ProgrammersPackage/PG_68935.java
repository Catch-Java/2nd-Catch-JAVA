package ProgrammersPackage;
import java.util.*;
//3진수 
public class PG_68935 {
	
	public int solution(int n) {
        int answer = 0;
			ArrayList<Integer> arr =new ArrayList<Integer>();
			while(n>0) {
				arr.add(n%3);
				n= n/3;
			}
			System.out.println(arr);
			for (int i = 0; i < arr.size(); i++) {
				answer += arr.get(i) * Math.pow(3 ,arr.size()-i-1);
			}
			//System.out.println(answer);
	        return answer;
 }
	public static void main(String[] args){
    
		PG_68935 pg =new PG_68935();
		pg.solution(125);
      
	}
}
