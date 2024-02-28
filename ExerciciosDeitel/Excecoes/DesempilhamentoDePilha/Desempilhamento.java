public class Desempilhamento {

    public static void main (String[] args) {

        // Aqui, a exceção é capturada e tratada
        try {
            metodo1();
        } catch (Exception e) {

            System.err.printf("%s\n\n", e.getMessage());
            e.printStackTrace();

            StackTraceElement[] traceElements = e.getStackTrace();

            System.out.printf("\nStack trace from getStackTrace:\n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element: traceElements) {

                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());

            }

        }

    }

    public static void metodo1() throws Exception {
        // Como a chamada ao método 2 não está incluída em bloco try, o desempilhamento ocorre: o controle vai para o método main que chamou o metodo1()
        metodo2();
    }

    public static void metodo2() throws Exception {
        // Como a chamada ao método 3 não está incluída em bloco try, o desempilhamento ocoore: o controle vai para o método 1 que chamou o metodo2()
        metodo3();
    }

    public static void metodo3() throws Exception {
        // Como a instrução throw não está incluída em um bloco try, o desempilhamento ocorre: o controle vai para o método 2 que chamou o metodo3()
        throw new Exception("Exceção lançada no método 3");
    }
    
}