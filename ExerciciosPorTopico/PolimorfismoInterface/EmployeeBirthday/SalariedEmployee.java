// Classe concreta filha de Employee

public class SalariedEmployee extends Employee {
    
    // Variável de instância
    private double salarioSemanal;

    // Método construtor
    public SalariedEmployee (String nome, String sobrenome, String numeroDeSeguranca, int diaA, int mesA, int anoA, double salarioSemanal) {
        
        super(nome, sobrenome, numeroDeSeguranca, diaA, mesA, anoA);

        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        this.salarioSemanal = salarioSemanal;

    }

    // Métodos get e set
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal (double salarioSemanal) {

        if (salarioSemanal <  0.0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        this.salarioSemanal = salarioSemanal;

    }

    // Método implementado da superclasse abstrata
    @Override
    public double ganhos() {
        return getSalarioSemanal();
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Salaried employee: %s\nSalário semanal: R$%.2f", super.toString(), getSalarioSemanal());
    }

}