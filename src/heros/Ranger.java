package heros;

import enumerators.ArmorType;
import enumerators.WeaponType;

public class Ranger extends Hero{
    public Ranger(String name) {
        super(name);
        legalWeapon.put(WeaponType.BOW,true);

        legalArmor.put(ArmorType.LEATHER,true);
        legalArmor.put(ArmorType.MAIL,true);
    }
}
