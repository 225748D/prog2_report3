package jp.ac.uryukyu.ie.e225748;


public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = this.attack * 3 / 2;
        if(this.dead == false){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    
}