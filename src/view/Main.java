package view;

import controller.ThreadMatriz;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[][] mat = new int[3][5];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++) {
				mat[i][j] = random.nextInt(101);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println("\n");
		}
		
		for(int i = 0; i < 3; i++) {
			int[] vet = mat[i];
			Thread t = new ThreadMatriz(vet, i + 1);
			t.start();
			
		}

	}
}