import java.util.Scanner;
import java.util.Random;

public class RPC {
    public static void main(String arg[]){
        String options[]={"Rock","Paper","Scissors"};
        Random random=new Random();
        Scanner s=new Scanner(System.in);
         System.out.println("enter your choice \n--ROCK--\t--PAPPER--\t--SCISSORS--");
         for(String optin:options){
            System.out.println(optin);
         }
         String op=s.nextLine().toLowerCase();
         //computer choice---
         String computer=options[random.nextInt(2)].toLowerCase();

         if(computer.equals(op)){
            System.out.println("its a draw");
         }
         else{
            switch (op) {
                case "rock":
                    if(computer.equals("paper")){
                        System.out.println("your the winner");
                    }
                    else{
                        System.out.println("computer is the winner");
                    }
                    
                    break;
                case "paper":
                    if(computer.equals("scissors")){
                        System.out.println("your the winner");
                    }
                    else{
                        System.out.println("computer is the winner");
                    }
                     break;


                case "Scissors":
                    if(computer.equals("rock")){
                        System.out.println("your the winner");
                    }
                    else{
                        System.out.println("computer is the winner");
                    }
                    
                    break;
                default:
                    System.out.println("you have enter the wrong choic try aganin later");
                    break;
            }

         }

     s.close();

    }
    
}
