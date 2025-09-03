package First_Package;

import java.util.*;

public class Loop_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the height of the pyramid: ");
        float n1 = sc.nextFloat();
        int n = (int)n1;
        for(int i = 1; i<n+1; i++){
            System.out.println("   ".repeat(n-i)+ "<^>".repeat((2*i)-1));
        }
        System.out.println(" ");

        // do-while loop
        int m = 1;
        do{
            if(m%2!=0) {
                System.out.println(m);
            }
            m++;
        }while(m<=13);
    }
}
