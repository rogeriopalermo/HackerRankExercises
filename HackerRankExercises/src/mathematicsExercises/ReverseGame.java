package mathematicsExercises;

import java.util.Collections;
import java.util.Scanner;

public class ReverseGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int[] array = new int[sc.nextInt()];

			for (int j = 0; j < array.length; j++) {
				array[j] = j + 1;
			}

			int index = sc.nextInt();
			int auxiliarValorIndex = array[index];

			int[] newArray = reverseArrayFromIndex(array);

			int count = 0;
			
			
			for (int value : newArray) {
				if(auxiliarValorIndex == value) {
					break;
				}
				count++;
			}
			System.out.println(count);

		}
	}

	public static int[] reverseArrayFromIndex(int[] array) {
		int[] newArray = new int[array.length];
		int alt = 2;
		int aux = 1;
		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {			
				newArray[j] = array[array.length  - aux];
				aux++;
			}
			
			for (int c = 0; c < array.length; c++) {
				array[c] = newArray[c]; 
			}
			
			aux = 1;
			alt++;
		}

		return newArray;
	}

}
