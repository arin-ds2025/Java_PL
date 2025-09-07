package Basics_Of_Java;

import java.util.Scanner;

public class User_Input_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the first(0th index) value of the array: ");
        arr[0] = sc.nextInt();
        System.out.println("Now--:");
        for(int i = 1;i<n;i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i = 0; i<arr.length;i++){
            System.out.println("in index--: "+i+" value is: "+arr[i]);
        }
    }
}
