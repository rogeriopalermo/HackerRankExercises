package algorithmsExercises;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		String[] array = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			array[i] = sc.next();
		}
		
		boolean funny = true;
		for(String s : array) {
			StringBuilder newS = new StringBuilder(s);
			String reversedS = newS.reverse().toString();
			System.out.println(reversedS);
			for(int i = 1; i<s.length(); i++) {
				if((Math.abs(((int)s.charAt(i))-((int)s.charAt(i-1)))) == Math.abs(((int)reversedS.charAt(i))-((int)reversedS.charAt(i-1)))) {
					continue;
				} else {
					funny = false;
					break;
				}
			}
			if(funny) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
			funny = true;
		}
	}

}
