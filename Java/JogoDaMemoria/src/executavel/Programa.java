package executavel;

import java.util.Random;

import java.util.Scanner;

public class Programa {

	public static Random random = new Random();

	public static Scanner sc = new Scanner(System.in);

	public static final String VERTICAL = "|";

	public static final String HORIZONTAL = "    +---+---+---+---+";

	public static final int[][] tabelaResposta = { { 1, 1, 2, 2 }, { 3, 3, 4, 4 }, { 5, 5, 6, 6 }, { 7, 7, 8, 8 } };

	public static int[][] tabelaDoJogador = new int[4][4];

	public static int linha1;

	public static int linha2;

	public static int coluna1;

	public static int coluna2;

	public static int valor1;

	public static int valor2;

	public static void main(String[] args) {

		jogoDaMemoria();

	}

	public static void jogoDaMemoria() {

		aleatorizarTabela();

		do {

			limparVariaveis();

			exibirTabelaAtual();

			valor1 = lerPrimeiraCoordenada("Digite a linha e a coluna do primeiro valor:");

			if (valorJaEncontradoAnteriormente(valor1)) {

				System.out.println("Esse valor já foi encontrado! Tente novamente!");

				System.out.println();

				continue;

			}

			exibirTabelaParcial(linha1, coluna1);

			valor2 = lerSegundaCoordenada("Digite a linha e a coluna do segundo valor:");

			if (valorJaEncontradoAnteriormente(valor2)) {

				System.out.println("Esse valor já foi encontrado! Tente novamente!");

				System.out.println();

				continue;

			}

			tentarAtribuirValorNaTabelaAtual();

		} while (!fimDeJogo());

	}

// troca as posições de todos os valores da tabela resposta

	public static void aleatorizarTabela() {

		int aux;

		int linhaAleatoria;

		int colunaAleatoria;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				linhaAleatoria = random.nextInt(4);

				colunaAleatoria = random.nextInt(4);

				aux = tabelaResposta[i][j];

				tabelaResposta[i][j] = tabelaResposta[linhaAleatoria][colunaAleatoria];

				tabelaResposta[linhaAleatoria][colunaAleatoria] = aux;

			}

		}

	}

// termina o jogo caso toda a tabela do jogador seja preenchida

	public static boolean fimDeJogo() {

		int c = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				if (tabelaDoJogador[i][j] != 0) {

					c++;

				}

			}

		}

		return c == 16;

	}

// Retorna o primeiro valor e determina as coordenadas do primeiro valor da

// tabela

	public static int lerPrimeiraCoordenada(String texto) {

		boolean coordenadaValida = false;

		do {

			linha1 = 0;

			coluna1 = 0;

			System.out.println(texto);

			linha1 = sc.nextInt() - 1;

			coluna1 = sc.nextInt() - 1;

			if (coordenadaInvalida(linha1, coluna1)) {

				System.out.println("Coordenada Invalida! Tente novamente:");

				System.out.println();

				continue;

			}

			coordenadaValida = true;

		} while (!coordenadaValida);

		System.out.println();

		return tabelaResposta[linha1][coluna1];

	}

// Retorna o segundo valor e determina as coordenadas do segundo valor da tabela

	public static int lerSegundaCoordenada(String texto) {

		boolean coordenadaValida = false;

		do {

			linha2 = 0;

			coluna2 = 0;

			System.out.println(texto);

			linha2 = sc.nextInt() - 1;

			coluna2 = sc.nextInt() - 1;

			if (coordenadaInvalida(linha2, coluna2)) {

				System.out.println("Coordenada Invalida! Tente novamente:");

				System.out.println();

				continue;

			}

			if (coordenadasEscolhidasSaoIguais()) {

				System.out.println("As coordenadas escolhidas sao identicas! Tente novamente:");

				System.out.println();

				continue;

			}

			coordenadaValida = true;

		} while (!coordenadaValida);

		System.out.println();

		return tabelaResposta[linha2][coluna2];

	}

