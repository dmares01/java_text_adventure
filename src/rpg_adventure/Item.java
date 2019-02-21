package rpg_adventure;

public class Item {
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
    public void item_print(){//custom print function since println() can not deal with Item class
        System.out.println("Item: " + this.name + "\t\tCost: " + this.cost + "\t\tEffect: " + this.effect);
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
