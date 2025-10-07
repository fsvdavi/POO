package br.edu.ifce.atv.heranca.SistAcademico;

public class Usuario {	
	private String nome;
	private int idade;
	private String endereco;
	private String genero;
	private String email;
	
public Usuario() {	
}

public Usuario(String nome, int idade, String endereco, String genero, String email) {	
	this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
    this.genero = genero;
    this.email = email;
	
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}


