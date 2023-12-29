package projetovideo;

public class Usuario extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;
    
    // Método construtor
    public Usuario (String nome, String login, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // Métodos getters e setters
    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    // ToString

    @Override
    public String toString() {
        return "=============================================\n" + 
                super.toString() + 
                "\nLogin: " + login + 
                "\nTotal assistido: " + totAssistido +
                "\n=============================================\n";
    }
    
}