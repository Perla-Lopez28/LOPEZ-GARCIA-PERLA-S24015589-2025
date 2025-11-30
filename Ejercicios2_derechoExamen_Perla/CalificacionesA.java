import java.util.Scanner;

public class CalificacionesA {
    public static void main(String[] args) {
        Scanner miguelbeni = new Scanner(System.in);
        int[] calif = new int[6];
        int sum = 0;

        for(int m = 0; m < 6; m++){
            calif[i] = miguelbeni.nextInt();
            sum += calif[m];
        }

        double promedio = sum / 6.0;

        System.out.println("Calificaciones:");
        for(int m = 0; m < 6; m++){
            System.out.println(calif[m]);
        }

        System.out.println("Promedio: " + promedio);
    }
}