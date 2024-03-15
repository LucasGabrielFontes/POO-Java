package construtor;

import obj.*;

public class Scene {
 
    public static Caixa criarCaixa(int x, int y, int width, int height) {
        return new Caixa(x, y, width, height);
    }

    public static Personagem criarPersonagem(String name, int x, int y) {
        return new Personagem(name, x, y);
    }

}