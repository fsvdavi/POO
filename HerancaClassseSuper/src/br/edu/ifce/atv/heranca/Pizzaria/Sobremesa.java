package br.edu.ifce.atv.heranca.Pizzaria;

public class Sobremesa extends Produto {
	private boolean congelada;
    private String sabor;
    
    public Sobremesa() {   	
    }

    public Sobremesa(String nome, double preco, int tempoPreparo, int calorias, String categoria, String sabor, boolean congelada) {
        super(nome, preco, tempoPreparo, calorias, categoria);
        this.sabor = sabor;
        this.congelada = congelada;
       
    }
    
    
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
