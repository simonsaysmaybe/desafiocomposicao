package desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	Compra compra;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	Cliente(Compra compra){
		this.compra = compra;
	}
	
	public void addCompra(Compra compra) {
		compras.add(compra);
	}
	
	public double obterValorTotal() {
		double valorTotal = 0;
		
		for(Compra compra: compras) {
			valorTotal += compra.obterValor();
		}
		
		return valorTotal;
	}
	
}
