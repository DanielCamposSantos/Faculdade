package executavel.exercicio08;

import java.util.Arrays;
import java.util.Scanner;

public class Programa {
static Scanner sc = new Scanner(System.in);
static String palavra1;
static String palavra2;


	public static void main(String[] args) {
		System.out.print("Digite a primeira palavra:");
		palavra1 = sc.nextLine();
		
		System.out.print("Digite a segunda palavra:");
		palavra2 = sc.nextLine();
		
		char[] vet1 = gerarVet(palavra1);
		char[] vet2 = gerarVet(palavra2);
		
		System.out.println(Arrays.toString(vet1));
		System.out.println(Arrays.toString(vet2));
	

	}
	
	
	public static void verificarAnagrma() {
		
	}
	
	
	public static char[] gerarVet(String palavra) {
		char[] vet = new char[palavra.length()];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = palavra.charAt(i);
		}
		return vet;
	}
	
	
	
	
	
	
	
	public static void lerVetor() {
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.next().charAt(0);
		}
	}

}

/*
 * 8. Escreva um programa que leia duas cadeias de até 10 caracteres cada uma e
 * verifica se elas são anagramas, imprimindo a mensagem correspondente. Obs:
 * anagramas: palavras que tem as mesmas letras Ex: ALMA e LAMA são anagramas
 * BOLA e LOBO não são anagramas
 */