package br.edu.ifce.atvInterfaces;

class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String raca;

    @Override
    public String amamentar() {
        return "Gato amamentando";
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public void alimentar() {
        System.out.println("Gato comendo");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Gato no veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinário para o gato");
    }

    @Override
    public void brincar() {
        System.out.println("Gato brincando");
    }

    @Override
    public void levarPassear() {
        System.out.println("Gato passeando");
    }
}
