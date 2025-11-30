public class Ahorro {
    public static void main(String[] args) {
        double ahorro = 500;
        double total = 0;

        for(int m = 1; m <= 12; m++){
            total += ahorro;
            total += total * 0.09;
        }

        System.out.println("Total ahorrado al final del año: " + total);
    }
}