import java.util.Scanner;
public class AreaCirculo{
	public static void main(String []args){
	Scanner mb=new Scanner(System.in);
	double radio=0, pi=3.1416, area=0;
	System.out.println("\t\tArea del Circulo");
	System.out.println("Ingresa el radio: ");
	radio=mb.nextDouble();
	area=pi*(radio*radio);
	System.out.println("El Área del circulo es: " + area);




	}

}