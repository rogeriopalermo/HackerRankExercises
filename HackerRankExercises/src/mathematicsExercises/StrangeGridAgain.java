package mathematicsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StrangeGridAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int columnSize = 5;
		
		long rowNumber = sc.nextInt();
		long columnNumber = sc.nextInt();
		long value = 0;
		if(rowNumber % 2 == 0) {
			value = (rowNumber) * 5 - ((columnSize - (columnNumber -1))*2) + 1;
		} else {
			value = (rowNumber + 1) * 5 - ((columnSize - (columnNumber -1))*2);
		}	
		
		System.out.println(value);
	}
}
