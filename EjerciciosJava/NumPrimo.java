import java.util.Scanner;
public class NumPrimo {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = mb.nextInt();
        boolean primo = true;

        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo)
            System.out.println("El número es Primo" + n);
        else
            System.out.println("El número no es Primo" + n);
    }
}