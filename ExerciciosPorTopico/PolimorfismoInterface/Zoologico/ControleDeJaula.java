import java.util.ArrayList;;

public class ControleDeJaula {

    ArrayList<Animal> animais = new ArrayList<Animal>();

    public String adicionarAnimal (Animal animal) {

        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getNome().equals(animal.getNome()) && animais.get(i).getNome().equals(animal.getNome())) {
                throw new IllegalArgumentException("O animal já está enjaulado");
            }
        }

        animais.add(animal);
        return animal.getNome() + " adicionado à jaula";

    }

    public String removerAnimal (Animal animal) {

        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getNome().equals(animal.getNome()) && animais.get(i).getNome().equals(animal.getNome())) {
                animais.remove(i);
                i = animais.size();
                return animal.getNome() + "removido da jaula";
            }
        }

        throw new IllegalArgumentException("O animal não está enjaulado");

    }

    public String listarAnimais () {

        if (animais.size() == 0) {
            return "Não há animais enjaulados";
        }

        String listaAnimais = String.format("Animais enjaulados:\n\n");

        for (int i = 0; i < animais.size(); i++) {
            listaAnimais += "Nome: " + animais.get(i).getNome() + "\nEspécie: " + animais.get(i).getEspecie() + "\n\n";
        }

        return listaAnimais;

    }
    
}