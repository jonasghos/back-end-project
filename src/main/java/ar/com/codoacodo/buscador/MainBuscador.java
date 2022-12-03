package ar.com.codoacodo.buscador;

public class MainBuscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar objeto buscar
		
		Buscador miBuscador = new Buscador();
		
		//Ingreso la clave de busqueda
		miBuscador.setKeyWord("iron Man");
		
		//Ejecuto la busqueda
		miBuscador.find();
		
		//Obtengo los resultados de la busqueda
		Articulo[] res =  miBuscador.getResults();
		
		for( Articulo article : res ) {
			
			article.detail();
		}
		
		miBuscador.getCount();

	}

}
