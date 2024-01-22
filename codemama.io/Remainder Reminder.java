import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    	Scanner inp = new Scanner(System.in);
    	
    	int num1 = inp.nextInt();
    	int num2 = inp.nextInt();
    	int reminder = num1 % num2;
    	
    	System.out.println(reminder);
        inp.close();
    	
    	
    	
    }
}
