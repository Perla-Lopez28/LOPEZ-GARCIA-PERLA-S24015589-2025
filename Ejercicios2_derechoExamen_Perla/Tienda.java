import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner miguelb = new Scanner(System.in);
        double[] ven = new double[7];
        double total = 0;
        double mayor = 0;
        int diaM = 0;

        	for(int i = 0; i < 7; i++){
            		ven[i] = miguelb.nextDouble();
            		total += ven[i];
            			if(ventas[i] > mayor){
                			mayor = ven[i];
                			diaM = i + 1;
            			}
        	}

        			System.out.println("Venta total: " + total);
        			System.out.println("Día de mayor venta: " + diaM);
    }
}