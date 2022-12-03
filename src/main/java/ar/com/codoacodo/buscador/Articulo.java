package ar.com.codoacodo.buscador;

public class Articulo {
	
	//Attributes of an item
	private String img ;
	private String title;
	private String author;
	private double price;
	
	public Articulo(String img, String title, String author, double price){
		this.img  = img;
		this.title = title;
		this.author = author;
		this.price = price;
		
		
		
	}

	public void detail() {
		// TODO Auto-generated method stub

			System.out.println("Articulo: " + title + "\n Author: " + author + "\n Price: " + price + "\n Url: " + img );

		
	}
	
}
