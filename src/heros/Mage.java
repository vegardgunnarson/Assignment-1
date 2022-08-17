package heros;

import enumerators.ArmorType;
import enumerators.WeaponType;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
        legalWeapon.put(WeaponType.STAFF,true);
        legalWeapon.put(WeaponType.WAND,true);
        legalArmor.put(ArmorType.CLOTH,true);
    }
}
