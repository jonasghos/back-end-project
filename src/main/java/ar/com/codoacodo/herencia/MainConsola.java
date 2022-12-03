package ar.com.codoacodo.herencia;

public class MainConsola {

	public static void main(String[] args) {
		
		Consola[] listado = Vendedor.listado();
		
		for( Consola c: listado) {
			c.detalle();
			
		}
	}

}
