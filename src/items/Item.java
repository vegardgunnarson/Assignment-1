package items;

import enumerators.AttributesEnum;
import enumerators.Slot;

/* This is the parent class of the Items that can be equipped in the game.
 * @author Vegard Gunnarson
 */

public abstract class Item {
    String name;
    int reqLevel;
    Slot slot;

    public Item(String name, int reqLevel) {
        this.name=name;
        this.reqLevel=reqLevel;
    }
    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setReqLevel(int reqLevel) {
        this.reqLevel = reqLevel;
    }

    public Slot getSlot() {
        return slot;
    }

    public String getName() {
        return name;
    }

    public int getReqLevel() {
        return reqLevel;
    }

    /**
     * Returns attribute given from AttributesEnum
     * Only used by armor. Weapon does currently not have these attributes.
     * @param attr AttrubutesEnum.DEXTERITY/STRENGTH/INTELLIGENCE
     * @return Value of Attribute
     */
    public int get(AttributesEnum attr) {
        if (attr == AttributesEnum.DEXTERITY){
            return Armor.dexterity;
        }
        if (attr == AttributesEnum.INTELLIGENCE){
            return Armor.intelligence;
        }
        if (attr == AttributesEnum.STRENGTH){
            return Armor.strength;
        }
        return 0;
    }
}

