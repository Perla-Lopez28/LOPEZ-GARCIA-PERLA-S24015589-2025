import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner miguel = new Scanner(System.in);
        int opcion;
        String continuar;

        do {
            System.out.println("1. Consulta saldo");
            System.out.println("2. Pago Mensual");
            System.out.println("3. Pago Adeudo");
            System.out.println("4. Salir");
            opcion = miguel.nextInt();

            if(opcion >= 1 && opcion <= 3){
                System.out.println("Adeudo: $1000.00");
            }

            System.out.println("¿Desea continuar? (si/no)");
            continuar = miguel.next();
        } while(continuar.equalsIgnoreCase("si"));

        System.out.println("Fin del programa");
    }
}