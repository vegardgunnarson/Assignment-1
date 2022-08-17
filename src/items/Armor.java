package items;

import attributes.Attributes;
import enumerators.ArmorType;
import enumerators.AttributesEnum;
import enumerators.Slot;

import java.util.HashMap;

public class Armor extends Item{
    private ArmorType type;
    Slot slot;
    static int intelligence;
    static int dexterity;
    static int strength;



    public Armor(String name, int reqLevel, ArmorType type){
        super(name, reqLevel);
        this.type = type;
    }

    /**
     * Returns attribute given from AttributesEnum
     * @param equipment map of equipment
     * @param attr attributesEnum
     * @return
     */
    public static int getEquipmentMainStat(HashMap<Enum, Item> equipment, AttributesEnum attr) {
        int mainStat = 0;

        if (equipment.get(Slot.BODY)!=null){
            Armor a = (Armor) equipment.get(Slot.BODY);
            mainStat+=a.get(attr);
        }
        if (equipment.get(Slot.HEAD)!=null){
            Armor a = (Armor) equipment.get(Slot.HEAD);
            mainStat+=a.get(attr);
        }
        if (equipment.get(Slot.LEGS)!=null){
            Armor a = (Armor) equipment.get(Slot.LEGS);
            mainStat+=a.get(attr);
        }

        return mainStat;
    }

    public ArmorType getType() {
        return type;
    }


    @Override
    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    @Override
    public Slot getSlot() {
        return slot;
    }
    public int getDexterity() {
        return this.dexterity;
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public int getStrength() {
        return this.strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int get(AttributesEnum attr) {
        if (attr == AttributesEnum.DEXTERITY){
            return this.dexterity;
        }
        if (attr == AttributesEnum.INTELLIGENCE){
            return this.intelligence;
        }
        if (attr == AttributesEnum.STRENGTH){
            return this.strength;
        }
        return 0;
    }






}
