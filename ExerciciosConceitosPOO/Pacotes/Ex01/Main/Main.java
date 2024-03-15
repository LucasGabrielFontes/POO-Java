/* 
public class Main {

    public static void main(String[] args) {

        Pessoas.Estudante estudante1 = new Pessoas.Estudante("Lucas Gabriel Fontes da Silva", "20230012592", "Ciência da Computação");

        System.out.println(estudante1);

    }

}
*/ // Uma maneira de utilizar classes de outros pacotes, utilizando sempre o nome do pacote

// import Pessoas.*; - importa todas as classes de um pacote
import Pessoas.Estudante; // Outro método de utilizar classes de outros pacotes: importando-as do seu pacote

public class Main {

    public static void main (String[] args) {

        Estudante estudante1 = new Estudante("Lucas Gabriel Fontes da Silva", "20230012592", "Ciência da Computação"); // Utiliza-se como se estivesse no mesmo pacote da main

        System.out.println(estudante1);

    }

}

// Classes que estão no mesmo pacote não precisam utilizar o nome do pacote para se referir umas às outras

// Classes que não estão em nenhum pacote são colocadas em um pacote padrão, que não pode ser acessado por outro pacote