package pacote2private;

import pacote1private.Classe1;

public class Classe2 {
	private String atributo1;
    private boolean atributo2;
    private float atributo3;

    public String getAtributo1() {
        return atributo1;
    }
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }
    

    public boolean isAtributo2() {
        return atributo2;
    }
    public void setAtributo2(boolean atributo2) {
        this.atributo2 = atributo2;
    }

    
    public float getAtributo3() {
        return atributo3;
    }
    public void setAtributo3(float atributo3) {
        this.atributo3 = atributo3;
    }

    
    public static void main(String[] args) {
        // Instância de Classe1
        Classe1 objeto1 = new Classe1();
        objeto1.setAtributo1("Texto");
        objeto1.setAtributo2(11);
        objeto1.setAtributo3(9.99);

        // Instância de Classe2
        Classe2 objeto2 = new Classe2();
        objeto2.setAtributo1("Texto");
        objeto2.setAtributo2(false);
        objeto2.setAtributo3(15.15f);
}
} 
