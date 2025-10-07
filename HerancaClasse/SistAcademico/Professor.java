package br.edu.ifce.atv.heranca.SistAcademico;

public class Professor extends Usuario{
	private String disciplina;
    private double salario;

    

 
    public String getEspecializacao() {
        return disciplina;
    }

    public void setEspecializacao(String especializacao) {
        this.disciplina = especializacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public void exibirDisciplina() {
    	System.out.println( " A displina que o professor  " + getNome() + " ensina é " + disciplina + ".");
    }

    public void exibirSalario() {
    	System.out.println( " O salário do professor  " + getNome() + "  é de R$ " + salario + ".");
    }
}

