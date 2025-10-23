import java.util.Scanner;
public class Temperaturas{
	public static void main(String []args){
	Scanner mb=new Scanner(System.in);
	double temperaturaC=0, temperaturaF=0, temperaturaA=0;
	System.out.println("Ingresa la temperatura en grados celsius: ");
	temperaturaC=mb.nextDouble();
	temperaturaF=(temperaturaC*1.8)+32;
	System.out.println("La temperatura en Farenheit es: " + temperaturaF);
	temperaturaA=temperaturaC+273.15;
	System.out.println("La temperatura Absoluta es: " + temperaturaA);





	}
}