package javaExercises;

import java.util.Scanner;

public class JavaIfandElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a%2==1) {
			System.out.println("Weird");
		}
		else if (a%2 == 0 && 2 <= a && a <= 5) {
			System.out.println("Not Weird");
		}
		else if (a%2 == 0 && 6 <= a && a <= 20) {
			System.out.println("Weird");
		}
		else if (a%2 == 0 && a > 20) {
			System.out.println("Not Weird");
		}
	}
}
