package First_Package;

import java.io.*;
import java.util.*;

public class Java_input {
    public static void main(String[] args) throws IOException {   //for the usage of BufferredReader to input
        // for args list. not usable much (Array of Strings. we can use anything  instade of args inside main method
        if(args.length>0){
            System.out.println("Arguments are: ");
            for(String x: args){
                System.out.print(x + " ");
            }
        }else{
            System.out.println("No Arguments");
        }

        /* There are two ways to get input in Java:
        * 1. BufferredReader
        * 2. Scanner
        * */

        // BufferredReader Example:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your first name: ");
        String name1 = br.readLine();
        System.out.print("Enter your lasr name: ");
        String name2 = br.readLine();
        System.out.println("Your Full name is: "+ name1 +" "+name2);
        System.out.println(" ");

        // it's a little bit complex to get input for integer and floating value
        System.out.print("Enter the Enteger value of x1: ");
        int x1 = Integer.parseInt(br.readLine()); // this is for get integer input
        System.out.print("Enter the Floating value of x2: ");
        float x2 = Float.parseFloat(br.readLine()); // this is for get float input
        System.out.println("The sum of those values: "+((float)x1+x2));
        System.out.println(" ");


        // input via Scanner class.. it's very easy and simple to use
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a integer value of a:");
        int a = sc.nextInt();
        System.out.print("Give a floating value of b:");
        float b = sc.nextFloat();
        System.out.println("The multiplex of a and b is: "+ ((float)a*b));
        System.out.println(" ");

        System.out.print("Enter your age in alphabets: ");
        String age_name = sc.nextLine();
        System.out.println("Your Age is : "+ age_name);
    }
}
