import java.util.Scanner;
public class Edad{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
	int anioN=0, anioA=0, edad=0;
	System.out.println("Ingresa tu año de nacimiento: ");
	anioN=mb.nextInt();
	System.out.println("Ingresa el año actual: ");
	anioA=mb.nextInt();
	edad=anioA-anioN;
	System.out.println("Tu edad es: " + edad);
	

	}
}