package heros;

import enumerators.ArmorType;
import enumerators.WeaponType;

public class Rouge extends Hero{
    public Rouge(String name) {
        super(name);
        legalWeapon.put(WeaponType.DAGGER,true);
        legalWeapon.put(WeaponType.SWORD,true);

        legalArmor.put(ArmorType.LEATHER,true);
        legalArmor.put(ArmorType.MAIL,true);
    }
}
