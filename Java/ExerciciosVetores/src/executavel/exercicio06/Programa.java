package executavel.exercicio06;

import java.util.Scanner;

public class Programa {
	static int[] array = new int[10];
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		lerVetores();
		System.out.println();
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		int achou = -1;
		
		for (int i = 0; i < 10; i++) {
			if(array[i] == n) {
				achou = i;
				System.out.println(n + " foi encontrado na posição [" + achou + "]");
			}
		}
		
		System.out.println();
		
		
	}
	
	
	public static void lerVetores() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + i + " valor: ");
			array[i] = sc.nextInt();
		}
	}
}
/*
 * 6. Fazer um programa que leia um vetor de 10 posições e um valor N. Após
 * pesquise se existe o valor N no vetor lido. Se o valor for encontrado, deve
 * ser impressa a posição do numero no vetor (Índice). Se o valor não foi
 * encontrado, deve ser impressa uma mensagem.
 */