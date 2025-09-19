package pacote;

import java.util.Scanner;

public class Cachorro {
	private String nome;
	private String cor;
	private boolean isTreinado;
	private String tamanho;
	
	
	public Cachorro(String nome,String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	
	
	public void isTreinado() {
		Scanner sc = new Scanner(System.in);
		System.out.print("O cachorro está treinado [S/N]: ");
		String resposta = sc.next();
		switch(resposta.toUpperCase()) {
		case "S" -> setTreinado(true);
		case "N" -> setTreinado(false);
		default -> {
			System.err.println("Resposta inválida!");
			isTreinado();
		}
		
		}
		
		
		
	}
	
	public void tamanho() {
		System.out.println("A raça do cachorro é " + tamanho);
	}
	
	public void compararCores(Cachorro c2) {
		System.out.printf("""
				A cor dos chachorros são:
				- %s
				- %s
				""",getCor(),c2.cor);
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	public void setTreinado(boolean isTreinado) {
		this.isTreinado = isTreinado;
	}

	public boolean getTreinado(){
		return this.isTreinado;
	}
	
	


	

}


/*
Escreva um programa Java para criar uma classe chamada Cachorro com variáveis ​​de instância nome e cor. Implemente um construtor parametrizado que receba nome e cor como parâmetros e inicialize as variáveis ​​de instância. Imprima os valores das variáveis.

Esta classe deve conter os seguintes métodos:
Um método para determinar se o cachorro está treinado.
Um método para comparar as cores de dois cachorros.
Um método para verificar se o cachorro é de raça grande.
* A definição de novos atributos está de acordo com o que o desenvolvedor julgar necessário.
*/