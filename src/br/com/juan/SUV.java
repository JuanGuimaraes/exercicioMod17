package br.com.juan;

public class SUV extends Carro{
	private boolean tracao4x4;

	public SUV(String marca, String modelo, boolean tracao4x4) {
			super(marca, modelo);
			this.tracao4x4 = tracao4x4;
	}
	
	public String toString() {
		 return super.toString() + ", SUV{tracao4x4=" + tracao4x4 + '}';
	}

}
