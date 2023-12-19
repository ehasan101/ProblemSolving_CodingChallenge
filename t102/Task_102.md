

## TASK:
Write a Java program that takes a string as input and prints the reverse of the string, \
Also Test your program with different input strings to ensure it works correctly.



## INPUT SAMPLE:
Input: “Qtec” \
Output: “cetQ”



## SOLUTION:

``` Java
package prac1;

import java.io.*;
import java.util.Scanner;

class t102 {
	
    public static void main (String[] args) {
    	System.out.print("Enter Your Strings: ");
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();   //input data from user & store on 'input' variable
        String output = ""; //'output' variable initialize it with 0
        
        for (int i = input.length()-1; i >= 0; i--) {
        	 output = output + input.charAt(i); //store new data in 'output' variable
		} 
/*
1. for loop ➔  To get the characters of the input in the reverse order.
2. input.length()-1 ➔ Because characters in the string are indexed from 0.
3. input.charAt(i) ➔  Returns character value to the index of the string and store it in 'output'
*/
        
        System.out.println("Your Reversed Strings is: "+output); //finally result print from 'output' variable
         
    }
}
    
```
## TEST PORGRAM WITH DIFFERENT INPUT:
![1](https://drive.google.com/uc?export=view&id=1y2SqieFWt7VZcBH4r0TxverxUlcWeGaR)
![2](https://drive.google.com/uc?export=view&id=1Q5b4JF6DPr2a07qw1_pX1U1_ZKx9UEds)
![3](https://drive.google.com/uc?export=view&id=1Tw8yB95eHjcX3UugwCcvv118mfcX3H42)


---
### **#Happy_Coding**
---






