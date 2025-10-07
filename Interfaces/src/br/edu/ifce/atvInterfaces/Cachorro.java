package br.edu.ifce.atvInterfaces;

class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String tamanho;
    private String raca;

    @Override
    public String amamentar() {
        return "Cachorro amamentando";
    }

    @Override
    public String emitirSom() {
        return "AuAu";
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro sendo alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Cachorro no veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinário para o cachorro");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro brincando");
    }

    @Override
    public void levarPassear() {
        System.out.println("Cachorro sendo levado para passear");
    }
}

