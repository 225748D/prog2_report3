package jp.ac.uryukyu.ie.e225748;

public class LivingThing {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return this.dead;
    
    }

    public int getHitPoint(){
        return this.hitPoint;
    }
    
    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = isDead();
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
