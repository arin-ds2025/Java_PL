package Basics_Of_Java;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exception_Handling_Using_Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            //below statement may throw a FileNotFoundException
            Scanner sc = new Scanner(new File("test.sc"));

            // if everything goes well then the below statement would be executed
            System.out.println("Exit main()");
        }
        // error handling separated from the main logic(try)
        catch (FileNotFoundException ex){
            System.out.println("File not found caught");
        }
        // optional
        // finally block always be executed
        finally {
            System.out.println("Finally block runs regardless of the state of the exception");
        }
        // after try-catch finally, it will not be executed in case of an uncaught Exception
        System.out.println("After Try-Catch-Finally, life goes on..!");
        System.out.println(" ");

        int x,b,sum;
        try{
            x = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            sum = x+b;
            System.out.println("Addition is : "+sum);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient number of arguments(nos.)");
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers.");
        }
        System.out.println(" ");

        Scanner in = new Scanner(System.in);
        int m,n,sum1;
        try {
//            System.out.print("Enter first number: ");
//            m = Integer.parseInt(in.nextLine());
//            System.out.print("Enter second number: ");
//            n = Integer.parseInt(in.nextLine());
//            sum1 = m + n;
//            System.out.println("Addition is: " + sum1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient number of arguments(nos.)");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers.");
        } finally {
            System.out.println("Program executed in Finally block");
            in.close();
        }
        System.out.println(" ");

        try {
            method();
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught");
            e.printStackTrace();
        }
    }

    public static void method(){
        int a = 10, b = 0;
        try{
            int c = a/b;
            System.out.println(a+"/"+b+" : "+c);
        }finally {
            System.out.println("In method()");
        }
    }
}
