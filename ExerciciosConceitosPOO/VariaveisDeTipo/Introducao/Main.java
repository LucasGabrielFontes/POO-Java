// Classes e métodos podem ser genéricos: operam sobre um parâmetro de tipo (o tipo de dado que a classe ou o método vai trabalhar é especificado como parâmetro).

// Preste atenção: T é um espaço reservado para o tipo real que será especificado quando um objeto da classe genérica for instaciado.

// Imagine que T é tipo de dados comum, como int ou String. Fica mais fácil de entender. A diferença é que ele pode ser qualquer tipo de objeto.

// Você já usou isso de maneira fácil com ArrayLists;

// Não é possível passar como argumento para o parâmetro de tipo um tipo primitivo como int, double, char...

public class Main {

    public static void main(String[] args) {

        // Instancia a classe genérica Gen com o tipo Integer e o objeto Integer 88
        Gen<Integer> genericoInt = new Gen<>(99);
        System.out.printf("%s\n", genericoInt.mostraTipoObjeto());
        int valor = genericoInt.getObjeto();
        System.out.printf("Valor: %d\n\n", valor);

        // Nessa instância, todas as referências a T, nesse objeto, serão convertidas para referências a String
        Gen<String> genericoStr = new Gen<>("Vegetti");
        System.out.printf("%s\n", genericoStr.mostraTipoObjeto());
        String valor2 = genericoStr.getObjeto();
        System.out.printf("Valor: %s\n", valor2);

        //genericoInt = genericoStr; -> Totalmente errado! Ainda que os dois objetos sejam do tipo Gen<>, eles fazem referências a tipos diferentes

    }

}