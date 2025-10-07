package br.edu.ifce.atv.heranca.SistAcademico;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Sara",20,"Feminino", "Rua x, 123", "Sara@gmail.com", "20231001", "Engenharia");	
		aluno.exibirCurso();
	    aluno.exibirMatricula();
	    
	    Professor professor = new Professor("Lúcio", 45, "Masculino", "Rua y, 321", "lucio@gmail.com", "Matemática", 5000.0);	
	    professor.exibirDisciplina();
	    professor.exibirSalario();		   

	}

}
