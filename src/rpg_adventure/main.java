package rpg_adventure;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int health = 10;
        double money = 20.0;
        String name;
        System.out.println("Please enter your name");
        name = s.nextLine();
        System.out.println("Welcome to Defiled Dungeons " + name);
        System.out.println("Please enter the corresponding number for the option you wish to choose");
        System.out.println("[1] Go to the store.");
        System.out.println("[2] Go to the forest.");
        System.out.println("[3] Talk to townspeople in the square.");

        int input = s.nextInt();
        if(input == 1){//Go to the store
            System.out.println("Would you like to buy a health potion? Yes or no");
            input = s.next().charAt(0);
            if(input == 'y' || input == 'Y'){
                money-=1;
                health+=2;
                System.out.println("You know have " + money + " coins left");
                System.out.println("Your health is now at " + health);
            }
            else{
                System.out.println("You will now return to the square");
            }

        }
        else if(input == 2){//Go to the forest
            System.out.println("You approach the edge of the forest");
        }
        else if(input == 3){//Talk to people in the square
            System.out.println("Who would you like to talk too?");
        }
    }
}
