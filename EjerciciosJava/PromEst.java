import java.util.Scanner;
	class PromEst{
	public static void main(String args[]){
	Scanner mb=new Scanner(System.in);
	double mat1=0, mat2=0, mat3=0, prom=0;
	System.out.println( "Ingresa la calificacion de la primera materia: " );
	mat1=mb.nextDouble( );
	System.out.println( "Ingresa la calificacion de la segunda materia: " );
	mat2=mb.nextDouble( );
	System.out.println( "Ingresa la calificacion de la tercera materia: " );
	mat3=mb.nextDouble( );
	prom=(mat1 + mat2 + mat3)/3;
	System.out.printf( "Promedio general : " + prom );
	}
}