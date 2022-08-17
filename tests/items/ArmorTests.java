package items;
import enumerators.ArmorType;
import enumerators.Slot;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import heros.Mage;
import heros.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ArmorTests {

    /**
     * Test 4 from assignment 1
     */
    @Test
    public void armorExceptionIllegalTest() {
        Warrior testWarrior = new Warrior("Vegard");
        Armor testArmor1 = new Armor("Cloth",1,ArmorType.CLOTH);

        String expected = "Invalid armor";

        InvalidArmorException exception = assertThrows(InvalidArmorException.class,() ->  testWarrior.equipArmor(testArmor1));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }
    /**
     * Test 3 from assignment 1
     */
    @Test
    public void armorExceptionLevelTest() {
        Warrior testWarrior = new Warrior("Vegard");
        Armor testArmor1 = new Armor("Plate",1,ArmorType.PLATE);
        testArmor1.setReqLevel(2);
        String expected = "Invalid armor";

        InvalidArmorException exception = assertThrows(InvalidArmorException.class,() ->  testWarrior.equipArmor(testArmor1));
        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    @Test
    public void changeLevelTest(){
        Armor a = new Armor("Common plate",1, ArmorType.PLATE);
        a.setReqLevel(5);
        a.setSlot(Slot.BODY);
        a.getType();

        int expect = 5;
        int actual = a.getReqLevel();

        assertEquals(expect,actual);
    }






}
