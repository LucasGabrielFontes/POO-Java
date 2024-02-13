// Declaração de uma classe abstrata (não pode ser instanciada) que implementa a interface Payable

public abstract class Employee implements Payable {
    
    // Variáveis de instância
    private final String nome;
    private final String sobrenome;
    private final String numeroDeSeguranca;

    // Método construtor
    public Employee (String nome, String sobrenome, String numeroDeSeguranca) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroDeSeguranca = numeroDeSeguranca;

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

    // Método toString (retorna uma representação em String do objeto)
    @Override
    public String toString (){
        return String.format("Nome: %s %s\nNúmero de segurança: %s", getNome(), getSobrenome(), getNumeroDeSeguranca());
    }

    // OBS: como a classe é abstrata, é possível não implementar o método da interface aqui. Do contrário, haveria erro de compilação.

}