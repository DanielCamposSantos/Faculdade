package executavel.exercicio07;

import java.util.Arrays;
import java.util.Scanner;

public class Programa {
	static Scanner sc = new Scanner(System.in);
	static int[] array1 = new int[5];
	static int[] array2;

	static boolean achou = false;

	public static void main(String[] args) {
		lerArray();

		gerarSegundoVetor();

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

	public static void lerArray() {
		for (int i = 0; i < 5; i++) {
			array1[i] = sc.nextInt();
		}
	}

	public static void gerarSegundoVetor() {
		boolean achou = false;
		int varControle = array1[0];
		int c = 0;
		for (int i = 1; i < 5; i++) {
			
			if (varControle == array1[i]) {
				achou = true;
			}
			
			if (achou) {
				array2[c] = varControle;
				varControle = array1[i];
				System.out.println("" + array2[c] + " ");
			}
			
			
			
			
		}

	}

}

/*
 * 
 * 1 1 1 2 3 varControle = 1
 * 
 * 1 == 1;
 * 
 * 
 * 
 * 
 */
/*
 * 7. Fazer um programa para ler uma sequência de até 20 números inteiros e
 * positivos, e armazená-los em um vetor. Em seguida deve ser gerado um segundo
 * vetor contendo todos os elementos da sequência lida, sem repetições. No
 * final, o programa deverá imprimir as duas sequências.
 */