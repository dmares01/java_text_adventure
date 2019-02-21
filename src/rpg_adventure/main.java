package rpg_adventure;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        main_menu();
        Player user = new Player();
        Store general_store = new Store();
        String name;
        System.out.println("Please enter your name");
        name = s.nextLine();
        user.setPlayer_name(name);
        System.out.println("\nWelcome to Defiled Dungeons " + user.getPlayer_name());
        town_square();

        int input = s.nextInt();
        System.out.println(" ");
        while(input != 4) {
            if (input == 1) {//Go to the Store
                store_menu(user);
            }
            else if (input == 2) {//Go to the forest
                System.out.println("You approach the edge of the forest");
                System.out.println("Would you like to enter? Please enter yes or no");
                Scanner letter_input = new Scanner(System.in);
                char letter = letter_input.next().charAt(0);
                if(letter == 'y' || letter == 'Y'){
                    System.out.println("You enter the woods and soon come to a crossroads. \n" +
                            "The sign is old and weathered and is no longer readable \n" +
                            "Do you want to \n[1] turn around \n[2] continue straight  \n[3] go left " +
                            "\n[4] go right \n");
                    Scanner Crossroads_input = new Scanner(System.in);
                    int crossroads = Crossroads_input.nextInt();

                    switch (crossroads){
                        case 1:
                            System.out.println("You turn around and head back to the town \n");
                            break;
                        case 2:
                            System.out.println("You continue along the path and stumble upon a crashed carriage.\n" +
                                    "Inside you find a a couple gold coins! \n" +
                                    "You return to town \n");
                            user.modifyMoney(2);
                            break;
                        case 3:
                            System.out.println("As you travel along the road you are attacked by a wolf.\n" +
                                    "You manage to kill the wolf but suffer a wound \n" +
                                    "After patching your wound you had back to town \n");
                            user.modifyHealth(-1);
                            break;
                        case 4:
                            System.out.println("The road starts to deteriorate and soon fades away. \n" +
                                    "Do you want to continue into the woods? [Yes] or [No] ");
                            char right_choice = Crossroads_input.next().charAt(0);
                            if(right_choice == 'y' || right_choice == 'Y'){
                                System.out.println("You continue into the roads and stumble across a bear den \n" +
                                        "You drop your pouch of coins running away \n" +
                                        "You are now back in town \n");
                                user.setMoney(0);
                            }
                            else{
                                System.out.println("You turn around and head back to town \n");
                            }
                            break;
                    }
                }
                else{
                    continue;
                }
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
        System.out.println("[1] Go to the Store.");
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
            System.out.println("Defiled Dungeons is a very simple text based RPG \n" +
                    "Please follow the directions on screen and enjoy!");
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
    private static void store_menu(Player user){
        System.out.println("Would you like to buy a health potion? One potion costs");
        System.out.println("five coins and will restore two health. \nYou have " + user.getMoney() + " coins");
        System.out.println("Enter yes or no");
        Scanner letter_input = new Scanner(System.in);
        char letter = letter_input.next().charAt(0);
        System.out.println(" ");
        if (letter == 'y' || letter == 'Y') {
            if((user.getMoney() > 5) && (user.getMoney() < user.getMax_health())){
                user.modifyMoney(-5);//decrease money by 5
                user.modifyHealth(2);//increase health by 2
                System.out.println("You now have " + user.getMoney() + " coins left");
                System.out.println("Your health is now at " + user.getHealth());
            }
            else if(user.getMoney() < 5){
                System.out.println("Sorry you do not have enough money to purchase a potion");
            }
            else{
                System.out.println("Sorry your health is already full");
            }
        }
        else {
            System.out.println("You return to the square\n");
        }
    }
}

