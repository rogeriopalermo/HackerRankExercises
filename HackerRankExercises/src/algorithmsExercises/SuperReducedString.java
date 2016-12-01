package algorithmsExercises;

import java.util.Scanner;

public class SuperReducedString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();

		value = deleteAdjacentPairs("acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj");

		if (value.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(value);
		}
	}

	public static String deleteAdjacentPairs(String n) {
		
		StringBuilder s = new StringBuilder(n);
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				s.delete(i-1, i+1);
				i=0;
			}
		}
		
		for (int i = 1; i < n.length(); i++) {
			if(n.charAt(i) == n.charAt(i-1)) {
				System.out.println("i = " + i);
				n = n.substring(0, i-1) + n.substring(i+1);
				i=0;
				System.out.println(n);
			}
		}

		return s.toString();
	}
}
