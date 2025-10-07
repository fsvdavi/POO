package br.edu.ifce.atvpoo.abstracionismo;

abstract class Animal {
	protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }
}
	

