import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) {
        Scanner migue = new Scanner(System.in);
        int[] numeros = new int[8];

        for(int i = 0; i < 8; i++){
            numeros[i] = migue.nextInt();
        }

       		 int buscar = migue.nextInt();
      			  boolean existe = false;

      				  for(int i = 0; i < 8; i++){
         				   if(nums[i] == buscar){
                				existe = true;
           				 }
        			}

        			if(existe){ 
					System.out.println("Sí existe");
				}else{ 
					System.out.println("No existe");
    }
}