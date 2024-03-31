package firstJavaCode;

import java.util.Scanner;

public class NumberEvenOrOdd {
    public static void main(String[] args) {
        // program check number is even or odd

        //crete scanner
        Scanner input=new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter the number: ");
        int number=input.nextInt();
         // check number is even or odd
        if(number %2 ==0){
            //display result
            System.out.println("number is even ");
        }else{
            //display result
            System.out.println("Number is odd ");
        }


    }
}
