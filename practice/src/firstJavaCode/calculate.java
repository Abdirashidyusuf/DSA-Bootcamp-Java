package firstJavaCode;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        // calculate two numbers

        //create scanner
        Scanner input = new Scanner(System.in);

        //prompt user for input
        System.out.print("Enter number one: ");
        int num1=input.nextInt();
        System.out.print("Enter number two: ");
        int num2=input.nextInt();
        System.out.print("Enter symbol: ");
        char symbol = input.next().charAt(0);

        //condition
        if(symbol == '+')
            System.out.println( num1 + num2);
        if(symbol == '-')
            System.out.println( num1 - num2);
        if(symbol == '*')
            System.out.println(num1*num2);
        if(symbol == '/')
            System.out.println(num1/num2);
        else
            System.out.println("Not know symbol");

    }
}
