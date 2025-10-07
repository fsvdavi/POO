package br.edu.ifce.atv.heranca.Pizzaria;

public class Comida extends Produto{ 	
	private String tipo;
	private boolean vegetariana;
	
	
	public String getTipo() {	
    return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

	
    
	public void exibirTipo() {
		System.out.println("Comida: " + getNome() + ", Tipo: " + tipo );
	}

	public void exibirVegetariana() {
		System.out.println("Comida: " + getNome() +  ", Vegetariana: " + (vegetariana ? "Sim" : "Não"));
}
}



