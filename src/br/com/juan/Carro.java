package br.com.juan;

public class Carro {
	private String marca;
	private String modelo;
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
		
	}

}
