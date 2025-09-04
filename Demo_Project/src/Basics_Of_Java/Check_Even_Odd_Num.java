package Basics_Of_Java;

import java.util.*;

public class Check_Even_Odd_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
//        System.out.print("Enter a number to check, if it even or odd: ");
//        float num = sc.nextFloat();
//        int num1 = (int)num;
//        if(num1 >= 0){
//            if(num1 == 0){
//                System.out.print(num1+" "+"is not an even or odd number");
//            }else{
//                if (num1%2==0){
//                    System.out.print(num1+" "+"is an even number");
//                    System.out.println(" ");
//                } else{
//                    System.out.print(num1+" "+"is an odd number");
//                    System.out.println(" ");
//                }
//            }
//        }else{
//            System.out.println("Invalid Input. Please Give a valid positive number to check");
//        }
//        System.out.println(" ");
//
//
//        System.out.print("Enter a limit to get the sum of those natural numbers from 0 to your limit: ");
//        float n1 = sc.nextFloat();
//        int n = (int)n1;
//        if(n>0){
//            int sum = 0;
//            for(int i = 0; i <= n; i++){
//                sum+=i;
//                System.out.print(i);
//                if(i<n){
//                    System.out.print("+");
//                }else if (i==n) {
//                    System.out.print(" = ");
//                }
//            }
//            System.out.println(sum+" "+"is sum of those natural numbers of your given limit");
//        }else{
//            System.out.println("Invalid Input. Please Give a positive number (>0)");
//        }
//        //or
//        if(n<=0){
//            System.out.println("Invalid Input");
//            System.out.println(" ");
//        }else{
//            System.out.println("The Sum of those natural numbers in another approach is: "+ (n*(n+1)/2));
//            System.out.println(" ");
//        }
//        System.out.println(" ");

        // make 5 possibilities with even,odd and 0
        System.out.print("Enter a number to check positive,negative odd or even or zero: ");
        int n2 = sc.nextInt();
        if(n2>0){
            if(n2%2==0){
                System.out.println(n2+" "+"is a positive even number");
            }else{
                System.out.println(n2+" "+"is a positive odd number");
            }
        }else{
            if(n2==0){
                System.out.println("Zero is not an even or odd number");
            }else{
                if(n2%2!=0){
                    System.out.println(n2+" "+"is a negative odd number");
                }else{
                    System.out.println(n2+" "+"is a negative even number");
                }
            }
        }
    }
}
