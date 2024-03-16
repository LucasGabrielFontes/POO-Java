public class Main {

    public static void main (String[] args) {

        NumericFns<Integer> objetoInt = new NumericFns<Integer>(7);

        System.out.printf("Recíproco de %d: %.2f\n", objetoInt.getNumero(), objetoInt.getReciproco());
        System.out.printf("Componente fracionário de %d: %.2f\n", objetoInt.getNumero(), objetoInt.fracao());

        // NumericFns<String> objetoStr = new NumericFns<String>("Vasco"); -> Totalmente errado, pois limitamos os parâmetros de tipo apenas às classes que herdam de Number, que não é o caso de String

    }

}