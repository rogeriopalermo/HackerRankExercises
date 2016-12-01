package algorithmsExercises;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		String s = in.next();
		int cipher = in.nextInt();
		
		char[] array = s.toCharArray();
		
		int value = 0;
		for(char c : array) {
			if(((int)c) >= 97 &&((int)c) <= 122 ) {
				value = ((int)c)+(cipher%26);
				if(value > 122) {
						value = value - 26;						
				}
				c = ((char)value);
				System.out.print(c);
			}
			else if(((int)c) >= 65 &&((int)c) <= 90 ){
				value = ((int)c)+cipher;
				if(value > 90) {
						value = value - 26;
				}
				c = ((char)value);
				System.out.print(c);
			}
			else
				System.out.print(c);
		}
	}

}
