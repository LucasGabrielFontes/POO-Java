import java.util.ArrayList;

public class Inventory<T> {
 
    private ArrayList<T> lista;

    public Inventory(ArrayList<T> lista) {
        this.lista = lista;
    }

    public boolean temOuNao(T item) {

        for (T i: lista) {
            if (i.equals(item)) {
                return true;
            }
        }

        return false;

    }

    public void adicionarItem(T item) {
        lista.add(item);
    }

    public void removerItem(T item) {
        lista.remove(item);
    }

    public String listarItens() {
        
        String retorno = "";

        for (T i: lista) {
            retorno += i.toString() + "\n";
        }

        return retorno;

    }

}