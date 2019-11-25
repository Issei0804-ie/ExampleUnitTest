package jp.ac.uryukyu.ie.e195755;

public class LivingThing {
    private  String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
    }
    public boolean isDead(){
        return this.dead;
    }

    public void attack(LivingThing opponent){
        if (!this.dead) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        System.out.printf("%sは倒れた\n",this.name);
    }

    public String getName(){
        return this.name;
    }
    public int getHitPoint() { return this.hitPoint; }
    public int getAttack() { return this.attack; }
    public boolean getDead() { return this.dead; }
    public void setName(String name) { this.name = name; }
    public void setHitPoint(int hitPoint) { this.hitPoint = hitPoint; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setDead(boolean dead) { this.dead = dead; }
}
