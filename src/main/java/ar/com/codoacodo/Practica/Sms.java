package ar.com.codoacodo.Practica;

public class Sms implements IMensaje{
	
	
	public void CargarCel(int numero, double monto) {
		System.out.println("Se cargaron $" + monto + " al celular: " + numero);
	}
	
	
	public void enviar(String msj) {
		System.out.println(msj + "SMS enviado");
	}
}
