// Classe abstrata Employee, que servirá apenas de superclasse

public abstract class Employee {
    
    // Variáveis de instância
    private final String nome;
    private final String sobrenome;
    private final String numeroDeSeguranca;
    private final Date dataAniversario;

    // Método construtor
    public Employee (String nome, String sobrenome, String numeroDeSeguranca, int diaA, int mesA, int anoA) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroDeSeguranca = numeroDeSeguranca;
        dataAniversario = new Date(diaA, mesA, anoA);

    }

    // Métodos get
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumeroDeSeguranca() {
        return numeroDeSeguranca;
    }

    public String getDataAniversario() {
        return dataAniversario.toString();
    }

    public int getMesAniversario() {
        return dataAniversario.getMes();
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("%s %s\nNumero de Seguranca: %s\nData de aniversário: %s", nome, sobrenome,numeroDeSeguranca, dataAniversario.toString());
    }

    // Método abstrato que será implementado pelas classes filhas
    public abstract double ganhos();

}