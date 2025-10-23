import java.util.Scanner;
class Capital{
	public static void main(String args[]){
	Scanner mb= new Scanner(System.in);
	double capital=0, ganancia=2, total=0;
	System.out.println( "Ingresa la cantidad a invertir: " );
	capital= mb.nextDouble( );
	ganancia= (capital * 2) / 100;
	System.out.println( " Tu ‌inversion realizada es de: " + capital +  " \nY tu ganancia mensual del 2% es: " + ganancia );
	}
}