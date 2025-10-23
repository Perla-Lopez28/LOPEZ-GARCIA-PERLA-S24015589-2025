import java.util.Scanner;
public class Pulsaciones{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
	int edad=0, segundos=10;
	double numpulsaciones=0;
	System.out.println("\t\tPulsaciones ");		
	System.out.println("Ingresa tu edad: ");
	edad=mb.nextInt();
	numpulsaciones= (220-edad)/segundos;
	System.out.println("Numero de pulsaciones es: " + numpulsaciones);
	






	}
}