public class Main {

    public static void main (String[] args) {

        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void metodo1() throws Exception{
        
        try {
            metodo2();
        } catch (Exception e) {
            // Lançar uma nova exceção incluindo a exceção capturada como parâmetro do lançamento permite que o rastreamento de pilha não seja perdido
            throw new Exception("Exceção lançada do metodo1()", e);
        }

    }

    public static void metodo2() throws Exception{

        try {
            metodo3();
        } catch (Exception e) {
            throw new Exception("Exceção lançada no metodo2()", e);
        }

    }

    public static void metodo3() throws Exception{

        throw new Exception("Exceção lançada no metodo3");

    }

}