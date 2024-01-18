public class Passageiro {
	// Atributos
	private String nome;
	private long cpf;
	
	// Método construtor
	public Passageiro (String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Métodos getters e setters
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public long getCpf () {
		return cpf;
	}
	
	public void setCpf (int cpf) {
		this.cpf = cpf;
	}
}