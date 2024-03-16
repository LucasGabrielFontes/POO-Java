// Dessa forma, você informa ao compilador que o parâmetro de tipo receberá apenas argumentos de tipo que herdam da classe Number.

// Exemplo interessante: 

// public class Pair <T, V extends T> { -> Nesse caso, o tipo V, qualquer que seja, deve ser do mesmo tipo de T ou uma subclasse de T
//
// }

public class NumericFns <T extends Number> {

    private T numero;

    public NumericFns(T numero) {
        this.numero = numero;
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