package br.edu.ifce.atvpoo.abstracionismo;

class Gato extends Mamifero {
    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "O gato mia: Miau!";
    }

    @Override
    public String amamentar() {
        return "O gato amamenta seus filhotes.";
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + raca);
        System.out.println(emitirSom());
        System.out.println(amamentar());
    }
}