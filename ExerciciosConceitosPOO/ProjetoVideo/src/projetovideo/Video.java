package projetovideo;

public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private float avaliacao;
    private int visualizacoes, curtidas, descurtidas, duracao;
    
    // Método construtor
    public Video (String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.avaliacao = 0f;
        this.visualizacoes = 0;    
        this.curtidas = 0;
        this.descurtidas = 0;
    }
    
    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }
    

    public float getAvaliacao() {
        return avaliacao;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }
    
    public int getDescurtidas() {
        return descurtidas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public void setDescurtidas(int descurtidas) {
        this.descurtidas = descurtidas;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    // Métodos sobrepostos da interface: polimorfismo
    @Override
    public void darLike() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
    @Override
    public void darDeslike() {
        this.setDescurtidas(this.getDescurtidas() + 1);
    }
    
    @Override
    public void avaliar(int avaliacao) {
        this.setAvaliacao((this.getAvaliacao()*(this.getVisualizacoes() - 1) + avaliacao)/this.getVisualizacoes());
    }
    
    // ToString

    @Override
    public String toString() {
        return "======================================================\n" + 
                "Titulo: " + titulo + 
                "\nAvaliacao: " + avaliacao + 
                "\nVisualizacoes: " + visualizacoes + 
                "\nCurtidas: " + curtidas + 
                "\nDescurtidas: " + descurtidas + 
                "\nDuracao: " + duracao +
                "\n=====================================================\n";
    }
    
}