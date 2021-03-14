package lab3;

import java.util.*;
public class StringTokenizerDemo {

	public static void main(String args[]) {
		int stringToInt;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap in between:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			stringToInt = Integer.parseInt(temp);
			System.out.println(stringToInt);
			sum += stringToInt;
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}
		


}
