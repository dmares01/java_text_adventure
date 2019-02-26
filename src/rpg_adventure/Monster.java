package rpg_adventure;

public class Monster extends Creature {
    private int damage;
    private int level;
    public Monster(int level, int damage){
        super(level * 2);
        this.level = level;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }
}
