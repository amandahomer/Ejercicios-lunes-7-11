/*Conversion de tipos
@AmandaNR */

public class EjemploConversion {

	public static void main (String [] args) {
		int x = 2;
		int y = 9;
		double division;
		int division1;
		
		division = (double) y / (double) x;
		division1 = y / x;
		
		System.out.println("El resultado de la division es " + division);
		System.out.println("El resultado de la division sin double es " + division1);
		
	
	}
}
