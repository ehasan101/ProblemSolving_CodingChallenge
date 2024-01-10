
package prac1;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
    
    	Scanner inp = new Scanner(System.in);
    	
    	float num1 = inp.nextFloat();
    	float num2 = inp.nextFloat();
    	float num3 = inp.nextFloat();
    	float max = 0;
    	
    	if(num1 > num2) {
    		max = num1;
    		if(num1 > num3) {
    			max = num1;
    		}else {
    			max = num3;    			
    		}
    		
    	}else {
    		if (num2 > num3) {
    			max = num2;
    		} else {
    			max = num3;
    		}
    	}
    	
    	System.out.println("Largest Number: "+max);
    	inp.close();
    	
    	
    }
}