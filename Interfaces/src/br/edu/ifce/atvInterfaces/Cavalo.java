package br.edu.ifce.atvInterfaces;

class Cavalo extends Mamifero implements AnimalDomesticado {
    @Override
    public String amamentar() {
        return "Cavalo amamentando";
    }

    @Override
    public String emitirSom() {
        return "Relincho";
    }

    @Override
    public void alimentar() {
        System.out.println("Cavalo sendo alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Cavalo no veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinário");
    }
}