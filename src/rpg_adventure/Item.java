package rpg_adventure;

public class Item{
    private static String name;
    private int cost;
    private String effect; //keep definition short to stay on one line

    public static void item_print(Item item){//custom print function since println() can not deal with Item class
        System.out.printf(" %1$-2s %2$-25s %3$-2s %4$-5d %5$-1s %6$-20s \n",
                "",item.name,"Cost:",item.cost,"Effect: ",item.effect);
    }
    public int getCost() {
        return cost;
    }

    public String getEffect() {
        return effect;
    }

    public static String getName() {
        return name;
    }

    public Item(String name, int cost, String effect) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
    }
}
