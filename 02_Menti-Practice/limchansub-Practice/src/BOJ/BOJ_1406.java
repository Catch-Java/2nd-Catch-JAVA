package BOJ;
import java.io.*;
import java.util.*;
//에디터  
public class BOJ_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> arr = new LinkedList<Character>();
		String s = bf.readLine();
		for(int i=0;i<s.length();i++ ) {
			arr.add(s.charAt(i));
		}
		
		ListIterator<Character> iter = arr.listIterator();
		
		while(iter.hasNext()) {
			iter.next();
		}
		int n = Integer.parseInt(bf.readLine());  
		for(int i= 0; i<n;i++) {
			String get = bf.readLine();
			switch(get.charAt(0)) {
			case 'L':
				if(iter.hasPrevious()) {
					iter.previous();
				}
				break;
			case 'D':
				if(iter.hasNext()) {
					iter.next();
				}
				break;
			case 'B':
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			case 'P':
				char b = get.charAt(2);
				iter.add(b);
				break;
			default:
				break;
			
			}
			
		}
		for(char c: arr) {
			bw.write(c);
		}
		bf.close();
		bw.close();
		
	}
}
