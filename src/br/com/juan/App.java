package br.com.juan;

public class App {
	public static void main(String[] args) {
		
		ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();
		
		Carro generico = new Carro("Genérico", "Modelo X");
        SUV suv = new SUV("Jeep", "Compass", true);
        Sedan sedan = new Sedan("Toyota", "Corolla", 470);
        
        listaDeCarros.adicionarCarro(generico);
        listaDeCarros.adicionarCarro(suv);
        listaDeCarros.adicionarCarro(sedan);
        
        listaDeCarros.listarCarros();

        listaDeCarros.removerCarro(suv);

        listaDeCarros.listarCarros();
	}
}
