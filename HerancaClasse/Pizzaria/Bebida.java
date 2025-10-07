package br.edu.ifce.atv.heranca.Pizzaria;

public class Bebida extends Produto {
	private double volume;
	private boolean alcoolica; 
	
	public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

	
	
	public void exibirVolume() {
		System.out.println("Bebida: " + getNome() + ", Volume: " + volume + "ml");
	}

	public void exibirAlcoolica() {
		System.out.println("Bebida: " + getNome() + " Alcoólica: " + (alcoolica ? "Sim" : "Não"));
	}
}
	


