package projetovideo;

public class Assistir {
    // Atributos
    private Pessoa usuario;
    private Video video;
    
    // Método construtor
    public Assistir (Usuario usuario, Video video, int avaliacao, boolean like) {
        video.setVisualizacoes(video.getVisualizacoes() + 1);
        usuario.setTotAssistido(usuario.getTotAssistido() + video.getDuracao());
        usuario.setExperiencia(usuario.getExperiencia() + 15);
        video.avaliar(avaliacao);
        if (like) {
            video.darLike();
        } else {
            video.darDeslike();
        }
    }
}