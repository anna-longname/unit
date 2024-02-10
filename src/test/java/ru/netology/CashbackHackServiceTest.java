package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain() {

        new CashbackHackService();
        int amount = 500;

        int actual;
        int boundary = 1000;
        actual = boundary - amount % boundary;
        int expected = 500;

        assertEquals(expected, actual);
    }


    @Test
    public void OtherRemain() {
        new CashbackHackService();
        int amount = 1000;

        int actual;
        int boundary = 1000;
        actual = boundary - amount % boundary;
        int expected = 0;

        assertEquals(expected, actual);
    }
}

