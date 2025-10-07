package br.edu.ifce.atv.heranca.Pizzaria;

public class Sobremesa extends Produto{
	private boolean congelada;
    private String sabor;

    public boolean isCongelada() {
        return congelada;
    }

    public void setCongelada(boolean congelada) {
        this.congelada = congelada;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    
    public void exibirSabor() {
        System.out.println("Sobremesa: " + getNome() + ", Sabor: " + sabor );
    }
    
    public void exibirCongelada() {
        System.out.println("Sobremesa: " + getNome() + ", Congelada: " + (congelada ? "Sim" : "Não"));
    }

}
