package pacote;

public class Main {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Pitty", "Caramelo");
		Cachorro c2 = new Cachorro("Raul", "Preto");
		
		c1.compararCores(c2);
		

		System.out.println(c1.getTreinado());
		System.out.println(c2.getTreinado());
		
		
		
		c1.isTreinado();
		

		System.out.println(c1.getTreinado());
		System.out.println(c2.getTreinado());
		
		c1.isTreinado();
		
		System.out.println(c1.getTreinado());
		System.out.println(c2.getTreinado());
	}
	
	
	
}
