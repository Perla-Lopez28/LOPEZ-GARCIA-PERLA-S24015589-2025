import java.util.Scanner;
public class Meses{
	public static void main(String []args){
		int mig[]=new int[12];
		Scanner migue= new Scanner(System.in);
			for(int i=0; i<12; i++){
				System.out.println("Introduce los días en números enteros: ");
				mig[i]=migue.nextInt();
				
			} 
			for(int j=0; j<12; j++){
				System.out.println("Los días de los meses son: " + mig[j]);

			}
	}
}