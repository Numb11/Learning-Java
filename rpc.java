import java.util.Scanner;
import java.util.ArrayList;
//Import for dictionary data type ---------
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class rpc{
    public static void main(String[] args){

        Map<Character,Character> rules = new HashMap<Character,Character>();
        rules.put('r','s');
        rules.put('s','p');
        rules.put('p','r');

        ArrayList<Character> keys = new ArrayList<Character>(rules.keySet()); //. creating fixed mutable array of keys [rock, scissors, paper]
        System.out.println(keys);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!!!");
        System.out.println("You have a choice of either: Rock, Paper, Scissors p.s Choose wisely :)");
        System.out.println("Are you playing me? or a friend?");
        String opponent = input.nextLine();
        if (opponent.charAt(0) == 'f' || opponent.charAt(0) == 'F'){
            
            System.out.print("Enter player 1s name: ");
            String name1 = input.nextLine();

            System.out.print("Enter player 2s name: ");
            String name2 = input.nextLine();

            System.out.println(name1 + ", It's your go first! Choose Rock, Paper or Scissors: ");
            Character p1 = (((input.nextLine()).toLowerCase()).charAt(0));
            System.out.print(name2 + ", It's your go now, Choose Rock, Paper or Scissors: ");
            Character p2 = (((input. nextLine()).toLowerCase()).charAt(0));
             if (rules.get(p1) == p2){
                System.out.println(name1 + " has won!!!");


             }else if(p1 == p2){
                System.out.println("Draw!");

             }else{
                System.out.println(name2 + " has won!!!");


             }

            
            


            










        }else {
            System.out.println("Ouch, wouldn't have challenged me! I'm gonna fuck you up");
            Character compchoice = keys.get((int)(Math.random()*2));
            System.out.print("What will it be then? Rock, Paper or Scissors: ");
            Character choice = ((input.nextLine()).toLowerCase()).charAt(0);
            if (choice == (rules.get(compchoice))){
                System.out.println("YOU WIN, NO HOW");
                
            }else if(choice == compchoice){
                System.out.println("We've drawn, lucky this time!");


            }else{
                System.out.println("HAHA you lost, I told you!");

            }
        input.close();
        }
        








    }






}
