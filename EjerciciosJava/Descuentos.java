import java.util.Scanner;
class Descuentos{
	public static void main(String args[]){
	Scanner mb= new Scanner(System.in);
	double descuento=0, ci=0, cf=0;
	System.out.println("\tTIENDA");
	System.out.println("Ingresa tu compra inicial: ");
	ci = mb.nextDouble( );
	descuento=(ci*15)/100;
	 cf=ci - descuento ;
	System.out.println( " =====RECEPCION=====" );
 	System.out.println( " El monto de tu compra inicial es:" + ci + " \nTu descuento de 15% es: " + descuento + " \nTotal a pagar:" + cf );
	}
