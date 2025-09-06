package Basics_Of_Java;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Exception_Handling_Using_Throw_Throws {
    // for example:

//    public void methodD() throws XxxException, YyyException {
//        //method body
//        ...
//        ...
//
//        // XxxException occurs
//        if(...){
//            throw new XxxException(...); // construct an XxxException object and throw to  JVM
//        }
//        // YyyException occurs
//        if(...){
//            throw new YyyException(...); // construct an YyyException  object and throw to JVM
//        }
//    }


//    public void methodC(){
//        try{
//            // uses methodD() which which declares XxxException & YyyException
//            methodD();
//        }catch (XxxEception ex){
//            // Exception handler for XxxException
//        }catch (YyyException ex){
//            // Exception handler for YyyException
//        }finally {
//            // these codes always run, used for cleaning up
//        }
//    }

    // for test
    public static void main(String[] args) {
//        try{
//            methodA();
//            System.out.println("Exit try block of main()");
//        }catch (ArithmeticException ex){
//            System.out.println("Arithmetic Exception Caught...");
//            ex.printStackTrace();
//        }
//        System.out.println("Exit main() successfully..!");
        System.out.println(" ");

        // exmple of handling multiple exception at a time.
        // in order of hierarchy of exception, we've to caught them serially. child class exceptions comes first and then parent class
        try{
            methodB();
            Scanner sc = new Scanner(new File("test.sc"));
            System.out.println("Exit of try block in main()");
        }catch (ArithmeticException ex){ // ArithmeticException in a child class exception of Exception super class(parent class)
            System.out.println("Arithmetic Exception Caught"); // first check this exception
        }
        catch (FileNotFoundException ex){ // FileNotFoundException is also child class exception of Exception super class
            System.out.println("File Not Found Exception Caught"); //if first does not match then this exception will check
        }catch (Exception ex){
            System.out.println("A new type of exception has occuered"); //if second does not match then this exception will check
        }finally {
            System.out.println("finally block in main() runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally , life goes on..!");
    }

    public static void methodA() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int a = 5,c;
        System.out.print("Enter a numeric value of b: ");
        int b = sc.nextInt();
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            c = a/b;
        }
        System.out.println("methodA() exit");
    }

    public static void methodB(){
        System.out.println("Enter methodB()");
        try{
            System.out.println(1/0);
        }finally {
            System.out.println("Finally in methodB");
        }
    }
}
