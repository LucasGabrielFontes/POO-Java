public class Aguia implements Animal {
    
    private String nome;
    private String especie;
    private String barulho;

    public Aguia (String nome, String especie, String barulho) {
        this.nome = nome;
        this.especie = especie;
        this.barulho = barulho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public void fazerBarulho (int vezes) {

        if (vezes <= 0) {
            throw new IllegalArgumentException("A quantidade de vezes que o animal vai repetir o barulho deve ser um valor positivo");
        }

        for (int i = 0; i < vezes; i++) {
            System.out.printf("%s ", barulho);
        }

    }

}