package First_Package;

public class Type_Conversion {
    public static void main(String[] args) {

      // the process to get the data type:
      /*
      * first :
      * Class<?> unknown_name = variable_name.getClass();
      * then:
      * unknown_name.getSimpleName();  where I've to get the data type name
      * */



        // Widening or Implicit Conversion:

        /* Preemptive type conversion-->
        *
        * :--> byte->(short,char)->int->long->float->double
        *
        * char contains unicode values which is 16 bit or 2 byte
        * */

        // Example:
        int x = 100;
        long y = x;
        float z = y;
        System.out.println("x = "+x+" "+"y = "+y+" "+"z = "+z);
        System.out.println(" ");


        // Narrowing or Explicit Conversion:
        // Example:
        double d = 64.56;
        int i = (int) d;
        char c = (char) i;
        System.out.println("i = "+i); // it will print the integer value , 64
        System.out.println("c = "+c); // it will print the ascii(decimal) value of 64.
    }
}
