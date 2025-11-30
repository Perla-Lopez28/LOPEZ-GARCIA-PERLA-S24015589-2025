import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {
        Scanner miguelbeni = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int m = 0; m < 10; m++){
            numeros[m] = miguelbeni.nextInt();
        }

        for(int m = 9; m >= 0; m--){
            System.out.println(nums[m]);
        }
    }
}