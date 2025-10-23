import java.util.Scanner;
public class Organizacion{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
	int categoria=0;	
	double salario=0, subsidio=0,horasTrabaxMes=0;
	  System.out.println("Salarios");                                                	
	System.out.println("Ingresa un numero de acuerdo a la categoria que pertecene");
	categoria=mb.nextInt();

		switch (categoria) {
		case 1:
		System.out.println("Ingresa cuantas horas trabajo en el mes");
		horasTrabaxMes=mb.nextDouble();
		salario=(horasTrabaxMes*125)*(0.928);
		System.out.println("El salario es de: " + salario);
			if (salario<1000){
				subsidio=(20000*0.15);
				System.out.println("Tiene subsidio:" +subsidio);
			}else{
				System.out.println("No tiene subsidio.");
			}
		break;
		case 2:
		System.out.println("Ingresa cuantas horas trabajo en el mes");
		horasTrabaxMes=mb.nextDouble();
		salario=(horasTrabaxMes*93.75)*(0.928);
		System.out.println("El salario es de: " + salario);
			if (salario<1000){
				subsidio=(15000*0.15);
				System.out.println("Tiene subsidio:" +subsidio);
			}else{
				System.out.println("No tiene subsidio.");
			}
		break;
		case 3:
		System.out.println("Ingresa cuantas horas trabajo en el mes");
		horasTrabaxMes=mb.nextDouble();
		salario=(horasTrabaxMes*62.5)*(0.928);
		System.out.println("El salario es de: " + salario);
			if (salario<1000){
				subsidio=(10000*0.15);
				System.out.println("Tiene subsidio:" +subsidio);
			}else{
				System.out.println("No tiene subsidio.");
			}
		break;
		case 4:
		System.out.println("Ingresa cuantas horas trabajo en el mes");
		horasTrabaxMes=mb.nextDouble();
		salario=(horasTrabaxMes*46.875)*(0.928);
		System.out.println("El salario es de: " + salario);
			if (salario<1000){
				subsidio=(7500*0.15);
				System.out.println("Tiene subsidio:" +subsidio);
			}else{
				System.out.println("No tiene subsidio.");
			}
		break;
		default:
		System.out.println("Ingrese un numero valido de acuerdo a la categoría entre 1-4");
		}
		
			
	}
}