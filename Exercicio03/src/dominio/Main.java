package dominio;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João",30,"Médico");
        Pessoa p2 = new Pessoa("Maria",23,"Estudante");


        System.out.println("|----------Pessoas----------|");
        System.out.println("Primeira Pessoa");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Profissão: " + p1.profissao);
        System.out.println();
        System.out.println("Segunda Pessoa");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("Profissão: " + p2.profissao);

    }
}