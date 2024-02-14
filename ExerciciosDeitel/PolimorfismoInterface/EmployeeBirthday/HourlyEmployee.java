// Classe concreta filha de Employee

public class HourlyEmployee extends Employee {

    // Variáveis de instância
    private double salarioPorHora;
    private double horas;

    // Método construtor
    public HourlyEmployee (String nome, String sobrenome, String numeroDeSeguranca, int diaA, int mesA, int anoA, double salarioPorHora, double horas) {

        super(nome, sobrenome, numeroDeSeguranca, diaA, mesA, anoA);

        if (salarioPorHora < 0.0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        if (horas < 0 || horas > 168.0) {
            throw new IllegalArgumentException("A quantidade de horas trabalhadas deve estar no intervalo [0, 168]");
        }

        this.salarioPorHora = salarioPorHora;
        this.horas = horas;

    }

    // Métodos get e set
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setSalarioPorHora (double salarioPorHora) {

        if (salarioPorHora < 0.0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        this.salarioPorHora = salarioPorHora;

    }

    public void setHoras (double horas) {

        if (horas < 0.0 || horas > 168) {
            throw new IllegalArgumentException("A quantidade de horas trabalhadas deve estar no intervalo [0, 168]");
        }

        this.horas = horas;

    }

    // Método implementado da classe abstrata
    @Override
    public double ganhos() {
        if (horas <= 40) { // Não fez hora extra
            return getSalarioPorHora() * getHoras();
        } else {
            return ((getHoras() - 40) * getSalarioPorHora() * 1.5) + (40 * getSalarioPorHora());
        }
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Hourly employee: %s\nSalário por hora: R$%.2f\nHoras trabalhadas: %.2f", super.toString(), getSalarioPorHora(), getHoras());
    }

}