package heros;

import enumerators.*;
import exceptions.*;
import items.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {
    /**
     * Test 7 from assignment 1
     */
    @Test
    public void warriorDpsTest(){
        Warrior warrior = new Warrior("Wardon");

        int expect = 1*(1+(5/100));
        int actual = warrior.getCharDps();

        assertEquals(expect,actual);
    }

    /**
     * Test 8 from assignment 1
     * @throws InvalidWeaponException
     */
    @Test
    public void warriorDpsWeaponTest() throws InvalidWeaponException {
        Warrior warrior = new Warrior("Wardon");
        Weapon testWeapon1 = new Weapon("Common Axe", 1, WeaponType.AXE);
        testWeapon1.setDamage(7);
        testWeapon1.setSlot(Slot.WEAPON);
        testWeapon1.setAttackSpeed(1.1);

        warrior.equipWeapon(testWeapon1);

        int expect = (int)((7*1.1)*(1+(5/100)));
        int actual = warrior.getCharDps();

        assertEquals(expect,actual);

    }

    /**
     * Test 9 from assignment 1
     * @throws InvalidWeaponException
     * @throws InvalidArmorException
     */
    @Test
    public void warriorDpsWeaponArmorTest() throws InvalidWeaponException, InvalidArmorException {
        Warrior warrior = new Warrior("Wardon");
        Weapon testWeapon1 = new Weapon("Common Axe", 1, WeaponType.AXE);
        testWeapon1.setDamage(7);
        testWeapon1.setSlot(Slot.WEAPON);
        testWeapon1.setAttackSpeed(1.1);
        Armor testPlate = new Armor("Common Plate", 1, ArmorType.PLATE);
        testPlate.setSlot(Slot.BODY);
        testPlate.setStrength(1);

        warrior.equipWeapon(testWeapon1);
        warrior.equipArmor(testPlate);
        warrior.equipWeapon(testWeapon1);
        warrior.equipArmor(testPlate);

        int expect = (int) ((7 * 1.1) * (1 + ((5+1) / 100)));
        int actual = warrior.getCharDps();

        assertEquals(expect, actual);
    }
}
