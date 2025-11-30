import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner beni = new Scanner(System.in);
        int n = beni.nextInt();

        for(int m = 1; m <= 10; m++){
            System.out.println(n + " x " + m + " = " + (n*m));
        }
    }
}