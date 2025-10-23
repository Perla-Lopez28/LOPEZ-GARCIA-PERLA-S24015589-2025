import java.util.Scanner;
public class Supermercado {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
	System.out.println("\t\tSUPERMERCADO");
        System.out.print("Total de la compra: ");
        double total = mb.nextDouble();
        System.out.print("Número escogido al azar: ");
        int num = mb.nextInt();

        double descuento;
        if (num < 74) {
            descuento = total * 0.15;
        } else {
            descuento = total * 0.20;
        }

        double totalFinal = total - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}