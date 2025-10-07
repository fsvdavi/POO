package br.edu.ifce.atv.heranca.Pizzaria;

public class Produto {
	private String nome;
	private double preco;
	private int tempoPreparo;
	private String categoria;
	private int calorias;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public int getTempoPreparo() {
    return tempoPreparo;
}

public void setTempoPreparo(int tempoPreparo) {
    this.tempoPreparo = tempoPreparo;
}

public String getCategoria() {
    return categoria;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public int getCalorias() {
    return calorias;
}

public void setCalorias(int calorias) {
    this.calorias = calorias;
}
}



