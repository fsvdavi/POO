package br.edu.ifce.atv.heranca.SistAcademico;

public class Aluno extends Usuario {
    private String matricula;
    private String curso;

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    public void exibirCurso() {
        System.out.println( " O curso do aluno  " + getNome() + " é " + curso + ".");
    }

    public void exibirMatricula() {
    	System.out.println( " A matrícula do aluno  " + getNome() + " é " + matricula + ".");
    }
}
