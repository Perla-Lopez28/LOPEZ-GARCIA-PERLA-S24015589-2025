import java.util.Scanner;
public class Valores{
	public static void main(String args[]){
	Scanner mb= new Scanner(System.in);
	double valor1=0, valor2=0, valor3=0, promedio=0;
	System.out.println("\tNumero mayor, menor, promedio o igual. ");
	System.out.println("Ingresa el primer numero=valor1");
	valor1=mb.nextInt();
	System.out.println("Ingresa el segundo numero=valor2");
	valor2=mb.nextInt();
	System.out.println("Ingresa el tercer numero=valor3");
	valor3=mb.nextInt();
	promedio=(valor1+valor2+valor3)/3;
	
		if(valor1>=valor2 && valor1>=valor3){
		System.out.println("Valor1:" +valor1 + " es mayor que: " +valor2 + " y " + valor3);
		}
		else if(valor2>=valor1 && valor2>=valor3){
		System.out.println("Valor2:" +valor2 + " es mayor que: " +valor1 + " y " + valor3);
		}
		else
		{
		System.out.println("Valor3:" +valor3 + " es mayor que: " +valor1 + " y " + valor2);
		}

		if(valor1<=valor2 && valor1<=valor3){
		System.out.println("Valor1:" +valor1 + " es menor que: " +valor2 + " y " + valor3);
		}
		else if(valor2<=valor1 && valor2<=valor3){
		System.out.println("Valor2:" +valor2 + " es menor que: " +valor1 + " y " + valor3);
		}
		else
		{
		System.out.println("Valor3:" +valor3 + " es menor que: " +valor1 + " y " + valor2);
		}
		System.out.println("El promedio de los valores es: " + promedio);

	}
}