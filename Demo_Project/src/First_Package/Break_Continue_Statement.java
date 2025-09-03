package First_Package;

public class Break_Continue_Statement {
    public static void main(String[] args) {
//        int i = 12;
//        do{
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i); // here it will print just 1. cause while continue statement get hit then,
//            i--;                    // it will go back to the loop but in case of do-while loop condition is at the end
//        }while (i>=0);
        System.out.println(" ");

        // it will work, cause after hit the continue statement, loop will start again and doesn't hit next statements below continue statement
        for (int i = 13;i>0;i--){
            if(i%2==0){continue;}
            System.out.println(i);
            if(i==3){
                System.out.println(1.000001f+" LoL");
                break;
            }
        }
        System.out.println(" ");

        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                if(j==i){break;}
                System.out.println(j);
            }
            System.out.println(" ");
        }
    }
}
