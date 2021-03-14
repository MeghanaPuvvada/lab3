package lab3;
import java.util.*;
public class StringAlter {

	public static String alterString(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
		char c;
		if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o' && s.charAt(i)!='u') {
		if(s.charAt(i)=='z') {
		c='a';
		}
		else {
		c=(char) (s.charAt(i)+1);
		}
		}
		else {
		c=s.charAt(i);
		}
		str+=c;
		}
		return str;
		}
		public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String ss=alterString(s);
		System.out.println(ss);
		}
}
