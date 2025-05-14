package Exercicio01.test;

import Exercicio01.dominio.Caixa;

public class CaixaTest01 {

	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa<>();
		Caixa<Integer> caixa1 = new Caixa<>();


		System.out.println(caixa.estaVazia());

		caixa.guardar("Palava");

		System.out.println(caixa.estaVazia());



		
		

	}

}
