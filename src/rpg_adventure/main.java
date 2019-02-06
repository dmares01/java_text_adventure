package rpg_adventure;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        main_menu();
        int health = 10;
        double money = 20.0;
        String name;
        System.out.println("Please enter your name");
        name = s.nextLine();
        System.out.println(" ");
        System.out.println("Welcome to Defiled Dungeons " + name);
        town_square();

        int input = s.nextInt();
        System.out.println(" ");
        while(input != 4) {
            if (input == 1) {//Go to the store
                System.out.println("Would you like to buy a health potion? One potion costs");
                System.out.println("five coins and will restore two health. \nYou have " + money + " coins");
                System.out.println("Enter yes or no");
                Scanner letter_input = new Scanner(System.in);
                char letter = letter_input.next().charAt(0);
                System.out.println(" ");
                if (letter == 'y' || letter == 'Y') {
                    money -= 5;
                    health += 2;
                    System.out.println("You now have " + money + " coins left");
                    System.out.println("Your health is now at " + health);
                }
                else {
                    System.out.println("You will now return to the square\n");
                }
            }
            else if (input == 2) {//Go to the forest
                System.out.println("You approach the edge of the forest");
            }
            else if (input == 3) {//Talk to people in the square
                System.out.println("Who would you like to talk too?");
            }
            town_square();
            input = s.nextInt();
        }
    }

    private static void town_square(){
        System.out.println("Please enter the corresponding number for the option you wish to choose");
        System.out.println("[1] Go to the store.");
        System.out.println("[2] Go to the forest.");
        System.out.println("[3] Talk to townspeople in the square.");
        System.out.println("[4] Exit the game");
    }
    private static void main_menu(){
        System.out.println("***   *      * **     *   ****    ****     ***   **     *");
        System.out.println("*  *  *      * * *    *  *       *    *   *   *  * *    *");
        System.out.println("*   * *      * *  *   * *       ******** *     * *  *   *");
        System.out.println("*   * *      * *   *  * *   *** *        *     * *   *  *");
        System.out.println("*  *   *    *  *    * *  *    *  *    *   *   *  *    * *");
        System.out.println("***     ****   *     **   ****    ****     ***   *     **");

        System.out.println("Welcome to Defiled Dungeons");
        System.out.println("Press 1 to start a new game \nor 2 to load a saved game");
        Scanner user_input = new Scanner(System.in);
        int input = user_input.nextInt();
        if(input == 1){
            System.out.println("Defiled Dungeons is a very simple text based RPG \nPlease follow the directions on screen and enjoy!");
        }
        else if(input == 2){
            String saved_game;
            System.out.println("Please enter your saved game name");
            Scanner game_name = new Scanner(System.in);
            saved_game = game_name.nextLine();
            System.out.println("Sorry that feature is not supported right now.");
            System.exit(1011011001);
        }

    }
    /*
    private static void store_menu(double money, int health){
        System.out.println("Would you like to buy a health potion? One potion costs");
        System.out.println("one coin and will restore two health. \nYou have " + money + " coins");
        System.out.println("Enter yes or no");
        Scanner letter_input = new Scanner(System.in);
        char letter = letter_input.next().charAt(0);
        System.out.println(" ");
        if (letter == 'y' || letter == 'Y') {
            money -= 1;
            health += 2;
            System.out.println("You now have " + money + " coins left");
            System.out.println("Your health is now at " + health);
        } else {
            System.out.println("You will now return to the square\n");
        }
    }
    */
}

