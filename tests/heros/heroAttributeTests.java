package heros;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class heroAttributeTests {
    /**
     * Task 3 from assignment 1
     */
    @Test
    public void mageAttributeTest() {
        Mage h = new Mage("Vegard");
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1); //Strength
        expected.add(1); //Dexterity
        expected.add(8); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 3 from assignment 1
     */
    @Test
    public void rangerAttributeTest() {
        Ranger h = new Ranger("Vegard");
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1); //Strength
        expected.add(7); //Dexterity
        expected.add(1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 3 from assignment 1
     */
    @Test
    public void rougeAttributeTest() {
        Rouge h = new Rouge("Vegard");
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2); //Strength
        expected.add(6); //Dexterity
        expected.add(1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 3 from assignment 1
     */
    @Test
    public void warriorAttributeTest() {
        Warrior h = new Warrior("Vegard");
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5); //Strength
        expected.add(2); //Dexterity
        expected.add(1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }


    

    /**
     * Task 4 from assignment 1
     */
    @Test
    public void mageLevelAttributeTest() {
        Mage h = new Mage("Vegard");
        h.levelUp();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1+1); //Strength
        expected.add(1+1); //Dexterity
        expected.add(8+5); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 4 from assignment 1
     */
    @Test
    public void rangerLevelAttributeTest() {
        Ranger h = new Ranger("Vegard");
        h.levelUp();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1+1); //Strength
        expected.add(7+5); //Dexterity
        expected.add(1+1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 4 from assignment 1
     */
    @Test
    public void rougeLevelAttributeTest() {
        Rouge h = new Rouge("Vegard");
        h.levelUp();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2+1); //Strength
        expected.add(6+4); //Dexterity
        expected.add(1+1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
    /**
     * Task 4 from assignment 1
     */
    @Test
    public void warriorLevelAttributeTest() {
        Warrior h = new Warrior("Vegard");
        h.levelUp();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5+3); //Strength
        expected.add(2+2); //Dexterity
        expected.add(1+1); //Intelligence

        List<Integer> actual = new ArrayList<Integer>();
        actual.add(h.getStrength());
        actual.add(h.getDexterity());
        actual.add(h.getIntelligence());

        assertEquals(expected,actual);
    }
}
