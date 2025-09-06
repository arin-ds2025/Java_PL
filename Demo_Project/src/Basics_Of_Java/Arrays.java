package Basics_Of_Java;

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
//        a[0] = 2;
        for (int i = 0; i<a.length;i++){
            a[i] = (i+1)*2;
        }
        for (int i = 0;i<a.length;i++){
            System.out.println("(Even) a = "+a[i]);
        }
        System.out.println(" ");

        float[] b = new float[10];
        b[0] = 1.0f;
        for(int i = 1;i<=b.length * 2;i+=2){
            b[(i/2)] = i;
        }
        for(int i = 0;i<b.length;i++){
            System.out.println("(Odd) b = "+b[i]);
        }
    }
}
