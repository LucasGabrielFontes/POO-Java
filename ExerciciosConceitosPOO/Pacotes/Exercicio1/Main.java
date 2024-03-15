import obj.*;
import construtor.*;

public class Main {
    
    public static void main(String[] args) {

        Personagem personagem = Scene.criarPersonagem("Frodo", 5, 10);
        Caixa caixa = Scene.criarCaixa(5, 5, 10, 10);

        System.out.println(personagem);
        System.out.println(caixa);

    }

}