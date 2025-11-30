import java.util.Scanner;

public class CalificacionesR {
    public static void main(String[] args) {
        Scanner beni = new Scanner(System.in);
        int aprobados = 0, reprobados = 0;
        int suma = 0;

        for(int b = 1; b <= 5; b++){
            int cal = beni.nextInt();
            suma += cal;
            if(cal >= 6) aprobados++;
            else reprobados++;
        }

        double promedio = suma / 5.0;

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Promedio: " + promedio);
    }
}