// Identifica se a coordenada é válida para a tabela

	public static boolean coordenadaInvalida(int linha, int coluna) {

		boolean linhaValida = linha >= 0 && linha < 4;

		boolean colunaValida = coluna >= 0 && coluna < 4;

		return !(linhaValida && colunaValida);

	}

	/*
	 * 
	 * Identifica se o valor escolhido já foi preenchido pelo jogador e recomeça a
	 * 
	 * leitura de coordenadas caso o valor tenha sido encontrado
	 * 
	 */

	public static boolean valorJaEncontradoAnteriormente(int valor) {

		boolean valorEncontrado = false;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				if (tabelaDoJogador[i][j] == valor) {

					valorEncontrado = true;

				}

			}

		}

		return valorEncontrado;

	}

// Reinicia todas as variáveis no início do loop do jogo

	public static void limparVariaveis() {

		linha1 = 0;

		linha2 = 0;

		coluna1 = 0;

		coluna2 = 0;

		valor1 = 0;

		valor2 = 0;

	}

// Identifica se as duas coordenadas escolhidas pertencem a mesma posição

	public static boolean coordenadasEscolhidasSaoIguais() {

		boolean linhasIguais = linha1 == linha2;

		boolean colunasIguais = coluna1 == coluna2;

		return linhasIguais && colunasIguais;

	}

// tenta atribuir os valores na tabela atual

	public static void tentarAtribuirValorNaTabelaAtual() {

		if (valor1 == valor2) {

			tabelaDoJogador[linha1][coluna1] = valor1;

			tabelaDoJogador[linha2][coluna2] = valor2;

		} else {

			exibirTabelaErrada(linha1, coluna1, linha2, coluna2);

		}

		System.out.println();

	}

// Exibe a versão mais atual da tabela para o utilizador

	public static void exibirTabelaAtual() {

		System.out.println("      1   2   3   4");

		System.out.println("      |   |   |   |");

		System.out.println(HORIZONTAL);

		for (int i = 0; i < 4; i++) {

			System.out.print((i + 1) + " - ");

			for (int j = 0; j < 4; j++) {

				System.out.print(VERTICAL);

				System.out.print(" " + (tabelaDoJogador[i][j] == 0 ? " " : tabelaDoJogador[i][j]) + " ");

			}

			System.out.println(VERTICAL);

			System.out.println(HORIZONTAL);

		}

		System.out.println();

	}

// Exibe a versão parcial da tabela, após o usuário ler a primeira coordenada

// lida

	public static void exibirTabelaParcial(int linha, int coluna) {

		System.out.println("      1   2   3   4");

		System.out.println("      |   |   |   |");

		System.out.println(HORIZONTAL);

		for (int i = 0; i < 4; i++) {

			System.out.print((i + 1) + " - ");

			for (int j = 0; j < 4; j++) {

				System.out.print(VERTICAL);

				if (i == linha && j == coluna) {

					System.out.print(" " + tabelaResposta[linha][coluna] + " ");

				} else {

					System.out.print(" " + (tabelaDoJogador[i][j] == 0 ? " " : tabelaDoJogador[i][j]) + " ");

				}

			}

			System.out.println(VERTICAL);

			System.out.println(HORIZONTAL);

		}

		System.out.println();

	}

// Exibe a tabela preenchida pelo usuario caso os valores encontrados nao sejam

// equivalentes

	public static void exibirTabelaErrada(int linha1, int coluna1, int linha2, int coluna2) {
		System.out.println("      1   2   3   4");

		System.out.println("      |   |   |   |");

		System.out.println(HORIZONTAL);

		for (int i = 0; i < 4; i++) {

			System.out.print((i + 1) + " - ");

			for (int j = 0; j < 4; j++) {

				System.out.print(VERTICAL);

				if (i == linha1 && j == coluna1) {

					System.out.print(" " + tabelaResposta[linha1][coluna1] + " ");

				} else if (i == linha2 && j == coluna2) {

					System.out.print(" " + tabelaResposta[linha2][coluna2] + " ");

				} else {

					System.out.print(" " + (tabelaDoJogador[i][j] == 0 ? " " : tabelaDoJogador[i][j]) + " ");

				}

			}

			System.out.println(VERTICAL);

			System.out.println(HORIZONTAL);

		}

	}

}