package br.edu.ifce.atvpoo.abstracionismo;

class Cachorro extends Mamifero {
    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "O cachorro late: Au Au!";
    }

    @Override
    public String amamentar() {
        return "O cachorro amamenta seus filhotes.";
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Raça: " + raca);
        System.out.println(emitirSom());
        System.out.println(amamentar());
    }
}
