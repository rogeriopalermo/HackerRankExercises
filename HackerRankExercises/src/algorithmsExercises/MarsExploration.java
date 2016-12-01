package algorithmsExercises;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S = in.next();
				
		int sQuantity = S.length()/3 * 2;
		int oQuantity = S.length()/3 * 1;
		
		int sQuantityAuxiliar = 0;
		int oQuantityAuxiliar = 0;
		
		for(int i = 0; i < S.length(); i=i+3 ){
			if(S.charAt(i)=='S') {
				sQuantityAuxiliar++;
			}
			if(S.charAt(i+1) == 'O'){
				oQuantityAuxiliar++;
			}
			if(S.charAt(i+2)=='S') {
				sQuantityAuxiliar++;
			}
		}
		
		System.out.println(sQuantity - sQuantityAuxiliar + oQuantity - oQuantityAuxiliar);
	}
}
