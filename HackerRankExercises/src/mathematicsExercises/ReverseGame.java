package mathematicsExercises;

import java.util.Collections;
import java.util.Scanner;

public class ReverseGame {
	
//	0 1 2 3 4 5 6		0 1 2 3 4 5 6 7 8 9 
//						9 8 7 6 5 4 3 2 1 0
//	6 5 4 3 2 1 0		9 0 1 2 3 4 5 6 7 8
//						9 0 8 7 6 5 4 3 2 1
//	6 0 1 2 3 4 5		9 0 8 1 2 3 4 5 6 7
//						9 0 8 1 7 6 5 4 3 2
//	6 0 5 4 3 2 1 		9 0 8 1 7 2 3 4 5 6
//						9 0 8 1 7 2 6 5 4 3
//	6 0 5 1 2 3 4		9 0 8 1 7 2 6 3 4 5
//						9 0 8 1 7 2 6 3 5 4
//	6 0 5 1 4 3 2
//
//	6 0 5 1 4 2 3
//
//	pattern (n-1) (n0) (n-2) (n1) (n-3) (n2) (n-4) (n3)...(n/2)

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
