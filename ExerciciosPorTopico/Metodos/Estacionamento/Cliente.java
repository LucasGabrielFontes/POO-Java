public class Cliente {
	// Atributos
	private int codigo;
	private int horas;
	private int minutos;
	private double valorAP;
	
	// Método construtor
	public Cliente (int codigo, int horas, int minutos) {
		this.codigo = codigo;
		this.horas = horas;
		this.minutos = minutos;
	}
	
	// Métodos getters e setters 
	public int getCodigo () {
		return codigo;
	}
	
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	
	public double getValorAP () {
		return valorAP;
	}
	
	public void setValorAP (double valorAP) {
		this.valorAP = valorAP;
	}
	
	public int getHoras () {
		return horas;
	}
	
	public void setHoras (int horas) {
		this.horas = horas;
	}
	
	public int getMinutos () {
		return minutos;
	}
	
	public void setMinutos (int minutos) {
		this.minutos = minutos;
	}
	
	// Método Principal
	public void calculaValorAP () {
		this.valorAP = 2 + (this.horas-3)*0.5;
		if (this.minutos > 0) {
			this.valorAP += 0.5;
		}
	}
}