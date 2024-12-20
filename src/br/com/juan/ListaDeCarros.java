package br.com.juan;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T>  {
	
	private List<T> carros = new ArrayList<>();
	
	public void adicionarCarro(T carro) {
		carros.add(carro);
	}
	
	public void removerCarro(T carro) {
		carros.remove(carro);
	}
	
	public void listarCarros() {
		System.out.println("Lista de carros:");
		for(T carro : carros) {
			System.out.println(carros.toString());
		}
	}

}
