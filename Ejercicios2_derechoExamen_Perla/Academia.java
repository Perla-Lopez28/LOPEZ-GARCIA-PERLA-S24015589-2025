import java.util.Scanner;

public class Academia{
    public static void main(String[] args) {
        Scanner mig = new Scanner(System.in);
        int[][] idioma = new int[3][4];

        	for(int i = 0; i < 12; i++){
            		int nivel = mig.nextInt();
            		int idi = mig.nextInt();
            		idioma[nivel][idi]++;
        	}

        			for(int i = 0; i < 3; i++){
            				for(int j = 0; j < 4; j++){
                				System.out.print(idioma[i][j] + " ");
            				}
            				System.out.println();
        			}
    }
}