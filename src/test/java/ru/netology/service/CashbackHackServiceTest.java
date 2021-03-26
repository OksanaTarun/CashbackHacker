package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(actual, expected);
    }

}