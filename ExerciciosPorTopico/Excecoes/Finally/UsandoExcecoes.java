public class UsandoExcecoes {

    public static void main (String[] args) {

        try {
            throwException();
        } catch (Exception e) {
            System.err.printf("Exceção tratada na main()\n");
        }

        doesNotThrowException();

    }

    public static void throwException() throws Exception {

        try {

            System.out.printf("Método throwException\n");
            throw new Exception(); // Lança uma exceção primeiramente

        } catch (Exception e) {

            System.err.printf("Exceção tratada no método throwException()\n");
            throw e; // Lança a mesma exceção para um tratamento adicional // Relançamento de exceção: adia seu tratamento para um bloco try externo

        } finally  { // Sempre executa, não importa o que aconteça em try ou catch

            System.err.printf("Bloco finally executado no método throwException()\n");

        }

    }

    public static void doesNotThrowException() {

        try {
            System.out.printf("Método doesNotThrowException\n");
        } catch (Exception e) {
            System.err.printf("%s\n", e);
        } finally {
            System.err.printf("Bloco finally executado no método doesNotThrowException()\n");
        }

        System.out.printf("Fim do método doesNotThrowException()\n");

    }

}