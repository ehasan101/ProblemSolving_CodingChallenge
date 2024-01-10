package prac1;

import java.util.Scanner;

public class TernaryOperator  {

    public static void main(String[] args) {
    	Scanner inp = new Scanner(System.in);
    	
    	int A = inp.nextInt();
    	int B = inp.nextInt();
    	
    	int res = (A < B)? B : A;
    	System.out.println("Max Number: "+res);
    	
    	inp.close();

    }
}