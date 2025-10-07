package br.edu.ifce.atv.heranca.Pizzaria;

public class TestePizzaria extends Produto{
	
	public static void main(String[] args) {
        
        Comida pizza = new Comida("Pizza Calabresa", 55.99, 40, 297, "Comida" , "Italiana", true);
        		
        Bebida suco = new Bebida("Suco de Laranja", 8.50, 5,  31, "Bebida", 500, false);	
        
        Sobremesa sorvete = new Sobremesa("Sorvete de Chocolate", 12.00, 0, 227, "Sobremesa", "Chocolate", true);
        
     // Mostrar atributos
        pizza.exibirTipo();
        pizza.exibirVegetariana();

        suco.exibirVolume();
        suco.exibirAlcoolica();

        sorvete.exibirSabor();
        sorvete.exibirCongelada();
        
}
}