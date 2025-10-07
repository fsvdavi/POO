package br.edu.ifce.atvpoo.abstracionismo;

abstract class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    public abstract String amamentar();
}

