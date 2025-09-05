package Basics_Of_Java;



public class Hello_BD {
    public static void main(String[] args) {

        System.out.println("Hello Mc");
        System.out.println(" ");

        //we can access the default class members like default member variable and
        // methods in another classes of a same package

        //  these things use from Static_members.java
        System.out.println("Before Count: "+Players.getPlayersCount());

        Players p1 = new Players("Arin Ahmed");
        Players p2 = new Players("Nayem Seikh");
        p1.display();
        p2.display();

        System.out.println("After Count: "+Players.getPlayersCount());

    }
}
