import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int testes = input.nextInt();

        for (int i = 0; i < testes; i++) {

            long totGraos = 1;
            long graos = 1;
            int quadrados = input.nextInt();

            for (int aux = 1; aux < quadrados; aux++) {
                graos *= 2;
                totGraos += graos;
            }

            double pesoTot = (totGraos*0.001)/12;

            System.out.printf("%.0f kg\n", Math.floor(pesoTot));

        }

        input.close();

    }

}