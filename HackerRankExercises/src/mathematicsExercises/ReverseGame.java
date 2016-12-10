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

			int[] newArray = reverseArray(array);
			
			for(int value : newArray) {
				System.out.println("New Array: " + value);
			}

			int count = 0;

			for (int value : newArray) {
				if (auxiliarValorIndex == value) {
					break;
				}
				count++;
			}
			System.out.println(count);

		}
	}

	public static int[] reverseArray(int[] array) {
		int[] newArray = new int[array.length];
		int closestTo0Index = 0;
		int closestToNIndex = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				newArray[i] = array[closestToNIndex];
				closestToNIndex -= 1;
			} else if (i%2==1) {
				newArray[i] = array[closestTo0Index];
				closestTo0Index += 1;
			}
		}
		return newArray;
	}
}
