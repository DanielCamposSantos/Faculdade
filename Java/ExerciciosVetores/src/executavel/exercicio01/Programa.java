package executavel.exercicio01;

import java.util.Iterator;
import java.util.Scanner;

public class Programa {
	
	static Scanner sc = new Scanner(System.in);
	static int[][] matriz3 = new int[3][2];
	
	
	public static void main(String[] args) {
		int[][] matriz1 = new int[3][2];
		int[][] matriz2 = new int[3][2];
		
		System.out.println("LENTO PRIMEIRA MATRIZ");
		lerValores(matriz1);
		
		System.out.println("LENDO SEGUNDA MATRIZ");
		lerValores(matriz2);
		
		calcularMatrizSoma(matriz1, matriz2);
		
		System.out.println("PRIMEIRA MATRIZ");
		imprimirMatriz(matriz1);
		
		System.out.println("SEGUNDA MATRIZ");
		imprimirMatriz(matriz2);
		
		System.out.println("SOMA DAS MATRIZES");
		imprimirMatriz(matriz3);
		
		
	}
	
	
	public static void lerValores(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite o valor da posição [%d,%d]:",i+1,j+1);
				matriz[i][j] = sc.nextInt();
				
			}
		}
		System.out.println();
	}
	
	
	public static void calcularMatrizSoma(int[][] matriz1, int[][] matriz2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				
			}
		}
		System.out.println();
	}
	
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
