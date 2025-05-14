package dominio;

public class Caixa <T>{
	private T conteudo;
	
	
	public void adicionar(T item) {
		this.conteudo = item;
	}
	
	public T abrir() {
		return this.conteudo;
	}
	
}
