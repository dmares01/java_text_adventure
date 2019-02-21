package rpg_adventure;

import java.util.ArrayList;
import java.util.Scanner;

import static rpg_adventure.Item.item_print;

public class Store {
    /*
    array to Store items for sale
    figure out how to give each Store unique items
    function to display items in Store
    want to eventually move over to using item class so that hard coded numbers can be replaced
        with cost variable instead.
    */
    Item potion = new Item("potion",2,"does nothing");
    Item health_potion = new Item("Health Potion",  3,"Heals 2 health");
    Item large_health_potion = new Item("Lg Health Potion",5, "Heals 5 health");
    //updated menu
    public static void menu_updated(Player user){

    }

    public static void menu(Player user){
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
    public void store_list(){
        ArrayList<Item> for_sale = new ArrayList<Item>();
        for_sale.add(health_potion);
        for_sale.add(large_health_potion);
        for_sale.add(potion);
        for(int i=0; i<for_sale.size(); i++){
            item_print(for_sale.get(i));
        }
    }

}
