public class NumericFns <T extends Number> {

    private T numero;

    public NumericFns(T numero) {
        this.numero = numero;
    }

    // Argumento Curinga! Sabemos que é number, mas não qual especificamente. Desse modo, podemos comparar os valores sem erros de comparação de tipos diferentes.

    // O argumento curinga pode ser limitado, assim os parâmetros de tipo em um classe, exemplo:

    // public boolean moduloIgual(NumericFns<? extends Class A>)

    public boolean moduloIgual(NumericFns<?> numero2) {
        if (Math.abs(this.numero.doubleValue()) == Math.abs(numero2.numero.doubleValue())) {
            return true;
        }
        return false;
    }

    public double getReciproco() {
        return 1/numero.doubleValue(); // doubleValue é um método da classe Number. Como limitamos os tipos genéricos apenas às classes que herdam de Number, podemos usar esse método
    }

    public double fracao() {
        return numero.doubleValue() - numero.intValue();
    }

    public T getNumero() {
        return numero;
    }

}