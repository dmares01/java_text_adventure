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

    //list of items available in every store
    Item potion = new Item("Potion",2,"does nothing");
    Item health_potion = new Item("Health Potion",3,"Heals 2 health");
    Item large_health_potion = new Item("Large Health Potion",5, "Heals 5 health");

    public void menu(Player user, ArrayList items){
        System.out.println("Please press the corresponding number of the item you would like\n");
        Scanner store_decision = new Scanner(System.in);
        int decision;
        decision = store_decision.nextInt();
        Item x = (Item) items.get(decision);
        user.modifyMoney(-(x.getCost()));
        System.out.println("You purchased a "+ x.getName());
        System.out.println("You now have " + user.getMoney()+ " coins left\n");
    }

    public void store_list(Player user){
        System.out.println("You have " + user.getMoney() + " coins.");
        ArrayList<Item> for_sale = new ArrayList<Item>();
        for_sale.add(health_potion);
        for_sale.add(large_health_potion);
        for_sale.add(potion);
        for(int i=0; i<for_sale.size(); i++){
            System.out.print("Item " + i + ":");
            item_print(for_sale.get(i));
        }
        this.menu(user,for_sale);
    }

    public void make_array(){

    }

}
