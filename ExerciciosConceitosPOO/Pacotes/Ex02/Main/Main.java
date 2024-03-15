package Main;

import Pessoas.Estudante.NivelSuperior.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Renato Cariani", "growth", "Química Industrial");

        System.out.println(aluno1);

    }

}

// Duas classes em um mesmo pacote não podem ter o mesmo nome, só se estiverem em pacotes diferentes

// IMPORTANTE: Quando o modificador de acesso não é especificado, o campo/método recebe ACESSO DE PACOTE. Esse membro será visível a qualquer outra classe do pacote (subpacotes não, lembre-se que os subpacotes são tratados como pacotes totalmente independetes)

// Membros protected também têm acesso de pacote, mas, nesse caso, classes de outros pacotes que estedem a classe com membros protected também podem acessá-los