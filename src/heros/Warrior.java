package heros;

import enumerators.ArmorType;
import enumerators.WeaponType;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
        legalWeapon.put(WeaponType.AXE,true);
        legalWeapon.put(WeaponType.HAMMER,true);
        legalWeapon.put(WeaponType.SWORD,true);

        legalArmor.put(ArmorType.MAIL,true);
        legalArmor.put(ArmorType.PLATE,true);
    }
}
