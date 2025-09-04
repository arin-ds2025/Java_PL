package Basics_Of_Java;

import java.util.*;

public class Factorial_and_Pyramid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the factorial limit: ");
        int limit = sc.nextInt();
        for (int i=1;i<=limit;i++){
            fact *= i;
            System.out.print(i);
            if(i<limit){
                System.out.print("*");
            }else if (i == limit){
                System.out.print(" = ");
            }
        }
        System.out.println(fact+" "+"factorial of "+limit);
        System.out.println(" ");

        // while loop
        System.out.print("Enter the height of the pyramid: ");
        byte height = sc.nextByte();
        byte i = 1;

        while (i<=height) {
            System.out.println(" ".repeat(height-i) + "*".repeat(2*i-1));
            i++;
        }

    }
}
