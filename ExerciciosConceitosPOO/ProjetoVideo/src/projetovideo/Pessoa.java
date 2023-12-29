package projetovideo;

public abstract class Pessoa {
    // Atributos
    protected String nome, sexo;
    protected int idade, experiencia;
    
    // Método construtor
    public Pessoa (String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    // Método principal
    protected void ganharEXP () {
        this.setExperiencia(this.getExperiencia() + 1);
    }
    
    // ToString

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nExperiencia: " + experiencia;
    }
    
}