package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String A = scan.next();

		if (A.equalsIgnoreCase(reverse(A))) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	}

	static String reverse(String original) {
		return new StringBuilder(original).reverse().toString();
	}

}
