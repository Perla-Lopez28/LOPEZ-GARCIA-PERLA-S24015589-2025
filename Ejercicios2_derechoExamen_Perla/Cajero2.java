import java.util.Scanner;

public class Cajero2 {
    public static void main(String[] args) {
        Scanner miguel = new Scanner(System.in);
        double saldo = 5000;
        String opcion;

        do{
            System.out.println("Monto a retirar:");
            double retiro = miguel.nextDouble();

            if(retiro <= saldo){
                saldo -= retiro;
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }

            System.out.println("¿Desea continuar? (si/no)");
            opcion = miguel.next();
        } while(seguir.equalsIgnoreCase("si"));
    }
}