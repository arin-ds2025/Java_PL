package Java_OOPS;

// example of inheritance:

class Fruits{
    // fields and methods
}
class Mango extends Fruits{
    // some more fields and methods
    // override methods
}


public class Inheritance_vs_Composition {
    public static void main(String[] args) {
        /*
        * Inheritance is an "is-a" relationship
        * .. What is the hierarchy of present object? Example: Bike,Yamaha,Honda
        */

        /*
        * Composition is a "has-a" relationship
        * .. What an object is made up of? Example: House is made up of Bricks
        */
    }
}


// example of composition

class Brick{
    // fields and methods
}
class Cement{
    // fields and methods
}
class House{
    Brick brick;
    Cement cement;
    //fields and methods
}

