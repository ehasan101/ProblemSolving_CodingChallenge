package prac1;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = reader.nextInt();
        
        String Res = num%2==0 ? "Numer is Even":"Number is Odd";
        
        System.out.println(Res);
	in.close();

    }
}