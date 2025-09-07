package Basics_Of_Java;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8}}; // we can't give dedicated length like int [2][3] for multidimensional array
        for(int i = 0;i<arr.length;i++){ // outer loop for the row
            for(int j = 0; j<arr[i].length;j++){ // inner loop for the column
                System.out.println("row: "+i+", column: "+j+" "+" = "+arr[i][j]);
            }
        }
        System.out.println(" --------------------------------  ");

        int arr2 [][] = new int[2][3];
        int m = 1;
        for(int k = 0;k<arr2.length;k++){

            for(int j = 0;j<arr2[k].length;j++){
                arr2[k][j]+=m;
                m+=2;
                System.out.print("row: "+k+", column: "+j+" "+" = "+arr2[k][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");

        int arr3 [][] = new int[3][];
        for(int i = 0; i<arr3.length;i++){
            arr3[i]=new int[i+1];
            for(int j = 0;j<arr3[i].length;j++){
                arr3[i][j]=i;
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
