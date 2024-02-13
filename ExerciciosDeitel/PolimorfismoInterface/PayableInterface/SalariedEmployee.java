// Declaração de uma classe concreta que estende a classe abstrata Employee e, consequentemente, implementa a interface Payable

public class SalariedEmployee extends Employee {
    
    // Variáveis de instância
    private double salarioSemanal;

    // Método construtor
    public SalariedEmployee (String nome, String sobrenome, String numeroDeSeguranca, double salarioSemanal) {

        super(nome, sobrenome, numeroDeSeguranca);

        if (salarioSemanal < 0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        this.salarioSemanal = salarioSemanal;

    }

    // Métodos get e set
    public void setSalarioSemanal (double salarioSemanal) {

        if (salarioSemanal < 0) {
            throw new IllegalArgumentException("O salário deve ser um valor positivo");
        }

        this.salarioSemanal = salarioSemanal;

    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    // Implementação do método da interface
    @Override
    public double getPaymentAmount() {
        return getSalarioSemanal();
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("%s\nSalario semanal: %.2f", super.toString(), getSalarioSemanal());
    }

}