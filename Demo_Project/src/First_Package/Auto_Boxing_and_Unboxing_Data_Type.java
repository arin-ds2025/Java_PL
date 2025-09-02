package First_Package;

public class Auto_Boxing_and_Unboxing_Data_Type {
    public static void main(String[] args) {
        /*
        * Wrapper classes:
        * 1. Character
        * 2. Byte
        * 3. Short
        * 4. Integer
        * 5. Long
        * 6. Float
        * 7. Double
        * 8. Boolean
        * */

        int x1 = 10;
        Integer x2 = x1; // AutoBoxing and here Integer is a wrapper class
        int x3 = x2; //Auto-Unboxing
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);
        System.out.println(" ");

        Float C = 758572.0f; float P = 758572.0f;
        if(C == P){
            System.out.println("C and P are Same"); // output will be this
        }else {
            System.out.println("C and P are Not Same");
        }
        System.out.println(" ");

        byte b1 = 100; byte b2 = 100;
        if(b1 == b2){
            System.out.println("b1 and b2 are Same"); // output will be this
        }else{
            System.out.println("b1 and b2 are Not Same");
        }
        System.out.println(" ");

        Short s1 = 2580; Short s2 = 2580;
        if(s1 == s2){
            System.out.println("s1 and s2 are Same");
        }else{
            System.out.println("s1 and s2 are Not Same"); // output will be this. cause wrapper classes allocate the memory address and here, there are two different adresses for s1 and s2
        }
        System.out.println(" ");

        Integer i1 = 25800, i2 = 25800;
        if (i1 == i2){
            System.out.println("i1 and i2 are Same");
        }else{
            System.out.println("i1 and i2 are Not Same"); // output will be this. cause here, I've used same wrapper classes which contain different addresses
        }
        System.out.println(" ");

        /*
        * The reason, why same Wrapper classes are not same with same values:
        * cause Wrapper variables are actually objects which are the reference and contain memory locations not values
        * But there is an exception, while I use smaller values in same Wrapper class objects,
        * after compare, it would show me same. cause in the case of smaller values, it references to the literals or values of the variables or objects of the Same Wrapper classes
        * */

        Byte b3 = 69; Byte b4 = 69;
        if(b3 == b4){
            System.out.println("b3 and b4 are Same"); // here it will be the output
        }else{
            System.out.println("b3 and b4 are Not Same");
        }
    }
}
