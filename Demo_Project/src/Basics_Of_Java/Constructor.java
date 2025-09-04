package Basics_Of_Java;

class Pt{
    int x,y;
    Pt(int a,int b){
        x=a; y=b;
    }
    void print(){
        System.out.println("x = "+x+" "+"y = "+y);
    }
}

class Dc{
    boolean b ; float f;
    // without constructor. it will show default constructor values, like for int,float,double etc 0 and for boolean it will false
    void show(){
        System.out.println("b = "+b+" "+"f = "+f);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Pt p = new Pt(5,10);
        p.print();
        System.out.println(" ");

        Dc d = new Dc();
        d.show();
    }
}
