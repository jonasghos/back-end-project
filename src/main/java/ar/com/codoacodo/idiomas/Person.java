package ar.com.codoacodo.idiomas;

import java.util.Iterator;

public class Person implements IHablar{
	//Attributes
	private String name;
	private  IIdioma nativeLanguage;
	private  IIdioma[] othersLanguage;
	
	public Person(String name, IIdioma language){
		this.name = name;	
		this.nativeLanguage = language;
		this.othersLanguage = new IIdioma[0];
		
	}
	
	public void speak() {
		System.out.println(this.name + " sabe hablar: ");
		System.out.println(nativeLanguage);
		for(IIdioma idioma : this.othersLanguage) {
			System.out.println(idioma);
		}
		
	}
	
	public void tell(String word, IIdioma idioma) {
		if (this.nativeLanguage == idioma) {
			System.out.println(this.name + " dice: " + word);
		}else {
			System.out.println(this.name + " no sabe decir: " + word + " en ese idioma");
		}
	}
	
	public void learn(IIdioma newLanguage) {

		if(this.nativeLanguage.equals(newLanguage)){
			System.out.println("La persona ya habla ese " + newLanguage);
		} else {
			System.out.println(this.name + " aprende: " + newLanguage);
			this.othersLanguage = copiarIdiomas(newLanguage);
		}
		/*if(this.nativeLanguage.equals(newLanguage)|| this.othersLanguage.equals(newLanguage)) {
			System.out.println(this.name + " ya habla ese idoma.");
		} else {
			System.out.println(this.name + " aprendio un nuevo idioma: " + newLanguage);
			this.othersLanguage[0] = newLanguage;
			System.out.println(this.othersLanguage);
			
			System.out.println("Idiomas aprendidos: ");
			for(int i = 0 ; i < this.othersLanguage.length ; i++) {
				
			}
			System.out.println(this.othersLanguage);
			}*/
			

			
		}
	
	public IIdioma[] copiarIdiomas(IIdioma language) {
		IIdioma [] aux = new IIdioma[othersLanguage.length + 1];
		for (int i = 0; i < othersLanguage.length  ; i++) {
			aux [i] = othersLanguage[i];
			
		}
		aux[aux.length -1] = language;
		return aux;
	}
	

	public void hablar() {
		// TODO Auto-generated method stub
		
		System.out.println("Idioma nativo: " + this.nativeLanguage);
		System.out.println("Idiomas aprendidos: ");
		for (int i = 0; i < othersLanguage.length; i++) {				
			System.out.println( othersLanguage[i]);
		}
	}
	
	public void decirAlgoEnOtroIdioma(String algo) {
		//decir algo en el idioma nativo
		this.nativeLanguage.decir(algo);
		
		//si sabe hablar en otros idiomas
		/*	for(int i = 0 ; i < this.othersLanguage.length; i++) {
				this.othersLanguage[i].decir(algo);
			}*/
		
		//recorro otros idiomas con un foreach
		for(IIdioma aux : this.othersLanguage) {
			aux.decir(algo);
		}
		}
		//
	
}
	
	

