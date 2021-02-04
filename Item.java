package desafio;

public class Item {
	
	Produto produto;
	int quantidade;
	
	public void addProduto(Produto produto) {
		this.produto = produto;
	}
	
	Item(String nome, double preco, int quantidade){
		addProduto(new Produto(nome, preco));
		this.quantidade = quantidade;
		produto.item = this;
	}
	

	
	
}
