import java.util.Scanner;
public class Universidad{
	public static void main(String []args){
		Scanner mb= new Scanner(System.in);
		System.out.println("\t\t CALIFICACIONES UNIVERSIDAD ");
		System.out.println("Valoracion en letras: P, M, R, B, E. ");
	 	double nota=0;
		System.out.println("Ingresa tu nota NUMERICA: ");
		nota=mb.nextDouble();
		
				if (nota<=1.0) {
					System.out.println(" Calificación: P ");	
				}else if (nota>=1.1 && nota <=2.0) {
					System.out.println(" Calificación M ");
				}else if (nota>=2.1 && nota <=2.9) {
					System.out.println(" Calificación R ");
				}else if (nota>=3.0 && nota <= 4.0) {
					System.out.println(" Calificación B ");
				}else if (nota>=4.1 && nota <=5.0) {
					System.out.println(" Calificación E ");
				}else{
					System.out.println(" Escriba una calificación valida entre 0 y 5.");	
				
	
			}
	}
}