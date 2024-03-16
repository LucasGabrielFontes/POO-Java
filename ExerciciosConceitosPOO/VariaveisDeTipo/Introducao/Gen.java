// Classe genérica. O uso de "T" para nomear o parâmetro de tipo é muito usual

// Detalhe: um classe genérica pode ser declarada com mais de um parâmetro de tipo

// Ex:

// public class Gen<T, V>{
//
// }

// Para instanciar, por exemplo:
//
// Gen<Integer, String> nomeObjeto<Integer, String>("99", "Vegetti");

public class Gen<T> {
        
    // T é o tipo do objeto que será passado quando a classe for instanciada
    private T objeto;

    // Esse tipo T é dado entre <> na hora de instanciar. Veja a classe Main.
    public Gen (T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public String mostraTipoObjeto(){
        return String.format("Tipo de T: %s", objeto.getClass().getName());
    }

}