package ar.com.codoacodo.Practica;

public class MainPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Metodo de clase, no de instancia.
		//no necesito crear un obeto de la clase Mensaje 
		String destino = "C";
		String mensaje = "Hola mundo!";
		
		//al agregar la palabra "static" en el la declaracion de la clase, evitamos crear el objecto de la clase como var x = new clase();
		
		IMensaje msj = MensajeBuilder.BuildMsj(destino);
		
		if(msj != null) {
			msj.enviar(mensaje);
		}
		
		

}
}
