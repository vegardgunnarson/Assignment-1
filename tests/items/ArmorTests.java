package items;
import enumerators.ArmorType;
import enumerators.Slot;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArmorTests {

    @Test
    public void changeLevelTest(){
        Armor a = new Armor("Shin guards",1, ArmorType.CLOTH);
        a.setReqLevel(5);
        a.setSlot(Slot.LEGS);
        a.getType();

        int expect = 5;
        int actual = a.getReqLevel();

        assertEquals(expect,actual);
    }



}
