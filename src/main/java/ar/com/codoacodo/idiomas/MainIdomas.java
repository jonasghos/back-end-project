package ar.com.codoacodo.idiomas;

public class MainIdomas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIdioma idioma = new Español();
		
		IIdioma newIdioma = new Ingles();
		
		IIdioma otroidioma = new Portugues();
		
		
		Person p = new Person("Jonas", idioma);
		
	
		p.tell("Hola mundo", idioma);
		p.learn(newIdioma);
		p.learn(otroidioma);
		p.hablar();
		
		p.decirAlgoEnOtroIdioma("Hola!" );




		 
		
		
	}

}
