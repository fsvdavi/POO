package br.edu.ifce.atvpoo.abstracionismo;

abstract class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    public abstract String voar();
}