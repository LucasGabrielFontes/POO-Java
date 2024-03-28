// Classe concreta filha de Employee

public class ComissionEmployee extends Employee {

    // Variáveis de instância
    private double vendaSemanal;
    private double comissao;

    // Método construtor
    public ComissionEmployee (String nome, String sobrenome, String numeroDeSeguranca, int diaA, int mesA, int anoA, double vendaSemanal, double comissao) {

        super(nome, sobrenome, numeroDeSeguranca, diaA, mesA, anoA);

        if (vendaSemanal < 0.0) {
            throw new IllegalArgumentException("O valor das vendas deve ser um valor positivo");
        }

        if (comissao < 0.0 || comissao >= 1.0) {
            throw new IllegalArgumentException("A comissão deve estar no intervalo [0, 1)");
        }

        this.vendaSemanal = vendaSemanal;
        this.comissao = comissao;

    }
    
    // Métodos get e set
    public double getVendaSemanal() {
        return vendaSemanal;
    }

    public double getComissao() {
        return comissao;
    }

    public void setVendaSemanal (double vendaSemanal) {

        if (vendaSemanal < 0.0) {
            throw new IllegalArgumentException("O valor das vendas deve ser um valor positivo");
        }

        this.vendaSemanal = vendaSemanal;

    }

    public void setComissao (double comissao) {

        if (comissao < 0.0 || comissao >= 1.0) {
            throw new IllegalArgumentException("O valor da comissão deve esta no intervalo [0, 1)");
        }

        this.comissao = comissao;

    }

    // Método implementado da superclasse abstrata
    @Override
    public double ganhos() {
        return getVendaSemanal() * getComissao();
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Comission Employee: %s\nVenda semanal: R$%.2f\nComissão: %.2f", super.toString(), getVendaSemanal(), getComissao());
    }

}