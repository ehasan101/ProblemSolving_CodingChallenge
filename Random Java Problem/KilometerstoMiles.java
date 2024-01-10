

import java.util.Scanner;

class KilometerstoMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double km = in.nextDouble();
        double miles = km/1.6;
        
        System.out.println(km+" KM is to "+miles+" Miles");   

        in.close();
    }
}