import java.util.Scanner;
 public class Convertirmetros{
	public static void main(String []args){
	Scanner mb=new Scanner(System.in);
	System.out.println(" Ingresa cuantos metros son: " );
	double metros=0, pulgadas=0, pies=0;
	int opcion=0;
	metros= mb.nextDouble();	
	System.out.println(" Seleccione 1 para convertir metros a pies. ");
	System.out.println(" Seleccione 2  para convertir metros a pulgadas. ");
	opcion= mb.nextInt();
	pulgadas= metros*39.37;
	pies= metros*3.28084;

	if (opcion ==1) {
		System.out.println("Total Pies= " + pies);
	}
	else
	{	
		System.out.println("Total Pulgadas= " + pulgadas);
	}


	}
}