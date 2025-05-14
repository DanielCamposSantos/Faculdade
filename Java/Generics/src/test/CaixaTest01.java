package test;

import dominio.Caixa;

public class CaixaTest01 {

	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa();
		Caixa<Integer> caixa1 = new Caixa();
		
		caixa.adicionar("TESTE");
		caixa1.adicionar(1);
		System.out.println(caixa.abrir());
		System.out.println(caixa1.abrir());
		
		
		

	}

}
