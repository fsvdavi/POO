package br.edu.ifce.atv.heranca.SistAcademico;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();	
        aluno.setNome("Sara");
        aluno.setIdade(20);
        aluno.setGenero("Feminino");
        aluno.setEndereco("Rua x, 123");
        aluno.setEmail("sara@gmail.com");
        aluno.setMatricula("20231001");
        aluno.setCurso("Engenharia");
        		
	    aluno.exibirCurso();
	    aluno.exibirMatricula();
	     
	    Professor professor = new Professor();	    
	    professor.setNome("Lúcio");
        professor.setIdade(45);
        professor.setGenero("Masculino");
        professor.setEndereco("Rua y, 321");
        professor.setEmail("lucio@gmail.com");
        professor.setEspecializacao("Matemática");
        professor.setSalario(5000.0);
	       	       
	    professor.exibirDisciplina();
	    professor.exibirSalario();		      	  
      }
	}


