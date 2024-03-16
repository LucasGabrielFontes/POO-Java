import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            numeros.add(i+1);
        }

        Inventory<Integer> listaDeNumeros = new Inventory<Integer>(numeros);

        System.out.printf("Lista inicial:\n\n%s\n", listaDeNumeros.listarItens());

        System.out.printf("Tem o número 1: %b\n", listaDeNumeros.temOuNao(1));
        System.out.printf("Tem o número 11: %b\n\n", listaDeNumeros.temOuNao(11));

        listaDeNumeros.removerItem(1);
        System.out.printf("Item 1 removido.\n");
        listaDeNumeros.adicionarItem(11);
        System.out.printf("Item 11 adicionado.\n\n");

        System.out.printf("Lista final:\n\n%s\n", listaDeNumeros.listarItens());

        System.out.printf("Tem o número 1: %b\n", listaDeNumeros.temOuNao(1));
        System.out.printf("Tem o número 11: %b\n", listaDeNumeros.temOuNao(11));

    }

}