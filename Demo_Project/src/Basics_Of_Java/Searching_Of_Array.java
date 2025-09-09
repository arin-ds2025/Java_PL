package Basics_Of_Java;

import java.util.Scanner;

public class Searching_Of_Array {
    // For Binary Search in sorted array
    static int binarySearch(int arr2[],int l, int r,int x1){ // l means left most index, r means right most index
        if(r>=l){
            int mid = l + (r-l) / 2;

            // if the element is present at the middle itself
            if(arr2[mid]==x1)
                return mid;  // one line can be written without {}

            // if the element is smaller than mid, then
            // it can only be present in left subarray
            if(arr2[mid]>x1)
                return binarySearch(arr2,l,mid-1,x1); // recursion

            // else the element  can only be present in right subarray
            return binarySearch(arr2,mid+1,r,x1); // recursion
        }
        return 404;
    }

    public static void main(String[] args) {
        // Linear Search
        int linArr[] = {5,10,30,6,20,35,42,25,21};
        int x = 22;
        int result = search(linArr,x);
        if(result==404){
            System.out.println("Sorry ! Element is not found in this array");
        }else{
            System.out.println("Element is present in this array at the index : "+result);
        }
        System.out.println(" ");

        // Binary Search in sorted array
        int BinArr[] = {5,10,15,20,25,30,35,40,45,50};
        int n = BinArr.length;
        int x1 = 45;
        int result2 = binarySearch(BinArr,0,n-1,x1); // here 0 is for lower index and n-1 is for higher index
        if(result2 == 404){
            System.out.println("The data is not found in that array");
        }else{
            System.out.println("Data is found in that array at index: "+result2);
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
