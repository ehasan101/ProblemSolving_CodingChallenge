package prac1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float A = in.nextFloat();
		float B = in.nextFloat();
		
		System.out.println("Before Swap");
		System.out.println("Number1: "+A+" Number2: "+B);
		in.close();
		
		float temp = A;
		A = B;
		B = temp;
		
		System.out.println("\nAfter Swap");
		System.out.println("Number1: "+A+" Number2: "+B);
		in.close();

	}
}
