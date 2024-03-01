
public class Scene {
    
    public static Objeto criarObjeto(String nome, int x, int y) {
        return new Personagem(nome, x, y);
    }

    public static Objeto criarObjeto(int x, int y, int width, int height) {
        return new Caixa(x, y, width, height);
    }

}