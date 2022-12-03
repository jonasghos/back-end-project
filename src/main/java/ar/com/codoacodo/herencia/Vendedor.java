package ar.com.codoacodo.herencia;

public class Vendedor {
	public static Consola[] listado() {
		
		// Consola c = new Consola();
		var p = new PlayStation(2);
		var p1 = new PlayStation(1);
		var p2 = new PlayStation(3);
		var n = new NintendoSwitch();
		var s = new SegaGenesis();
		
		
		Consola[] listado  = new Consola[] {p,p1,p2, n, s};
		

		
		return listado;
		
	}
 }
