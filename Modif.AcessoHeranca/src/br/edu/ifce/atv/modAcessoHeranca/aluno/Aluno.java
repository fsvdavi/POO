package br.edu.ifce.atv.modAcessoHeranca.aluno;

import br.edu.ifce.atv.modAcessoHeranca.Pessoa;

public class Aluno extends Pessoa {
private String matricula;
private String curso;


public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
    super(nome, idade, cpf); 
    this.matricula = matricula;
    this.curso = curso;
}


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


public void exibirInfoAluno() {
    System.out.println("Aluno: " + nome + ", Idade: " + getIdade() + ", CPF: " + getCpf() +
            ", Matrícula: " + matricula + ", Curso: " + curso);
}


}



