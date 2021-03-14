package lab3;
import java.util.*;
public class MirrorImage {

		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String s=sc.nextLine();
			int n=s.length();
			StringBuffer sb=new StringBuffer(n);
			sb.insert(0, s);
			sb.reverse();
			System.out.println(s+"|"+sb);
			sc.close();
			}	
}

