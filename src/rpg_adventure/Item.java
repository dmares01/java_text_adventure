package rpg_adventure;

public class Item{
    private String name;
    private int cost;
    private String effect; //keep definition short to stay on one line
    /*
    What other attributes could be given to items?
    Decided to make weapons there own class
    Possible boolean flag for one handed versus two handed
    Could add weight if needed
    Custom print function to print out name of item and attributes that are not null in store menu
     */
    public static void item_print(Item item){//custom print function since println() can not deal with Item class
        System.out.printf(" %1$-2s %2$-25s %3$-2s %4$-5d %5$-1s %6$-20s \n",
                "Item:",item.name,"Cost:",item.cost,"Effect: ",item.effect);
    }
    public int getCost() {
        return cost;
    }

    public String getEffect() {
        return effect;
    }

    public String getName() {
        return name;
    }

    public Item(String name, int cost, String effect) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
    }
}
