package Basics_Of_Java;

class Point3{
    int x,y;
    Point3(int a,int b){
        x = a;
        y = b;
    }
}

public class Arrays {
    public static void main(String[] args) {
        // array is a non-preemptive mutable data type

        float[] cgpa = {3.67f,3.45f,3.51f,3.61f};
        System.out.println("The length of cgpa array: "+cgpa.length);
        System.out.println("cgpa[0]: "+cgpa[0]);
        cgpa[1] = 3.78f;
        System.out.print("cgpa array: ");
        for(int i = 0;i<cgpa.length;i++){
            System.out.print(i+" index: "+cgpa[i]+" <--> ");
        }
        System.out.println(" ");

        int[] a = new int[10]; // here int[10] means, this array's length is 10
//        for (int i = 0; i<a.length;i++){
//            a[i] = (i+1)*2;
//        }
        // also can do this with this approach:
        a[0] = 2; // first value of 0th index has been declared menually.
        int x =4;
        for (int i = 1; i<a.length;i++){ // if first index didn't declare menually then this loop starts with 0 not 1
            a[i]=x;
            x+=2;
        }
        for (int i = 0;i<a.length;i++){
            System.out.println("(Even) a = "+a[i]);
        }
        System.out.println(" ");

        // there is a difference between use of [] beside data type or beside variable
        float b[] = new float[10],k=3.61f; // if we use [] beside variable then we can also declare multiple variable at a time
        b[0] = 1.0f;
        for(int i = 1;i<=b.length * 2;i+=2){
            b[(i/2)] = i;
        }
        for(int i = 0;i<b.length;i++){
            System.out.println("(Odd) b = "+b[i]);
        }
        System.out.println("My cg in 4th semester is : "+k);
        System.out.println(" ");

        // Non-preemptive Reference are stored at Contiguous locations
        Point3[] p = {new Point3(10,12),new Point3(18,30),new Point3(38,40)};
    }
}
