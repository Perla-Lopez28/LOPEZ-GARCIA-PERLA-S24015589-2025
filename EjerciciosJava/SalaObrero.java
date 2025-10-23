import java.util.Scanner;
public class SalaObrero{
	public static void main(String args[]){
	Scanner mb=new Scanner(System.in);
	System.out.println("\t\tSALARIOS");
	double salante, salactual, aumento;
	System.out.println( "Ingresa tu salario anterior: " );
	salarioanterior=mb.nextDouble( );
	aumento=(salante * 0.25);
	salactual=salante + aumento;
	System.out.println( "\t\tSALARIO ACTUAL " );
	System.out.println( "Tu sueldo anterior era:" + salante );
	System.out.println( " El aumento de tu salario es:" + aumento ); 
	System.out.println( " Ahora tu sueldo es: " +  salactual );
	}
}