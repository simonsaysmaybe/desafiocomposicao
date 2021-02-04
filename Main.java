package desafio;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Matheus");
		Compra compra1 = new Compra();
		
		compra1.addItem("Caneta", 0.98, 4);
		compra1.addItem("Caderno", 17.99, 2);
		compra1.addItem("Lápis", 0.75, 8);
		
		cliente1.addCompra(compra1);
		
		System.out.println(cliente1.compras.get(0).itens.get(0).produto);
		System.out.println(cliente1.compras.get(0).itens.get(1).produto);
		System.out.println(cliente1.compras.get(0).itens.get(2).produto);
		
		Compra compra2 = new Compra();
		
		compra2.addItem("Borracha", 2.75, 2);
		compra2.addItem("Corretivo", 4.50, 1);
		
		
		cliente1.addCompra(compra2);
		
		System.out.println(cliente1.compras.get(1).itens.get(0).produto);
		System.out.println(cliente1.compras.get(1).itens.get(1).produto);
		
		System.out.println(cliente1.obterValorTotal());
	}

}
