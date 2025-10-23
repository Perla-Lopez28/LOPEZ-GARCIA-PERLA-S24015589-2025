import java.util.Scanner;
public class Consecionaria{
	public static void main(String args[]){
	Scanner mb=new Scanner(System.in);
	double comision=0, venta=0, v1, v2, v3, v4, total=0;
	System.out.println("\t\t CONSECIONARIA");
	System.out.println( "Ingresa el monto de todas tus ventas " );
	System.out.println( "Ingresa el monto de  tu venta 1. " );
	v1= mb.nextDouble( );
	System.out.println( "Ingresa el monto de  tu venta 2. " );
	v2= mb.nextDouble( );
	System.out.println( "Ingresa el monto de  tu venta 3 " );
	v3= mb.nextDouble( );
	System.out.println( "Ingresa el monto de  tu venta 4. " );
	v4= mb.nextDouble( );
	venta=(v1+v2+v3+v4);

	if (venta == 10000 )
	comision= venta * 0.02;
		else if (venta>10000000 && venta<=15000000)
		comision =venta* 0.04;
			else if ( venta <15000000);
			comision=venta * 0.1;
	System.out.println( " Tu comision fue: " + comision );	
	}
}
