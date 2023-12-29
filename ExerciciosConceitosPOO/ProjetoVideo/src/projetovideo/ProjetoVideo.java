package projetovideo;

public class ProjetoVideo {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Lucas Gabriel", "Russo", "M", 18);
        Usuario usuario2 = new Usuario("Jonata", "Jonildo", "M", 35);
        Video video1 = new Video("Como ficar rico com a internet", 20);
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(video1.toString());
        Assistir assistir1 = new Assistir(usuario1, video1, 5, false);
        Assistir assistir2 = new Assistir(usuario1, video1, 7, true);
        System.out.println(usuario1.toString());
        System.out.println(video1.toString());
    }
}