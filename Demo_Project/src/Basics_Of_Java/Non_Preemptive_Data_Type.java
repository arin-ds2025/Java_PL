package Basics_Of_Java;

// Example of Non-Preemptive Data
class Point{
    int x,y;
    int sum(){
        return x+y;
    }
}

public class Non_Preemptive_Data_Type {
    public static void main (String [] args){
    Point p = new Point(); // object of a class is also consider as a non-preemptive data type
    p.x = 10;
    p.y = 8;
    System.out.println("The Sum of those two variables is: "+p.sum() + " " + "And the multiplication of those values is : " + (p.x*p.y));
    System.out.println("p.x = "+p.x +" "+"p.y = "+p.y);
    // here both of the value of p.x and p2.x will be changed. cause here,I've used external classPoint p2 = p;
    // the main reason is that the variables are used as reference. like p2 doesn't consume memory, it's allocating the p memory location
    Point p2 = p;
    p2.x = 12;
    System.out.println("p.x = "+p.x +" "+"p.y = "+p.y +" "+"p2.x = " + p2.x);
    System.out.println(" ");


//  Example of Preemptive Data type
        int c = 5;
        int P = 15;
        System.out.println("c = "+c+" "+"P = "+P);
//    here only the value of P will be changed. Cause here, I didn't use that external class
        // the main reason is that these are dedicated variables in this main class
        P = 12;
        System.out.println("c = "+c+" "+"P = "+P);
    }
}
