package br.edu.ifce.atvpoo.abstracionismo;

class Papagaio extends Ave {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "O papagaio fala palavras e canta.";
    }

    @Override
    public String voar() {
        return "O papagaio está voando.";
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println(emitirSom());
        System.out.println(voar());
    }
}
