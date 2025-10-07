package br.edu.ifce.atvInterfaces;

public class InstanciasTeste {
	public static void main(String[] args) {
    Gato gato = new Gato();
    Cachorro cachorro = new Cachorro();

    gato.brincar();  
    gato.alimentar();
    gato.levarVeterinario();
    gato.chamarVeterinario();
    gato.levarPassear();
    System.out.println(gato.emitirSom());
    System.out.println(gato.amamentar());
    
    
    
    cachorro.brincar();
    cachorro.alimentar();
    cachorro.levarVeterinario();
    cachorro.chamarVeterinario();
    cachorro.levarPassear();
    System.out.println(cachorro.emitirSom());
    System.out.println(cachorro.amamentar());
}

}
