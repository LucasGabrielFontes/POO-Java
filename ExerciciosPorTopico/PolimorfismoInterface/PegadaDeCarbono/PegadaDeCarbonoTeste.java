// Declaração da classe que contém o método main utilizada para testar as classes e a interface criadas

import java.util.ArrayList;

public class PegadaDeCarbonoTeste {
    
    public static void main (String[] args) {

        ArrayList<PegadaDeCarbono> pegadasDeCarbono = new ArrayList<PegadaDeCarbono>();

        pegadasDeCarbono.add(new Edificio(1000, 10, 0.1));
        pegadasDeCarbono.add(new Carro(15000, 7.5, 2.3));
        pegadasDeCarbono.add(new Bicicleta(200, 2000, 20));

        for (PegadaDeCarbono objetoAtual: pegadasDeCarbono) {

            System.out.printf("%s\n\n\n", objetoAtual.toString());

        }

    }

}