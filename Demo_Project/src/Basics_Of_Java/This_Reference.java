package Basics_Of_Java;

class Tf{
    int x,y;
    Tf(int x,int y){
        this.x = x;
        this.y = y;
    }
    Tf set_x(int x){
        this.x = x;
        return this;
    }
    Tf set_y(int y){
        this.y = y;
        return this;
    }
}

class Point1{
    int x,y;
    Point1(int x,int y){
        this.x = x;
        this.y = y;
    }
    Point1(){
        this(10,11); // this constructor doesn't have perameters in () but with the
    }                      // use of this(_,_) it autometically takes the values of x and y
}

public class This_Reference {
    public static void main(String[] args) {
        Tf t1 = new Tf(15,24);
        Tf t2 = new Tf(5,6);
        t1.set_x(7).set_y(8);
        System.out.println(" ");

        Point1 p = new Point1(15,20);

    }
}
