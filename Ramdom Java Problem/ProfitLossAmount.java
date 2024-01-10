package prac1;

import java.util.Scanner;

public class ProfitLossAmount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		float sellingPrice = in.nextFloat();
		float costPrice = in.nextFloat();
		
		float loss = sellingPrice - costPrice;
		
		System.out.println(loss);
		in.close();

	}

}
