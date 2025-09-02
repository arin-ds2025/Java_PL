package First_Package;

public class Factorial {
    public static void main(String [] args){
        int fact = 1;
        for (int i=1;i<=5;i++){
            fact *= i;
        }
        System.out.println("Factorioal of 5 is : "+fact);
        System.out.println(" ");

        for (int i=1;i<6;i++){
            System.out.println(" ");
            for (int j=1;j<=(i-1)+1;j++){
                System.out.print("*");
            }
//            System.out.print(" ");
        }
    }
}
