// Declaração da classe Edifício que implementa a Interface PegadaDeCarbono

public class Edificio implements PegadaDeCarbono {

    // Variáveis de instância
    private double emissaoProducaoCO2;
    private double emissaoProducaoCH4;
    private double emissaoProducaoN2O;
    private final int potencialCO2;
    private final int potencialCH4;
    private final int potencialN2O;

    // Método construtor
    public Edificio (double emissaoProducaoCO2, double emissaoProducaoCH4, double emissaoProducaoN2O) {

        if (emissaoProducaoCO2 < 0) {
            throw new IllegalArgumentException("A emissão de CO2 deve ser um valor positivo");
        }

        if (emissaoProducaoCH4 < 0) {
            throw new IllegalArgumentException("A emissão de CH4 deve ser um valor porsitivo");
        }

        if (emissaoProducaoN2O < 0) {
            throw new IllegalArgumentException("A emissão de N2O deve ser um valor positivo");
        }

        this.emissaoProducaoCO2 = emissaoProducaoCO2;
        this.emissaoProducaoCH4 = emissaoProducaoCH4;
        this.emissaoProducaoN2O = emissaoProducaoN2O;
        this.potencialCO2 = 1;
        this.potencialCH4 = 28;
        this.potencialN2O = 265;

    }

    // Métodos get
    public double getEmissaoProducaoCO2() {
        return emissaoProducaoCO2;
    }

    public double getEmissaoProducaoCH4() {
        return emissaoProducaoCH4;
    }

    public double getEmissaoProducaoN2O() {
        return emissaoProducaoN2O;
    }

    // Implementação do método abstrato da Interface PegadaDeCarbono
    @Override
    public double getPegadaDeCarbono() {
        return (emissaoProducaoCO2*potencialCO2 + emissaoProducaoCH4*potencialCH4 + emissaoProducaoN2O*potencialN2O);
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Informações do edifício:\n\nQuantidade de cada gás emitida na construção:\nCO2: %.2f toneladas\nCH4: %.2f toneladas\nN2O: %.2f toneladas\n\nPotencial de aquecimento global de cada gás:\nCO2: %d\nCH4: %d\nN2O: %d\n\nPegada de carbono do edifício: %.2f", getEmissaoProducaoCO2(), getEmissaoProducaoCH4(), getEmissaoProducaoN2O(), potencialCO2, potencialCH4, potencialN2O,getPegadaDeCarbono());
    }

}