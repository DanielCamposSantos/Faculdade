package executavel.exercicio02;

import java.util.Scanner;

public class Programa {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] matriz = new int[5][2];
		
		
		System.out.println("LENDO VALORES");
		lerValores(matriz);
		
		
		
		
		imprimirMatriz(matriz);
		
		
		
		
		
		
		System.out.println("A SOMA DOS VALORES E" + somaDaMatriz(matriz) );
		
		
		
		
	}
	
	public static void lerValores(int[][] matriz) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite o valor da posição [%d,%d]:",i+1,j+1);
				matriz[i][j] = sc.nextInt();
				
			}
		}
		System.out.println();
	}
	
	public static int somaDaMatriz(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				soma += matriz[i][j];
				
			}
		}
		return soma;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
	}
	
}
