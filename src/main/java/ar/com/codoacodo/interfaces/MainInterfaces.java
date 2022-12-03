package ar.com.codoacodo.interfaces;
import ar.com.codoacodo.idiomas.Person;
import  ar.com.codoacodo.idiomas.Dog;
import ar.com.codoacodo.idiomas.Español;
import ar.com.codoacodo.idiomas.IHablar;
import ar.com.codoacodo.idiomas.IIdioma;
import ar.com.codoacodo.idiomas.Ingles;

public class MainInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Creo una persona y un perro e invoco el metodo hablar
		
		IIdioma español = new Español();
		
		IIdioma ingles = new Ingles();
		
	    Person p = new Person("Jonas", español );
	     
	    Dog luna = new Dog("luna");
	     
	     //Otra forma de crear u
	     
	     p.tell("hola", ingles);
	     p.learn(ingles);
	     
	     
	     /*
	     IHablar[] colection = new IHablar[2];
	     
	     colection[0] = p;
	     colection[1] = luna;
	     
	     IHablar i = colection[0];
	     
	     //Para acceder a los metodos de una clases dentro de una interfaz es necesario castear la interfaz
	     //Como hacemos eso??? 
	     
	     //Person PDentroDeIHablar = (Person)i;
	     
	     //PDentroDeIHablar.tell("Jonas", "ingles");
	      */
	}
}
