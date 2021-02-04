package desafio;

public class Produto {
	String nome;
	double preco;
	Item item;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return nome;
		
	}
}
