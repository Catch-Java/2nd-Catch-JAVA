package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		LinkedList<Character> List = new LinkedList<>();
		
		String string = br.readLine();
		for(int i=0 ; i<string.length() ; i++) {
			List.add(string.charAt(i));
		}
		
		int num = Integer.parseInt(br.readLine());
		
		ListIterator<Character> listIter = List.listIterator();
		
		while (listIter.hasNext())
			listIter.next();
		
		for (int i = 0; i < num ; i++) {
			
			String s = br.readLine();
			char c =  s.charAt(0);
			switch(c) {
			case 'L' :
				if (listIter.hasPrevious())
					listIter.previous(); 
				break;
					
			case 'D' :
				if (listIter.hasNext())
					listIter.next();
				break;
			
			case 'B' :
				if (listIter.hasPrevious()) {
					listIter.previous();
					listIter.remove();
				}
				break;
			
			case 'P' :
				char ca = s.charAt(2);
				listIter.add(ca);
				break;
				
			default :
				break;
				
			}
		}
		
		for (char c : List)
			bw.write(c);
		
		bw.flush();
		bw.close(); 
		
	} 
}
