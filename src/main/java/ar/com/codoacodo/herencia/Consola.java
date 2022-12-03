package ar.com.codoacodo.herencia;

//Una clase abtracta no se ouede instanciar
public abstract class Consola {
	//Defino los atributos de la clase padre.
	//Al definir un atributo como protected (#) el hijo los hereda como private(-)

	protected int bit;
	private String name;
	
	public Consola(int bit, String name) {
		this.bit = bit;
		this.name = name;
	}
	
	public int getBit() {
		return this.bit;
	}

	public String getName() {
		return name;
	}
	
	public void detalle() {
		System.out.println(this.GetNameAndBit());
	}
	
	public String GetNameAndBit() {
		return "Consola: " + name + " - Bits: " + bit;
	}
	
}

