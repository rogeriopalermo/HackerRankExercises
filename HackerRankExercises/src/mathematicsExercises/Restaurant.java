package mathematicsExercises;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++ ) {
			int l1 = sc.nextInt();
			int l2 = sc.nextInt();
			int totalArea = l2 * l1;
			if (l1 < l2) {
				int aux = l1;
				l1 = l2;
				l2 = l1;
			}			
			int maxside = l2;
			int newArea = totalArea;
			int count = 0;
			
			while(newArea > 0) {
				
				newArea = newArea - (maxside * maxside);
				count++;		
				System.out.println("New Area: " + newArea + " | maxSide: " + maxside + " | count: " + count);
				if(newArea < 0) {
					newArea = totalArea;
					maxside--;
					count = 0;
				}
			}
			
			System.out.println(count);
			 
		}
	}

}
