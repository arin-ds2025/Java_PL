package Basics_Of_Java;

class Pnt{int x, y;}
public class Function_Method {
    public static void main(String[] args) {
        System.out.println("Before Call");
        System.out.println(" ");
        fun();
//        fun();  // it calls fun() function again
        System.out.println(" ");
        System.out.println("After Call");
        System.out.println("  ");

        float x = 5.0f;
        float y = 5.000001f;
        System.out.println("The Highest value is: "+ getMax(x,y));
        System.out.println(" ");

        // preemptive type:
        int a = 5;
        increase(a);
        System.out.println("The value of a is: "+a);// value of a will not change
        /* The main reason is that, here the value of a and in increase function
        * the value of x has different memory location . they are not references . that's
        * why here the value of a is same as given but in increase function the value of x is increase */
        System.out.println(" ");

        // non-preemptive type
        Pnt p = new Pnt();
        p.y = 4; p.x = 2;

        pnt_func2(p);
        System.out.println("p.x with pnt_func2 = "+p.x+" "+"p.y with pnt_func2 = "+p.y); // values will not be changed with pnt_func2
        /* here, while the values pass in pnt_func2, it references the memory also but
        * while in that function create new object(p=new Pnt();) the the reference will be removed
        * that's why the after print the value here, the values are not changed*/

        pnt_func(p);
        System.out.println("p.x with pnt_func = "+p.x+" "+"p.y with pnt_func  = "+p.y); // values will be changed with pnt_func
        /* here,p.x and p.y are non-preemptive data type and use as references,that's
        * why the value of p.x and p.y will be changed with the given value of pnt_func*/

    }

    public static void fun(){
        System.out.println("Before Fun Function");
        System.out.println("Fun Function Is Called..!");
        fun2();
        System.out.println("After Fun Function");
    }

    public static void fun2(){System.out.println("Fun2 Function Is Called");}

    public static float getMax(float a, float b){
        if(a>b){ return a;}
        else{return b;}
    }

    public static void increase(int x){x+=5;}

    public static void pnt_func(Pnt p){
        p.x = 8; p.y = 5;
    }

    public static void pnt_func2(Pnt p){
        p = new Pnt();
        p.x = 11; p.y = 17;
    }
}
