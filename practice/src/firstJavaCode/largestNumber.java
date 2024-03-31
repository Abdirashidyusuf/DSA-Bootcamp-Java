package firstJavaCode;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        //program print largest number

        //create scanner
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter the number one: ");
        int num1=input.nextInt();
        System.out.print("Enter number two: ");
        int num2 = input.nextInt();

        //check the largest number
        if(num1 > num2){
            System.out.println("The largest number is: " + num1);
        }
        if(num2 > num1)
            System.out.println("The largest number is: " + num2);
    }
}
