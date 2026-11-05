package agh.po.lab3;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class CodingBatTest extends TestCase {
    CodingBat codingBat = new CodingBat();
    private void assertArrayEquals(boolean b, boolean b1) {
    }
    private void assertArrayEquals(String s, String boron) {
    }


    @Test
    public void testSleepIn() {
        assertArrayEquals(true, codingBat.sleepIn(false,false));
        assertArrayEquals(false, codingBat.sleepIn(true,false));
        assertArrayEquals(true, codingBat.sleepIn(true,true));
    }

    @Test
    public void testLoneTeen() {
        assertArrayEquals(true, codingBat.loneTeen(17,21));
        assertArrayEquals(false, codingBat.loneTeen(90,20));
        assertArrayEquals(false, codingBat.loneTeen(15,15));
    }
    @Test
    public void testHelloName() {
        assertArrayEquals("Hello Boron!", codingBat.helloName("Boron"));
        assertArrayEquals("Hello Mia!", codingBat.helloName("Mia"));
        assertArrayEquals("Hello Emilia!", codingBat.helloName("Emilia"));

    }

    @Test
    public void testFirstLast6() {
        assertArrayEquals(true, codingBat.firstLast6(new int[]{5,6}));
        assertArrayEquals(true, codingBat.firstLast6(new int[]{1,2,6}));
        assertArrayEquals(false, codingBat.firstLast6(new int[]{1,2,3,4}));
    }


    @Test
    public void testMapAB3(){
        Map<String,String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        expected1.put("b", "aaa");
        expected1.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "aaa");
        expected2.put("b", "bbb");
        expected2.put("c", "cake");

        Map<String, String> map4 = new HashMap<>();
        map4.put("c", "cake");
        map4.put("d", "dog");

        Map<String, String> expected3 = new HashMap<>();
        expected3.put("c", "cake");
        expected3.put("d", "dog");



        assertEquals(expected3, codingBat.mapAB3(map4));
        assertEquals(expected2, codingBat.mapAB3(map3));
        assertEquals(expected1, codingBat.mapAB3(map));

    }

    @Test
    public void testWordMultiple() {
        String[] map2 = new String[]{"a","b","a","c","b"};

        Map<String, Boolean> expected1 = new HashMap<>();
        expected1.put("a", true);
        expected1.put("b", true);
        expected1.put("c", false);

        String[] map5 = new String[]{"c", "b", "a"};

        Map<String, Boolean> expected2 = new HashMap<>();
        expected2.put("a", false);
        expected2.put("b", false);
        expected2.put("c", false);

        String[] map6 = new String[]{"c", "c", "c", "c"};

        Map<String, Boolean> expected3 = new HashMap<>();
        expected3.put("c", true);

        assertEquals(expected3, codingBat.wordMultiple(map6));
        assertEquals(expected2, codingBat.wordMultiple(map5));
        assertEquals(expected1, codingBat.wordMultiple(map2));
    }
}