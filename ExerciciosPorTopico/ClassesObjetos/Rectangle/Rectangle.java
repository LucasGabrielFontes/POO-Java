public class Rectangle {
	
	// Atributos
	private double comprimento = 1;
	private double largura = 1;
	
	// Métodos get e set
	public double getComprimento () {
		return comprimento;
	}
	
	public void setComprimento (double comprimento) {
		if (comprimento < 0 || comprimento > 20) {
			throw new IllegalArgumentException("comprimento deve estar no intervalo [0, 20]");
		} else {
			this.comprimento = comprimento;
		}
	}
	
	public double getLargura () {
		return largura;
	}
	
	public void setLargura (double largura) {
		if (largura < 0 || largura > 20) {
			throw new IllegalArgumentException("largura deve estar no intervalo [0, 20]");
		} else {
			this.largura = largura;
		}
	} 
	
	// Métodos principais
	public double calculaPerimetro () {
		return (this.comprimento*2 + this.largura*2);
	}
	
	public double calculaArea () {
		return (this.comprimento * this.largura);
	}
	
}