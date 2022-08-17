package items;

import enumerators.Slot;
import enumerators.WeaponType;
import exceptions.InvalidWeaponException;
import heros.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WeaponTests {
    public Weapon testWeapon1 = new Weapon("Common Axe", 1, WeaponType.AXE);
    public Weapon testWeapon2 = new Weapon("Common Bow",1,WeaponType.BOW);


    @Test
    public void weaponDpsTest() {
        testWeapon1.setDamage(7);
        testWeapon1.setSlot(Slot.WEAPON);
        testWeapon1.setAttackSpeed(1.1);

        testWeapon2.setDamage(12);
        testWeapon2.setSlot(Slot.WEAPON);
        testWeapon2.setAttackSpeed(0.8);

        int expect = (int)(7*1.1);
        int actual = testWeapon1.getDps();

        assertEquals(expect,actual);
    }

    /**
     * Test 3 from assignment 1
     * Mage tries to equip illegal weapon (Mage can only use Staff and Wand)
     */
    @Test
    public void weaponExceptionIllegalTest() {
        Warrior testWarrior = new Warrior("Vegard");

        String expected = "Invalid weapon";

        Exception exception = assertThrows(InvalidWeaponException.class,() ->  testWarrior.equipWeapon(testWeapon2));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    /**
     * Test 1 from assignment 1
     * Warrior with level 1 tries to equip leagal weapon with level requirement 2
     */
    @Test
    public void weaponExceptionLevelTest() {
        Warrior testWarrior = new Warrior("Vegard");
        testWarrior.setLevel(1);
        testWeapon1.setReqLevel(2);
        String expected = "Invalid weapon";

        Exception exception = assertThrows(InvalidWeaponException.class,() ->  testWarrior.equipWeapon(testWeapon1));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    /**
     * Test 5 from Assignent 1
     */
    @Test
    public void weaponBooleanTest() throws InvalidWeaponException {
        Warrior testWarrior = new Warrior("Vegard");
        testWarrior.setLevel(1);
        testWeapon1.setReqLevel(1);
        testWarrior.equipWeapon(testWeapon1);
        Boolean expected = true;
        Boolean actual = testWarrior.getHasWeapon();

        assertEquals(expected,actual);
    }

}
