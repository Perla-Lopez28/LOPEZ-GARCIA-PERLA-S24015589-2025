import java.util.Scanner;
public class Llamada{
	public static void main(String []args){
	Scanner mb=new Scanner(System.in);
	double pago=0, minutos=0;
	System.out.println("\t\t PAGO LLAMADA TELEFONICA");
	System.out.println("Introduce los minutos consumidos en la llamada");
	minutos=mb.nextDouble();
	System.out.println("Tomando en cuenta que hasta 3 min de llamada son $10 \nY que un minuto adicional cuesta $1");
		pago=10 + minutos;
		if (minutos<=3){
			System.out.println("La cantidad a pagar es 10");
		}else{
			System.out.println("La cantidad a pagar es: " +pago);
		}
			

	}
}