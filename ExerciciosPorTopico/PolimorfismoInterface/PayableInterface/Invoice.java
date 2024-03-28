// Declaração da classe Invoice que implementa a interface Payable

public class Invoice implements Payable {
    
    // Variáveis de instância
    private final String numPeca;
    private final String descricaoPeca;
    private int quantidade;
    private double precoPorItem;

    // Método construtor
    public Invoice (String numPeca, String descricaoPeca, int quantidade, double precoPorItem) {

        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade deve ser um valor positivo");
        }

        if (precoPorItem < 0) {
            throw new IllegalArgumentException("O preço dever ser um valor positivo");
        }

        this.numPeca = numPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;

    }

    // Métodos get e set
    public String getNumPeca() {
        return numPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setQuantidade (int quantidade) {

        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade deve ser um valor positivo");
        }

        this.quantidade = quantidade;

    }

    public int getQuantidade () {
        return quantidade;
    }

    public void setPrecoPorItem (double precoPorItem) {

        if (precoPorItem < 0) {
            throw new IllegalArgumentException("O preço deve ser um valor positivo");
        }

        this.precoPorItem = precoPorItem;

    }

    public double getPrecoPorItem () {
        return precoPorItem;
    }

    // Método toString
    public String toString () {
        return String.format("Invoice:\nNumero da peça: %s\nDescrição da peça: %s\nQuantidade: %d\nPreço por item: %.2f", getNumPeca(), getDescricaoPeca(), getQuantidade(), getPrecoPorItem());
    }

    // Implementação de fato da interface. É aqui que nós cumprimos o 'contrato' ao implementar a Interface ;)
    @Override
    public double getPaymentAmount() {
        return getPrecoPorItem() * getQuantidade();
    }

}