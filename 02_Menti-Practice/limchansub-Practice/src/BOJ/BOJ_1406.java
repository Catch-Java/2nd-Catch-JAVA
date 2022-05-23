package BOJ;
import java.util.*;
public class BOJ_1406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> arr = new ArrayList<Character>();
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++ ) {
			arr.add(s.charAt(i));
		}
		
		ListIterator<Character> iter = arr.listIterator();
		
		while(iter.hasNext()) {
			iter.next();
		}
		int n = sc.nextInt();
		sc.nextLine();
		for(int i= 0; i<n;i++) {
			String get = sc.nextLine();
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
					iter.hasPrevious();
					iter.remove();
				}
				break;
			case 'P':
				System.out.print(get);
				char b = get.charAt(2);
				iter.add(b);
				break;
			default:
				break;
			
			}
			
		}
		for(char c: arr) {
			System.out.print(c);
		}
		
		
	}
}
