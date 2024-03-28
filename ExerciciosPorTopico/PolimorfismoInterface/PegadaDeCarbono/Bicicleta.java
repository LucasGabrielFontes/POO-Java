// Declaração da classe Bicicleta que implementa a interface PegadaDeCarbono

public class Bicicleta implements PegadaDeCarbono {
    
    // Variáveis de instância
    private double emissaoCO2Producao;
    private double distanciaPercorrida;
    private double emissaoFimDeVida;
    private final double emissaoCO2PorKm;

    // Método construtor
    public Bicicleta (double emissaoCO2Producao, double distanciaPercorrida, double emissaoFimDeVida) {

        if (emissaoCO2Producao < 0) {
            throw new IllegalArgumentException("A emissão de carbono na produção da bicicleta deve ser um valor positivo");
        }

        if (distanciaPercorrida < 0) {
            throw new IllegalArgumentException("A distância percorrida pela bicicleta deve ser um valor positivo");
        }

        if (emissaoFimDeVida < 0) {
            throw new IllegalArgumentException("A emissão de carbono no fim de vida da bicicleta deve ser um valor positivo");
        }

        this.emissaoCO2Producao = emissaoCO2Producao;
        this.distanciaPercorrida = distanciaPercorrida;
        this.emissaoFimDeVida = emissaoFimDeVida;
        emissaoCO2PorKm = (double) 50/2000;

    }

    // Métodos get
    public double getEmissaoCO2Producao() {
        return emissaoCO2Producao;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getEmissaoFimDeVida() {
        return emissaoFimDeVida;
    }

    // Implementação do método abstrato da Interface
    @Override
    public double getPegadaDeCarbono() {
        return getEmissaoCO2Producao() + (getDistanciaPercorrida()*emissaoCO2PorKm) + getEmissaoFimDeVida();
    }

    // Método toString sobreposto
    public String toString() {
        return String.format("Informações da bicicleta:\n\nEmissão de CO2 na produção: %.2fkg\nDistância percorrida: %.2fkm\nEmissão de CO2 no fim de vida: %.2f\nEmissão de CO2 por quilômetro rodado: %.2f\n\nPegada de carbono da bicicleta: %.2f", getEmissaoCO2Producao(), getDistanciaPercorrida(), getEmissaoFimDeVida(), emissaoCO2PorKm, getPegadaDeCarbono());
    }

}