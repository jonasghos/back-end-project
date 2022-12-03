package ar.com.codoacodo.buscador;

public class Buscador {
	//atributos
	
	private String keyWord;
	private int count;
	private Articulo[] results;
	
	
	//metodos 
	/*void: no devuelve nada en el metodo*/
	
	
	public void Buscador() {
		
	}
	
	public void find() {
		//Crear 2 articulos y meterlos dentro de la variable resultados
		

		//cargar en cada posición un articulo. 
		Articulo res1 = new Articulo("https://img.freepik.com/foto-gratis/fondo-cosmico-luces-laser-colores-perfecto-fondo-pantalla-digital_181624-32870.jpg", keyWord, "Stan Lee", 2500);
		Articulo res2 = new Articulo("https://img.freepik.com/foto-gratis/tipo-barbudo-seguro-mantiene-manos-cintura-listo-defensa-mira-mirada-fuerte-poderosa-directamente-camara-usa-casco_273609-29907.jpg", keyWord, "Stan Lee", 2650);
		
		
		
		//Creo el Array 
		results = new Articulo[2];
		results[0]= res1;
		results[1]= res2;
		
		
		//Cantidad de resultados
		count = results.length;
		
	}
	
	public void setKeyWord(String newKeyWord) {
		keyWord = newKeyWord;
	}
	
	public Articulo[] getResults(){
		return results;
	}
	public int getCount() {
		return count;
		
	}
}
