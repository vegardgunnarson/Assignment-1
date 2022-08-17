import exceptions.*;
import heros.*;
import items.*;
import enumerators.*;

/**
 * Runnable Main class where you can test all implemented features of the game
 */
public class Main {
    public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {
        Mage Vegard = new Mage("Vegard");
        Vegard.getLegalWeapon();
        Vegard.getLegalArmor();
        Weapon w1 = new Weapon("Common Wand",1, WeaponType.WAND);
        Weapon w2 = new Weapon("Common Axe",300,WeaponType.AXE);
        Armor a1 = new Armor("Helmet",61, ArmorType.CLOTH);
        Armor a2 = new Armor("Pants",1, ArmorType.MAIL);
        Armor a3 = new Armor("Flotation Device",1, ArmorType.CLOTH);
        a1.setIntelligence(13);
        w1.setAttackSpeed(23);
        w1.setDamage(3);

        a1.setSlot(Slot.HEAD);
        a2.setSlot(Slot.LEGS);
        a3.setSlot(Slot.BODY);

        Vegard.setLevel(2);
        try {
            Vegard.equipWeapon(w1);
        }catch (InvalidWeaponException e){
            System.out.println(e.getMessage());}
        try {
            Vegard.equipArmor(a3);;
        }catch (InvalidArmorException e){
            System.out.println(e.getMessage());}
        try {
            Vegard.equipArmor(a2);;
        }catch (InvalidArmorException e){
            System.out.println(e.getMessage());}

        Vegard.getStats();
        Vegard.getItems();
    }
}
