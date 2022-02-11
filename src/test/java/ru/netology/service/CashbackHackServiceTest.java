package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCalculate() {

        int actual = service.remain(900);

        assertEquals(actual, 100);
    }

    @Test
    void shouldCalculateBoundaryValuesMin() {

        int actual = service.remain(1999);

        assertEquals(actual, 1);
    }

    @Test
    void shouldCalculateBoundaryValuesMax() {

        int actual = service.remain(2000);

        assertEquals(actual, 1000);
    }
}