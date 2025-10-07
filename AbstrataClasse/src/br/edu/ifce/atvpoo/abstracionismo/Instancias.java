package br.edu.ifce.atvpoo.abstracionismo;

public class Instancias { 
	
	public static void main(String[] args) {
    Papagaio papagaio = new Papagaio("Louro");
    Cachorro cachorro = new Cachorro("Caramelo", "Médio", "Vira-lata");
    Gato gato = new Gato("Flin", "Siamês");

    System.out.println("Informações sobre os animais:\n");
    papagaio.mostrarInformacoes();
    System.out.println();
    cachorro.mostrarInformacoes();
    System.out.println();
    gato.mostrarInformacoes();
}
}


