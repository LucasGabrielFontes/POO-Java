// Declaração da classe carro que implementa a Interface PegadaDeCarbono

public class Carro implements PegadaDeCarbono {
    
    // Variáveis de instância
    private double distPercorrida;
    private double consumoGasolinaPor100km;
    private double emissaoCO2PorLitro;

    // Método construtor
    public Carro (double distPercorrida, double consumoGasolinaPor100km, double emissaoCO2PorLitro) {

        if (distPercorrida < 0) {
            throw new IllegalArgumentException("A distância percorrida pelo carro deve ser um valor positivo");
        }

        if (consumoGasolinaPor100km < 0) {
            throw new IllegalArgumentException("O consumo de gasolina a cada 100km deve ser um valor positivo");
        }

        if (emissaoCO2PorLitro < 0) {
            throw new IllegalArgumentException("A emissão de CO2 por litro de gasolina deve ser um valor positivo");
        }

        this.distPercorrida = distPercorrida;
        this.consumoGasolinaPor100km = consumoGasolinaPor100km;
        this.emissaoCO2PorLitro = emissaoCO2PorLitro;

    }

    // Métodos get
    public double getDistPercorrida() {
        return distPercorrida;
    }

    public double getConsumoGasolinaPor100km() {
        return consumoGasolinaPor100km;
    }

    public double getEmissaoCO2PorLitro() {
        return emissaoCO2PorLitro;
    }

    // Implementação do método abstrato da Interface
    @Override
    public double getPegadaDeCarbono() {
        return ((distPercorrida/100)*consumoGasolinaPor100km)*emissaoCO2PorLitro;
    }

    // Método toString sobreposto
    @Override
    public String toString() {
        return String.format("Informações do carro:\n\nDistância percorrida: %.2fkm\nConsumo de gasolina a cada 100km percorridos: %.2f litros\nEmissão de CO2 a cada litro de gasolina consumido: %.2fkg\n\nPegada de carbono do carro: %.2f", getDistPercorrida(), getConsumoGasolinaPor100km(), getEmissaoCO2PorLitro(), getPegadaDeCarbono());
    }
 
}