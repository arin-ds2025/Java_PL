package Basics_Of_Java;

public class Usage_Of_Final_Keyword {
    // instance variable initialization:
    // final keyword mainly use as constant

    // with instant declaration:
    final int i=100;

    // initialize with a block;
    final float f;
    {f = 90.05f;}

    // initialize with constructor
    final boolean b;
    Usage_Of_Final_Keyword(){b = true;}

    // instant declaration with static keyword
    static final byte bt= 50;

    // initialize with block and static keyword
    static final double db ;
    static {db =758572.00000001d;} // for this block, there need to use static keyword also

    // Naming Convention:
    // the variables which are use with final keyword, they should written in uppercase
    // most of the company follow this

    static final String NAME;
    static {NAME = "Aryan Ahmed";}
    final int ROLL = 758572;

    public static void main(String[] args) {
        Usage_Of_Final_Keyword obj = new Usage_Of_Final_Keyword();
        System.out.println("i = "+obj.i);
        System.out.println("f = "+obj.f);
        System.out.println("b = "+obj.b);
        System.out.println("bt = "+bt); // for static variables in same class, no need to use objects to access it
        System.out.println("db = "+db);
        System.out.println("Name: "+NAME+"--"+"Roll: "+obj.ROLL);
        System.out.println(" ");

        // final reference variable
        final StringBuffer sb = new StringBuffer("Geeks"); // StringBuffer is a library class in java and here sb is a reference
        sb.append("ForGeeks");
        System.out.println("Output: "+sb);
    }
}
