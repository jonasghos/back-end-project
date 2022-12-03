package ar.com.codoacodo.herencia;

public class PlayStation extends Consola{
	
	private int version; 
	
	public PlayStation(int version) {
		super(1024, "PlayStation");
		
		this.version = version;
		// TODO Auto-generated constructor stub
	}
	
	public int getVersion() {
		return this.version;
	}

}
