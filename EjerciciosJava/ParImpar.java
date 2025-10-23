import java.util.Scanner;
public class ParImpar{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
		System.out.println("\t\t PAR O IMPAR");
		double num=0;
		System.out.println("Ingresa un numero");
		num=mb.nextDouble();
		if (num/2 ==0){
			System.out.println("Es numero Par");
		}else{
			System.out.println("Es numero Impar");
		}

	}
}