
package prac1;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dividend = in.nextInt();
		int divisor = in.nextInt();
		
		int qua = dividend/divisor;
		int rem = dividend%divisor;
		
		System.out.println("Qoatient: "+qua+"\nRemainder: "+rem);
		in.close();


	}

}
