package Basics_Of_Java;

class Players{
    int id;
    String name;
    static int playersCound = 0; // for using static, this value will be shared with all objects that
                                // will create in main method of main function
    Players(String name){
        this.name = name;
        id = ++playersCound;
    }

    void display(){
        System.out.println(id+" : "+name);
    }

    static int getPlayersCount(){ // static methods or functions can access only static members
        return playersCound; // at the top, there is already defined this static variable
        // static methods or functions also do not have access to 'this' reference
    }
}

public class Static_members {
    public static void main(String[] args) {
        String[] names = {"Mashfi","Unknowns","Nusrat","Sanjida","Tuba","Saba"};

        // for giving array in a constructor class, this process should be followed

        Players[] p1 = new Players[names.length];

        // for show the players count before print the data
        System.out.println("The Count of Players: "+Players.getPlayersCount()); // static member function can access through class directly
        System.out.println(" ");

        // for giving all data in that constructor class through object
        for (int i = 0; i<names.length;i++){
            p1[i]= new Players(names[i]);
        }

        // for show those data
        for(Players p: p1){
            p.display();
        }
        System.out.println(" ");

        // after print data
        System.out.println("The Count of Players: "+Players.getPlayersCount());
    }
}
