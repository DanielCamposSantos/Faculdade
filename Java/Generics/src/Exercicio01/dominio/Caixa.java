package Exercicio01.dominio;

public class Caixa <T>{
	private T conteudo;
	
	
	public void guardar(T item) {
		this.conteudo = item;
	}
	
	public T abrir() {
		return this.conteudo;
	}

	public boolean estaVazia(){
		return conteudo == null;
	}
	
}
