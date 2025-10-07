package br.edu.ifce.atv.heranca.Pizzaria;

public class TestePizzaria {
	public static void main(String[] args) {
        
        Comida pizza = new Comida();
        pizza.setNome("Pizza Calabresa");
        pizza.setPreco(55.99);
        pizza.setTempoPreparo(40);
        pizza.setCategoria("Comida");
        pizza.setCalorias(297);
        pizza.setTipo("Italiana");
        pizza.setVegetariana(true);

        Bebida suco = new Bebida();
        suco.setNome("Suco de Laranja");
        suco.setPreco(8.50);
        suco.setTempoPreparo(5);
        suco.setCategoria("Bebida");
        suco.setCalorias(31);
        suco.setVolume(500);
        suco.setAlcoolica(false);

        Sobremesa sorvete = new Sobremesa();
        sorvete.setNome("Sorvete de Chocolate");
        sorvete.setPreco(12.00);
        sorvete.setTempoPreparo(0);
        sorvete.setCategoria("Sobremesa");
        sorvete.setCalorias(227);
        sorvete.setCongelada(true);
        sorvete.setSabor("Chocolate");

        // Mostrar atributos
        pizza.exibirTipo();
        pizza.exibirVegetariana();

        suco.exibirVolume();
        suco.exibirAlcoolica();

        sorvete.exibirSabor();
        sorvete.exibirCongelada();
   
    }
}


