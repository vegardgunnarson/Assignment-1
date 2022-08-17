import attributes.Attributes;
import exceptions.*;
import heros.*;
import items.*;
import enumerators.*;


public class Main {
    public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {
        Mage Vegard = new Mage("Vegard");
        Vegard.getStats();
        System.out.println(Vegard.getIntelligence());
        Vegard.getLegalWeapon();
        Weapon Wand_1 = new Weapon("Rifle",1, WeaponType.WAND);
        Weapon Oeks = new Weapon("Oeks",1,WeaponType.WAND);
        System.out.println(Vegard.getWeapon());
        Vegard.setLevel(5);
        System.out.println(Vegard.getWeapon());
        Vegard.equipWeapon(Oeks);
        System.out.println(Vegard.getWeapon());
        Armor hjelm = new Armor("Hjelm",61, ArmorType.CLOTH);
        Armor leggb = new Armor("Leggbeskytter",1, ArmorType.MAIL);
        Armor kropp = new Armor("Redningsvest",1, ArmorType.CLOTH);
        hjelm.setIntelligence(150);
        leggb.setIntelligence(200);
        Wand_1.setAttackSpeed(23);
        System.out.println(Wand_1.getDps());

        hjelm.setSlot(Slot.HEAD);
        leggb.setSlot(Slot.LEGS);
        kropp.setSlot(Slot.BODY);

        Vegard.setLevel(2);
        try{
        Vegard.equipArmor(hjelm);
        }catch(InvalidArmorException e){}
        Vegard.equipArmor(kropp);
        Vegard.equipArmor(kropp);
        System.out.println("Weapon damage: "+Wand_1.getDamage());
        Vegard.getStats();
        Vegard.setLevel(1);
        hjelm.setDexterity(5);
        System.out.println(Vegard.getDexterity());




    }
}
