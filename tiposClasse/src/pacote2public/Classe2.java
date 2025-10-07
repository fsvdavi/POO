package pacote2public;

import pacote1public.Classe1;

public class Classe2 {
	public String atributo1;
    public boolean atributo2;
    public float atributo3;

    public static void main(String[] args) {
        // Instância da Classe1
        Classe1 objeto1 = new Classe1();
        objeto1.atributo1 = "Texto ";
        objeto1.atributo2 = 16;
        objeto1.atributo3 = 3.14;

        // Instância da Classe2
        Classe2 objeto2 = new Classe2();
        objeto2.atributo1 = "Texto";
        objeto2.atributo2 = true;
        objeto2.atributo3 = 1.97f;

	}

}
