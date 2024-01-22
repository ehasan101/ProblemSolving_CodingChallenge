import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //System.out.println("Enter the temperature in Celsius");
        float Celsius = inp.nextFloat();
        //float Celsius=32;
        double Fahrenheit = (Celsius * 1.8) + 32;

        System.out.println("The temperature in Fahrenheit is: "+ String.format("%.2f", Fahrenheit));

    
    }
}