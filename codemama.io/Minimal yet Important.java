import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    	 Scanner inp = new Scanner(System.in);
         int num1 = inp.nextInt();
         int num2 = inp.nextInt();
         int num3 = inp.nextInt();
         int min=0;

         if(num1 < num2){
             if (num1 < num3) {
            	 min = num1;
             }
             else {
            	 min = num3;
             }
       	 
         }  
          else {
        	  min = num2;
        	  if(num3 > num2) {
	        	  min = num2; 
        	 }
        	 else {
        		 min = num3;
        	}	  
          }
         
     System.out.println(min);    
     inp.close();
     }
 }


