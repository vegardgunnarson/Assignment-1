package heros;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MageTests {
    @Test
    public void attributeTest() {
        Mage m = new Mage("Maggie");
        m.setLevel(4);

        int expect = 8+3*5;
        int actual = m.getIntelligence();

        assertEquals(expect,actual);
    }

}
