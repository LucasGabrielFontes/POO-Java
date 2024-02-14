// Classe filha de ComissionEmployee

public class BasePlusComissionEmployee extends ComissionEmployee {
    
    // Variável de instância
    private double salarioBase;

    // Método construtor
    public BasePlusComissionEmployee (String nome, String sobrenome, String numeroDeSeguranca, int diaA, int mesA, int anoA, double vendaSemanal, double comissao, double salarioBase) {

        super(nome, sobrenome, numeroDeSeguranca, diaA, mesA, anoA, vendaSemanal, comissao);

        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("O salário-base deve ser um valor positivo");
        }

        this.salarioBase = salarioBase;

    }

    // Métodos get e set
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase (double salarioBase) {

        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário-base deve ser um valor positivo");
        }

        this.salarioBase = salarioBase;

    }

    // Método ganhos sobreposto da classe mãe
    @Override
    public double ganhos() {
        return getSalarioBase() + super.ganhos(); // Muito bom isso de chamar métodos da classe mãe que fazem parte do trabalho para a classe filha ;)
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Base Plus %s\nSalário base: R$%.2f", super.toString(), getSalarioBase());
    }

}