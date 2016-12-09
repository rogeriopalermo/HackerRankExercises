package mathematicsExercises;

import java.util.Scanner;

public class SherlockAndMovingTiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextInt();
		long s1 = sc.nextInt();
		long s2 = sc.nextInt();
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			long qx = sc.nextInt();
			System.out.println(calcula(qx, L, s1, s2));
		}
	}

	private static double calcula(long qx, long side, long s1, long s2) {
		// TODO Auto-generated method stub
		 
		if (s1 < s2) {
			long aux = s1;
			s1 = s2;
			s2 = aux;
		}
		double initialOverlappedDiagonal = side*Math.sqrt(2);
		double speed = Math.abs(s1 - s2);
		double finalOverlappedDiagonal = Math.sqrt(qx) * Math.sqrt(2);
		
		return (initialOverlappedDiagonal - finalOverlappedDiagonal) / speed;			
	}

}
