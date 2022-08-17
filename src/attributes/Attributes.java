package attributes;

import enumerators.AttributesEnum;
import heros.Mage;
import heros.Ranger;
import heros.Rouge;
import heros.Warrior;

/* This class is used for returning attributes that is predefined.
 * @author Vegard Gunnarson
 */

public class Attributes {

    /**
     * Calculate Hero Damage
     * @param hero Any hero-class
     * @param level Any int
     * @param weaponDmg Any int
     * @return int value - HeroDamage
     */
    public static int getHeroDamage(Class hero, int level, int weaponDmg){
        double damage=1;
        // lvl = level-1 to get correct output when calculating attribute
        int lvl = level-1;
        if (hero== Mage.class) {
            double mainAttr =(getHeroIntelligence(hero,level));
            //hero damage is increased with main attribute
            damage = ((mainAttr/100)+1) * weaponDmg;
        }
        if (hero== Ranger.class) {
            double calc =(getHeroDexterity(hero,level));
            damage = ((calc/100)+1) * weaponDmg;
        }
        if (hero== Rouge.class) {
            double calc =(getHeroDexterity(hero,level));
            damage = ((calc/100)+1) * weaponDmg;
        }
        if (hero== Warrior.class) {
            double calc =(getHeroStrength(hero,level));
            damage = ((calc/100)+1) * weaponDmg;
        }
        int heroDamage = (int) damage;
        return heroDamage;
    }

    /**
     * Function for calculating only dexterity for a hero
     * @param hero Any hero-class
     * @param lvl Any int
     * @return int dexterity
     */
    public static int getHeroDexterity(Class hero, int lvl){
        lvl=lvl-1;
        int dexterity = 0;
        if (hero== Mage.class) {
            dexterity =1+(lvl);
        }
        if (hero== Ranger.class) {
            //Ranger starts with 7 in dexterity, and gets 5 more for every level
            dexterity =7+(lvl*5);
        }
        if (hero== Rouge.class) {
            dexterity =6+(lvl*4);
        }
        if (hero== Warrior.class) {
            dexterity =2+(lvl*2);
        }
        return dexterity;
    }
    public static int getHeroStrength(Class hero, int lvl){
        lvl=lvl-1;
        int strength = 0;
        if (hero== Mage.class) {
            strength =1+(lvl);
        }
        if (hero== Ranger.class) {
            strength =1+(lvl);
        }
        if (hero== Rouge.class) {
            strength =2+(lvl);
        }
        if (hero== Warrior.class) {
            strength =5+(lvl*3);
        }
        return strength;
    }
    public static int getHeroIntelligence(Class hero, int lvl){
        lvl=lvl-1;
        int intelligence = 0;
        if (hero== Mage.class) {
            intelligence =8+(lvl*5);
        }
        if (hero== Ranger.class) {
            intelligence =1+(lvl);
        }
        if (hero== Rouge.class) {
            intelligence =1+(lvl);
        }
        if (hero== Warrior.class) {
            intelligence =1+(lvl);
        }
        return intelligence;
    }
}

