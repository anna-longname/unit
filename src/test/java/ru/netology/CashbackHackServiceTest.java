package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemain() {
        new CashbackHackService();
        int amount = 1700;

        int actual;
        int boundary = 1000;
        actual = boundary - amount % boundary;
        int expected = 300;

    assertEquals(actual, expected);
    }


    @Test
    public void calculateOtherRemain() {
        new CashbackHackService();
        int amount = 1000;

        int actual;
        int boundary = 1000;
        actual = boundary - amount % boundary;
        int expected = 0;

        assertEquals(actual, expected);
    }
}