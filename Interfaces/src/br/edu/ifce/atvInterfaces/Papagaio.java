package br.edu.ifce.atvInterfaces;


class Papagaio extends Ave {
    @Override
    public String voar() {
        return "Papagaio voando";
    }

    @Override
    public String emitirSom() {
        return "Papagaio falando";
    }
}

