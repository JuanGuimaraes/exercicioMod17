package br.com.juan;

public class Sedan extends Carro {
	private int capacidadePortaMala;

    public Sedan(String marca, String modelo, int capacidadePortaMala) {
        super(marca, modelo);
        this.capacidadePortaMala = capacidadePortaMala;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sedan{capacidadePortaMala=" + capacidadePortaMala + '}';
    }
}
