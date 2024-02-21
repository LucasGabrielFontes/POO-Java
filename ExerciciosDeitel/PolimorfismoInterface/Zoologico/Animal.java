public interface Animal {

    //public static final String nome = "Animal"; Única forma de declarar uma variável em uma interface: sendo public static final e sendo inicializada logo ao ser declarada.
    public String getNome();
    public String getEspecie();
    public void fazerBarulho(int vezes);

}