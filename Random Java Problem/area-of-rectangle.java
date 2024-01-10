package prac1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int breadth = input.nextInt();
      
        int area = length*breadth;
        System.out.println(area);
        input.close();
    }
}