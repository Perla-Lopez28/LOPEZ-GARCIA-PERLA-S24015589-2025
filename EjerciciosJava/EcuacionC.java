import java.util.Scanner;
public class EcuacionC{
	public static void main(String args[]){
	Scanner mb = new Scanner(System.in);
	double A,B,C,resultado,raiz,raiz1,raiz2;
	System.out.print("Ingresa el valor del coeficiente A ");
	A=mb.nextDouble();
	System.out.print("Ingresa el valor del coeficiente B ");
	B=mb.nextDouble();
	System.out.print("Ingresa el valor del coeficiente C ");
	C=mb.nextDouble();
	if(A==0){
	System.out.println("El valor de: A no deber ser cero");
}
	resultado=(B*B)-(4*A*C);
	if(resultado<0){
	System.out.println("Error las raices no pueden ser imaginarias");
}
	raiz=Math.sqrt(resultado);
	raiz1=(-B + raiz)/(2*A);
	raiz2=(-B - raiz)/(2*A);
	System.out.println("Su valor de las raices reales es de : " + raiz1 + " y " + raiz2);
		}
}