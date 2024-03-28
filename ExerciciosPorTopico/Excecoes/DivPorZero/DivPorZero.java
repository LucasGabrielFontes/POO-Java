import java.util.InputMismatchException; // A classe InputMismatchException precisa ser importada, ao contrário da classe ArithmeticException, que está em java.lang
import java.util.Scanner;

public class DivPorZero {

    // throws ArithmeticException especifíca o tipo de exceção que um método pode lançar
    public static int quociente (int numerador, int denominador) throws ArithmeticException {

        return numerador/denominador;

    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continuaLoop = true;

        do {

            try {

                // Tanto os métodos nextInt() que o método quociente podem lançar exceções
                System.out.printf("Digite o numerador: ");
                int numerador = input.nextInt();
                System.out.printf("Digite o denominador: ");
                int denominador = input.nextInt();

                int resultado = quociente(numerador, denominador);
                System.out.printf("Resultado: %d/%d = %d\n", numerador, denominador, resultado);
                
                continuaLoop = false;

            } catch (InputMismatchException inputMismatchException) {

                System.err.printf("\nExceção: %s\n", inputMismatchException);
                input.nextLine(); // Como o método nextInt() não foi concluído, o método nextLine() captura a entrada inválida do usuário e não faz nada com ela.

                System.out.printf("Você deve inserir números inteiros apenas. Tente novamente.\n\n");

            } catch (ArithmeticException arithmeticException) {
 // Diferentes blocos catch capturam diferentes exceções lançadas
                System.err.printf("\nExceção: %s\n", arithmeticException); // System.err é a saída padrão para informar exceções
                System.out.printf("0 é um denominador inválido. Tente novamente.\n\n");

            }

        } while (continuaLoop);

        input.close();

    }

}