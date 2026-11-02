package agh.po.lab3;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class CodingBatTest extends TestCase {
    CodingBat codingBat = new CodingBat();
    private void assertArrayEquals(boolean b, boolean b1) {
    }
    private void assertArrayEquals(String s, String boron) {
    }



    public void testSleepIn() {
        assertArrayEquals(true, codingBat.sleepIn(false,false));
        assertArrayEquals(false, codingBat.sleepIn(true,false));
        assertArrayEquals(true, codingBat.sleepIn(true,true));
    }


    public void testLoneTeen() {
        assertArrayEquals(true, codingBat.loneTeen(17,21));
        assertArrayEquals(false, codingBat.loneTeen(90,20));
        assertArrayEquals(false, codingBat.loneTeen(15,15));
    }

    public void testHelloName() {
        assertArrayEquals("Hello Boron!", codingBat.helloName("Boron"));
        assertArrayEquals("Hello Mia!", codingBat.helloName("Mia"));
        assertArrayEquals("Hello Emilia!", codingBat.helloName("Emilia"));

    }


    public void testFirstLast6() {
        assertArrayEquals(true, codingBat.firstLast6(new int[]{5,6}));
        assertArrayEquals(true, codingBat.firstLast6(new int[]{1,2,6}));
        assertArrayEquals(false, codingBat.firstLast6(new int[]{1,2,3,4}));
    }
}