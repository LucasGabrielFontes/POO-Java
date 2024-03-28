public class Produto {
	// Atributos
	private int numero;
	private double preco;
	
	// Método construtor
	public Produto (int numero, double preco) {
		this.numero = numero;
		this.preco = preco;
	}
	
	// Métodos getters e setters
	public int getNumero () {
		return numero;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public double getPreco () {
		return preco;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
}