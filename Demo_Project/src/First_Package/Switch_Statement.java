package First_Package;

import java.util.*;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a move: ");
        char move = sc.next().charAt(0); // this is how to take input of characters
        int x = 0, y = 1;
        char moveUp = Character.toUpperCase(move);
        switch (moveUp){
            case 'L':
                x--;
                System.out.println("The value of x: "+x);
                break;
            case 'R':
                x++;
                System.out.println("The value of x: "+x);
                break;
            case 'N':
                y--;
                System.out.println("The value of y: "+y);
                break;
            case 'M':
                y++;
                System.out.println("The value of y: "+y);
                break;
            default:
                System.out.println("Invalid input. Move didn't found");

        }
    }
}
