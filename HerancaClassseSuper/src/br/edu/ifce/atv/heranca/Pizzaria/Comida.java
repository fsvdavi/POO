package br.edu.ifce.atv.heranca.Pizzaria;

public class Comida extends Produto{
	private String tipo;
	private boolean vegetariana;

public Comida() {
    super();
  }

    
public Comida(String nome, double preco, int tempoPreparo, int calorias, String categoria, String tipo, boolean vegetariana) {
    super(nome, preco, tempoPreparo, calorias, categoria);
    this.tipo = tipo;
    this.vegetariana = vegetariana;    
    }


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
