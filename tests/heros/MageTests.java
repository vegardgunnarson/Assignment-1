package heros;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MageTests {
    /**
     * Test 1 from assignment 1
     */
    @Test
    public void checkLevelTest() {
        Mage m = new Mage("Maggie");
        int expected = 1;
        int actual = m.getLevel();

        assertEquals(expected,actual);
    }

    /**
     * Test 2 from assignment 1
     */
    @Test
    public void gainLevelTest() {
        Mage m = new Mage("Maggie");
        m.levelUp();

        int expect = 2;
        int actual = m.getLevel();

        assertEquals(expect,actual);
    }





}
