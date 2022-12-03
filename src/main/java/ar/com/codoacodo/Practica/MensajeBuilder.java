package ar.com.codoacodo.Practica;

public class MensajeBuilder {
	
	//Declaro la clase como static para evitar instanciarla
	
	public static  IMensaje BuildMsj(String destino) {
		
		/* Formas de instanciar una clase:
		 * SMS msj = new SMS(); Puedo acceder a los metodos propiios de la clase msj y tambien a los implementados por la interfaz pero para este caso deberia generar una variable para cada clase.
		 * IMensaje msj = new SMS(); Puedo acceder unicamente a los metodos propios de la interfaz, pero me da la posibilidad de modificar la clase del lado derecho siempre y cuando  implementen la intterfaz
			
		 
		 * */
		IMensaje msj;
		
		switch (destino) {
		case "A":
			msj = new Sms();
			break;
		case "B":
			msj = new Db();
			break;
		case "C":
			msj = new Mail();
			break;
		case "D":
			msj = new FileSystem();
			break;
		default:
			msj = null;
			System.out.println("La implementacion " + destino + " no existe.");
			break;
		}
		
		return msj;
	}
}
