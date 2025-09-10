package Java_OOPS;

class Bike{
    public int gear,speed;

    public Bike(int gear,int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public String show(){
        return ("Have A Save Journey");
    }
}

class Suzuki extends Bike {
    String name;
    public int seatHeight;
    public Suzuki(String name,int gear,int speed){
        super(gear,speed); // we've to use super keyword, if we use parent class's constructor things in child class's constructor
        this.name = name;
    }

    @Override // it's called annotation. by which, complier can understand that this is a override method of parent class.. but it's optional
    public String show(){
        return ("Suzuki is a reliable Moto_Bike Brand. More or less: "+super.show()); // we can use super key to call method of parent class
    }
}

//class Yamaha extends Bike {
//    String name;
//    public Yamaha(String name,int gear,int speed){
//        super(gear,speed,name);
//        this.name = name;
//    }
//}


public class Single_Inheritance {
    public static void main(String[] args) {
        Suzuki obj = new Suzuki("Gixxer",5,125);
        System.out.println("Bike name: "+obj.name);
        System.out.println("Bike has "+obj.gear+" speed gear box");
        System.out.println("Bike can gain highest "+obj.speed+" speed");
        obj.applyBreak(20);
        System.out.println("After 2 years later, the top speed of "+obj.name+" will be decrease with "+obj.speed+" speed");
        obj.speedUp(5);
        System.out.println("But after have some good and regular services it can be increase with "+obj.speed);
        System.out.println(" ");
        System.out.println(obj.show());
    }
}
