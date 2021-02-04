package desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	Cliente cliente = new Cliente(this);
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public void addItem(String nome, double preco, int quantidade) {
		addItem(new Item(nome, preco, quantidade));
	}
	
	public double obterValor() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
