package Pessoas.Estudante.NivelSuperior; // Os subpacotes são utilizados apenas para organizar o código. Eles são tratados como pacotes indepedentes. São utilizados para achar os arquivos pelo caminho.

public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;

    public Aluno (String nome, String matricula, String curso) {

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