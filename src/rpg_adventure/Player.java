package rpg_adventure;

public class Player {
    private int health = 10;
    private int max_health=10;
    private double money = 20;
    private String player_name;

    public int getHealth() {
        return health;
    }

    public void modifyHealth(int change) {
        this.health = health + change;
    }

    public int getMax_health() {
        return max_health;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void modifyMoney(double change){
        this.money = money + change;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
}
