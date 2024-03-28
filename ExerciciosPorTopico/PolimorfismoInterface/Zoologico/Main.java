public class Main {
    
    public static void main (String[] args) {

        ControleDeJaula controleDeJaula = new ControleDeJaula();

        Aguia aguia1 = new Aguia("Matadora de passarinhos", "Aguia de cabeça branca", "KREEEEE");
        Leao leao1 = new Leao("Rei de todos", "Leão sul africano", "ROAAAR");
        Elefante elefante1 = new Elefante("Gigante", "Elefante africano de savana", "TRUUUM");

        try {
            System.out.printf("%s\n", controleDeJaula.adicionarAnimal(elefante1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            controleDeJaula.removerAnimal(leao1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.printf("%s\n", controleDeJaula.adicionarAnimal(elefante1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("%s\n", controleDeJaula.adicionarAnimal(aguia1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("\n\n%s\n", controleDeJaula.listarAnimais());

    }

}