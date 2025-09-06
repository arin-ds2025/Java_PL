package Basics_Of_Java;

import java.util.Scanner;

// user defined exception by subclassing Exception. this is a checked exception
class InvalidBanlanceException extends Exception{ // here Exception is built in super class
    public InvalidBanlanceException(String message){ // constructor
        super(message);
    }
}

public class User_Defined_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance,inp;
        System.out.print("Enter a amount: ");
        try{
//            balance = Integer.parseInt(args[0]); // may generate NumberFormateException
            balance = sc.nextInt();
            UpdateBalance(balance); // may generate InvalidBalanceException
        }catch (InvalidBanlanceException ex){ // while given value will be negative then this user defined exception will triggered
            System.out.println("Caught in catch of InvalidBalanceException");
            ex.printStackTrace();
        }catch (NumberFormatException ex){
            System.out.println("Caught in catch of NumberFormateException");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }catch (Exception ex){
            System.out.println("Caught in catch of parent exception");
        }finally {
            System.out.println("Ghorar Dim");
        }
        System.out.println("main() method executed successfully");
    }

    public static void UpdateBalance(int number) throws InvalidBanlanceException{
        if(number<0){
            throw (new InvalidBanlanceException("Account balance can't be less then 0"));
        }
        System.out.println("No exception occurred in updateBalance() method"); // skip if the exception will be triggered
    }
}
