public class Main {

    public static void main(String[] args) {

        Integer vetor1[] = {1, 2, 3, 4};
        Integer vetor2[] = {1, 2, 3, 4};

        // Não é necessário mudar nada na chamada de um método parametrizado
        if (vetoresIguais(vetor1, vetor2)) {
            System.out.printf("Os vetores são iguais\n");
        } else {
            System.out.printf("Os vetores não são iguais\n");
        }

    }

    // Método GENÉRICO! PERCEBA! Os parâmetros de tipo são declarados antes do tipo de retorno do método

    // Comparable é uma interface declarada em java.lang. Uma classe que implementa Comparable define objetos que podem ser ordenados. O parâmetro de tipo de Comparable especifica o tipo dos objetos que ela compara. Desse modo, o método vetores iguais só aceitará vetores que possam ser comparados.

    // Além disso, o segundo tipo V extends T, para que possa ser comparado com ele.
    public static <T extends Comparable<T>, V extends T> boolean vetoresIguais (T[] vetor1, V[] vetor2) {

        if (vetor1.length != vetor2.length) {
            return false;
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (!vetor1[i].equals(vetor2[i])) {
                return false;
            }
        }

        return true;
    
    }

}