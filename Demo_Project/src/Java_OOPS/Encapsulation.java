package Java_OOPS;

class Student{
    private float cgpa;
    private static String name; // for this private variable,we've to use also static method to access it

    // getter
    public float getcgpa() { // a value would be return, thus, we use same data type which is private data type as return type here.
        return cgpa;
    }

    // getter2
    public int getcgpa2(){
        return (int)cgpa;
    }

    public static String getname(){
        return name;
    }

    // setter
    public void setcgpa(float newcgpa) { // here nothing would be return, just set the value through object, thus, we used void
        this.cgpa = newcgpa;
    }

    public static void setname(String NewName){
        Student.name = NewName;
//        this.name = NewName; // for the static keyword we can't use this key word to set name
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // how to achieve encapsulation:
        /* By using "access modifiers" ,as:
           1. declare class variables/attributes as private
           2. define public "getter" and "setter" method to access and update the value of private variable
        * */

        Student obj = new Student();
        obj.setcgpa(3.71f);
        System.out.println("Your CGPA is above or just: "+obj.getcgpa2()+" , exact : "+obj.getcgpa());
        System.out.println(" ");

        Student.setname("Arin Ahmed");
        System.out.println("Your Name: "+Student.getname());
    }
}
