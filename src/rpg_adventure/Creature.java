package rpg_adventure;

public class Creature {
    private int health;
    private int max_health;

    public Creature(int h){
        this.health = h;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void modifyHealth(int change) {
        this.health = health + change;
    }

    public int getHealth() {
        return health;
    }

    public int getMax_health() {
        return max_health;
    }
}
