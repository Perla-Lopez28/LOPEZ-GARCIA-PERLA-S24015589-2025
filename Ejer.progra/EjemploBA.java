import java.util.Scanner;
public class EjemploBA{
	public static void main(String []args){
		int mig[]=new int[5];
		Scanner migue= new Scanner(System.in);
			for(int i=0; i<5; i++){
				System.out.println("Introduce un numero entero: ");
				mig[i]=migue.nextInt();
				
			} 
			for(int j=0; j<5; j++){
				System.out.println("El valor que tiene el arreglo es: " + mig[j]);

			}
	}
}