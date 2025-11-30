import java.util.Scanner;
class Pares{
	public static void main(String []args){
		Scanner mig= new Scanner(System.in);
			System.out.println("\tNumeros Pares 1 al 20: ");
			int num=0;
			while(num<=20){
				if(num % 2 == 0){
				System.out.println("Son " + num);
				}
			num++;
			}


	}
}