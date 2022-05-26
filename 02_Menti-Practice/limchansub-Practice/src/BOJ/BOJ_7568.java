package BOJ;
import java.util.*;
import java.io.*;
class Person{
	int weight;
	int height;
	int rank=1;
	public Person(int weight2, int height2) {
		weight =weight2;
		height =height2;
	}
	
	
}
public class BOJ_7568 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Person> arr = new LinkedList<Person>();
		int n = Integer.parseInt(bf.readLine());
		for(int i =0 ; i<n ;i++) {
			String s =bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			arr.add(new Person(weight,height));
			
		}
		for(int i =0 ; i<n ;i++) {
			for(int j =0 ; j<n ;j++) {
				if( arr.get(i).weight > arr.get(j).weight) {
					if(arr.get(i).height > arr.get(j).height) {
						arr.get(j).rank++;
					}
				}
			}
			
		}
		
		
		for(Person a : arr) {
			bw.write(Integer.toString(a.rank)+" ");
		}
		bw.close();
		bf.close();
	}

}
