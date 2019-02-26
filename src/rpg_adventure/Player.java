package rpg_adventure;

public class Player extends Creature {
    private int experience=0;
    private double money = 20;
    private String player_name;


    public Player(String player_name) {
        super(10);
        this.player_name = player_name;
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

    public int getExperience() {
        return experience;
    }

    public void modifyExperience(int change){
        this.experience = experience + change;
    }
}
