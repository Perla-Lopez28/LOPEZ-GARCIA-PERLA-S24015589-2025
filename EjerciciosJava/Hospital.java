import java.util.Scanner;
public class Hospital{
	public static void main(String []args){
	Scanner mb= new Scanner(System.in);
	System.out.println("\t\t PRESUPUESTO HOSPITAL");
	double presupuesto=0	, ginecologia=0, trauma=0, pediatria=0;
	System.out.println("Ingrese la cantidad total de presupuesto: ");
	presupuesto=mb.nextDouble();
	System.out.println("El presupuesto se dividirá de la siguiente forma: \nGinecologia 40% \nTraumatologia 30% \nPediatria 30%");
	ginecologia=(presupuesto*0.40);
	trauma=(presupuesto*0.30);
	pediatria=(presupuesto*0.30);
	System.out.println("El presupuesto quedaría así: " + "\nGinecologia= " + ginecologia + "\nTraumatologia= " + trauma +  "\nPediatria= " +pediatria);





	}
} 