package Basics_Of_Java;

import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String usr = "Msfi", pswrd = "111000";
//        System.out.print("Enter Your name: ");
//        String usr_name = sc.nextLine();
//        System.out.print("Enter Your Password : ");
//        String usr_pwd = sc.nextLine();
//
//        if (usr.equals(usr_name) && pswrd.equals(usr_pwd)){
//            System.out.println("Welcome, K.M.");
//        }else{
//            System.out.println("Mara Khaw");
//        }
//        System.out.println(" ");

        // Example of Short Circuiting:
        String s = null;
        if(s != null && s.length() < 100){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }
        // System.out.println(s.length()); // here it will through a Null Pointer Exception.
        // cause length method can't work with null string; but it doesn't through Null Pointer Exception error while,
        // it will use with logical and operator
    }
}
