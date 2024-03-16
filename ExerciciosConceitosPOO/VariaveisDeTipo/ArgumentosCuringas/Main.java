public class Main {

    public static void main (String[] args) {

        NumericFns<Integer> objetoInt = new NumericFns<Integer>(7859);

        NumericFns<Double> objetoDou =  new NumericFns<Double>(-7859.1);

        NumericFns<Long> objetoLon = new NumericFns<Long>((long)-7859);

        if (objetoInt.moduloIgual(objetoDou)) {
            System.out.printf("Os valores absolutos de %d e %.2f são iguais.\n\n", objetoInt.getNumero(), objetoDou.getNumero());
        } else {
            System.out.printf("Os valores absolutos de %d e %.2f são diferentes.\n\n", objetoInt.getNumero(), objetoDou.getNumero());
        }

        if (objetoInt.moduloIgual(objetoLon)) {
            System.out.printf("Os valores absolutos de %d e %d são iguais.\n\n", objetoInt.getNumero(), objetoLon.getNumero());
        } else {
            System.out.printf("Os valores absolutos de %d e %d são diferentes.\n\n", objetoInt.getNumero(), objetoLon.getNumero());
        }

    }

}