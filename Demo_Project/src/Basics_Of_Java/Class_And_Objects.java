package Basics_Of_Java;

class Complex{
    int real,imag;
    void print(){
        System.out.println(real+" + i"+imag);
    }
    Complex(int r,int i){
        real=r;
        imag=i;
    }
    void add(Complex C){
        real+=C.real;
        imag+=C.imag;
    }
}

public class Class_And_Objects {
    public static void main(String[] args) {
        Complex C1 = new Complex(10,15);
        C1.print(); // it will print 10,15
        Complex C2 = new Complex(20,30);
        C1.add(C2); // here, C1 object's values will be added by recently given C2 object's values
        C1.print(); // it will print (10+20)=30, (15+30)=45
    }
}
