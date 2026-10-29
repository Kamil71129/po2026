package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void sleeepIn() {
    assertArrayEquals(true, codingBat.sleepIn(false,false));
    assertArrayEquals(false, codingBat.sleepIn(true,false));
    assertArrayEquals(true, codingBat.sleepIn(true,true));
    }

    @org.junit.Test
    public void loneTeen() {
        assertArrayEquals(true, codingBat.loneTeen(false,false));
        assertArrayEquals(false, codingBat.loneTeen(,false));
        assertArrayEquals(false, codingBat.loneTeen(15,15));
    }
    }

    @Test
    public void testSleepIn() {
    }

    @Test
    public void testLoneTeen() {
    }

    @Test
    public void helloName() {
    }

    @Test
    public void firstLast6() {
    }
}