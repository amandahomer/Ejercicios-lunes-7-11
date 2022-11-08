/*Este programa calcula el total de una factura 
a partir del IVA.
@AmandaNR */

public class Ejercicio6 {

	public static void main (String [] args) {
//Declaramos y las variables//
		int factura = 597;
		double iva, ivaFactura, total;
//Damos valor a las variables//
		iva = 0.21;
		ivaFactura = iva * factura;
		total = factura + ivaFactura;
//Se muestra por pantalla el total de la factura con iva incluido//
		System.out.println("El resultado de la factura con I.V.A. incluido es: " + total + " euros");
	}
}
 
