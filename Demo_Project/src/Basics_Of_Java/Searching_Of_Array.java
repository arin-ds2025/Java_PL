package Basics_Of_Java;

import java.util.Scanner;

public class Searching_Of_Array {
    public static void main(String[] args) {
        // Linear Search
        int linArr[] = {5,10,30,6,20,35,42,25,21};
        int x = 22;
        int result = search(linArr,x);
        if(result==404){
            System.out.println("Sorry ! Element is not in this array");
        }else{
            System.out.println("Element is present in this array at the index : "+result);
        }

    }
    // for linear search
    public static int search(int arr[],int x){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 404;
    }
}
