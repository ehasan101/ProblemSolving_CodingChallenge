package prac1;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int A = in.nextInt();
    	int B = in.nextInt();
    	
    	int C = (A < B) ? (A*B):(A+B);
    	
    	System.out.println(A+", "+B+" = "+C);
	in.close();

    }
}