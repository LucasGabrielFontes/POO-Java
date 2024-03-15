package Pessoas;

public class Estudante {
    
    private String nome;
    private String matricula;
    private String curso;

    public Estudante (String nome, String matricula, String curso) {

        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;

    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public String toString(){
        return String.format("Estudante: %s\n\nCurso: %s\nMatrícula: %s\n", nome, curso, matricula);
    }

}