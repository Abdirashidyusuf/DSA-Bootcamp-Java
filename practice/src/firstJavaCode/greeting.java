package firstJavaCode;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        // this program print greeting message

        //create scanner
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter the name: ");
        String name=input.next();

        //display greeting
        System.out.println("Assalamu caleykum " + name);
    }
}
