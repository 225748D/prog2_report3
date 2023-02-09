package jp.ac.uryukyu.ie.e225748;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test void attackWithWeponSkillTest(){
        Warrior demo = new Warrior("Demo戦士", 100, 100);
        int enemyDefaultHP = 1000;
        Enemy slime = new Enemy("Demoスライム", enemyDefaultHP, 100);
        for(int i=0; i<3; i++){
            demo.attackWithWeponSkill(slime);
            assertEquals(demo.attack * 3 /2, enemyDefaultHP - slime.hitPoint);
            enemyDefaultHP = slime.hitPoint;
        }
    }
}