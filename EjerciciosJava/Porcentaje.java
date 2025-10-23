import java.util.Scanner;
public class Porcentaje{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
	double phombres=0, pmujeres=0, hombres=0, mujeres=0;
	int testudiantes=0;
	System.out.println("\t\tPorcentaje hombres y mujeres del salón ");
	System.out.println("Ingresa total de estudiantes del salón: ");
	testudiantes=mb.nextInt();
	System.out.println("Ingresa cuantos hombres hay: ");
	hombres=mb.nextInt();
	phombres=(hombres*100)/testudiantes;
	System.out.println("Ingresa total de mujeres del salón: ");
	mujeres=mb.nextInt();
	pmujeres=(mujeres*100)/testudiantes;
	System.out.println("El porcentaje de hombres es: " + phombres + "\nPorcentaje de mujeres= " + pmujeres);








	}
}