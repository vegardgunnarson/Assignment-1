package heros;

import attributes.Attributes;
import exceptions.*;
import items.*;
import enumerators.*;
import java.util.HashMap;

/* This is the parent class of all heros/characters in the game.
 * All methods can be used by all heros
 * @author Vegard Gunnarson
 */

public abstract class Hero {
    String name;
    int level;
    Weapon weapon;
    int damage;
    int totalMain;
    boolean hasArmor;
    boolean hasWeapon;
    HashMap<Enum,Boolean> legalWeapon = new HashMap<>();
    HashMap<Enum,Boolean> legalArmor = new HashMap<>();
    HashMap<Enum, Item> equipment = new HashMap<>();


    /**
     * Constructor for hero class.
     * Player starts with level 1 without weapon/armor and has only empty slots.
     * @param name Any String
     */
    Hero(String name){
        this.name = name;
        this.level = 1;
        this.hasArmor=false;
        this.hasWeapon=false;
        equipment.put(Slot.WEAPON,null);
        equipment.put(Slot.HEAD,null);
        equipment.put(Slot.BODY,null);
        equipment.put(Slot.LEGS,null);

    }

    /**
     * Calculates Character DPS
     * if there is no weapon, weapon DPS is set to 1
     * @return character DPS
     */
    public int getCharDps(){
        if (this.weapon==null){
            int charDps = 1*(1+this.getTotalMain()/100);
            return charDps;
        }
        int charDps = weapon.getDps()*(1+this.getTotalMain()/100);
        return charDps;
    }

    /**
     * Functions that adds main attribute with main attribute from Armor (if any)
     * @return total main attribute
     */
    public int getTotalMain() {
        //lvl -1 so that level 2 gives 1 more point of Dexterity
        int lvl=this.level;
        Class hero = this.getClass();
        if (hero== Mage.class) {
            totalMain = getIntelligence() + Armor.getEquipmentMainStat(equipment, AttributesEnum.INTELLIGENCE);
        }
        if (hero== Ranger.class) {
            totalMain = getDexterity() + Armor.getEquipmentMainStat(equipment, AttributesEnum.DEXTERITY);
        }
        if (hero== Rouge.class) {
            totalMain = getDexterity() + Armor.getEquipmentMainStat(equipment, AttributesEnum.DEXTERITY);
        }
        if (hero== Warrior.class) {
            totalMain = getStrength() + Armor.getEquipmentMainStat(equipment, AttributesEnum.STRENGTH);

        }
        return totalMain;
    }

    /**
     * Checks if this hero is allowed to carry this weapon and equips or replaces if allowed
     * @param weapon
     * @throws InvalidWeaponException
     */
    public void equipWeapon(Weapon weapon) throws InvalidWeaponException{
        WeaponType type = weapon.getType();
        //checks if this hero can get this weapon - legalWeapon Map is either true or null
        boolean allowed = this.legalWeapon.get(type)!=null;
        //checks if required level is higher than hero level - must be less or equal
        boolean levelReq = weapon.getReqLevel()<=getLevel();
        if (allowed&&levelReq){
            if (equipment.get(Slot.WEAPON)==null){
                equipment.put(Slot.WEAPON,weapon);
                System.out.println("Weapon equipped");
                this.weapon = weapon;
                this.hasWeapon=true;
            }
            else {
                equipment.put(Slot.WEAPON,weapon);
                System.out.println("Weapon replaced");
                this.weapon = weapon;
                this.hasWeapon=true;
            }
        }
        else{
            throw new InvalidWeaponException("Invalid weapon");
        }
    }


    public String getWeapon() {
        if (equipment.get(Slot.WEAPON)==null){
            return "No weapon found";
        }
        return equipment.get(Slot.WEAPON).getName();
    }

    public void getLegalWeapon() {
        System.out.println(legalWeapon.keySet());
    }

    /**
     * Checks if this hero is allowed to carry this armor and equips or replaces if allowed
     * @param armor
     * @throws InvalidArmorException
     */
    public void equipArmor(Armor armor) throws InvalidArmorException {
        Slot slot = armor.getSlot();
        ArmorType type = armor.getType();
        //checks if this hero can get this armor - legalArmor Map is either true or null
        boolean allowed = this.legalArmor.get(type)!=null;
        //checks if required level is higher than hero level - must be less or equal
        boolean levelReq = armor.getReqLevel()<=getLevel();
        if (allowed&levelReq){
            if (equipment.get(slot)==null){
                equipment.put(slot,armor);
                System.out.println("Armor equipped");
                hasArmor=true;
            }
            else {
                equipment.put(slot,armor);
                System.out.println("Armor replaced");
                hasArmor=true;
            }
        }
        else {
            throw new InvalidArmorException("Invalid armor");
        }
    }

    public void getLegalArmor() {
        System.out.println(legalArmor.keySet());
    }

    public void levelUp() {
        this.level++;
    }
    public int getDexterity() {
        int dexterity = Attributes.getHeroDexterity(this.getClass(),this.level) + Armor.getEquipmentMainStat(equipment, AttributesEnum.DEXTERITY);
        return dexterity;
    }
    public int getStrength() {
        int strength = Attributes.getHeroStrength(this.getClass(),this.level)+ Armor.getEquipmentMainStat(equipment, AttributesEnum.STRENGTH);
        return strength;
    }
    public int getIntelligence() {
        int intelligence = Attributes.getHeroIntelligence(this.getClass(),this.level)+ Armor.getEquipmentMainStat(equipment, AttributesEnum.INTELLIGENCE);
        return intelligence;
    }

    /**
     * Function that returns a heroes damage, if no weapon equipped=1, else get damage from Attributes class
     * @return damage
     */
    public int getDamage() {
        if (this.weapon==null){
            return damage=1;
        }
        this.damage = Attributes.getHeroDamage(this.getClass(),this.level,this.weapon.getDamage());
        return damage;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean getHasArmor() {
        return hasArmor;
    }

    public boolean getHasWeapon() {
        return hasWeapon;
    }

    public void getStats() {
        System.out.println("Name: "+this.name);
        System.out.println("Level: "+this.level);
        System.out.println("Strength: "+getStrength());
        System.out.println("Dexterity: "+getDexterity());
        System.out.println("Intelligence: "+getIntelligence());
        System.out.println("DPS: "+getCharDps());
    }


    public String getItems() {
        // This function was implemented mainly for development reasons, but can be nice to have in game.
        if (equipment.get(Slot.WEAPON)==null) {
            System.out.println("Weapon: No weapon");
        }
        if (equipment.get(Slot.WEAPON)!=null) {
            System.out.println("Weapon: " + equipment.get(Slot.WEAPON).getName());
        }
        if (equipment.get(Slot.HEAD)==null) {
            System.out.println("Head: No armor");
        }
        if (equipment.get(Slot.HEAD)!=null) {
            System.out.println("Head: " + equipment.get(Slot.HEAD).getName());
        }
        if (equipment.get(Slot.LEGS)==null){
            System.out.println("Legs: No armor");
        }
        if (equipment.get(Slot.LEGS)!=null) {
            System.out.println("Legs: " + equipment.get(Slot.LEGS).getName());
        }
        if (equipment.get(Slot.BODY)==null){
            System.out.println("Body: No armor");
        }
        if (equipment.get(Slot.BODY)!=null) {
            System.out.println("Body: " + equipment.get(Slot.BODY).getName());
        }
        return "";
    }
}
