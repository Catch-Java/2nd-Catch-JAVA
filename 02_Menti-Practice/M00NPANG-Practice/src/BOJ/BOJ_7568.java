package BOJ;

import java.io.*;
import java.security.Permission;
import java.util.*;

class Person {
	int weight;
	int height;
	int rank = 1;
	
	public Person(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
}


public class BOJ_7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Person> List = new ArrayList<Person>();
		
		for (int i = 0; i < N ; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			List.add(i, new Person(weight, height));
			
		}
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++) {
				if (List.get(i).weight > List.get(j).weight)
					if (List.get(i).height > List.get(j).height)
						List.get(j).rank++;
			}
		
		for (Person a : List) {
			bw.write(Integer.toString(a.rank)+" ");
		}
		
		bw.close();
		br.close();

	}

}
