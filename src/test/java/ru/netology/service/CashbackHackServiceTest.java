package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculate() {

        int actual = service.remain(900);

        assertEquals(100, actual);
    }

    @Test
    public void shouldCalculateMinRemain() {

        int actual = service.remain(1999);

        assertEquals(1, actual);
    }

    @Test
    public void shouldCalculateMaxRemain() {

        int actual = service.remain(2000);

        assertEquals(1000, actual);
    }

    @Test
    public void shouldCalculateBoundaryValues() {

        int actual = service.remain(1000);

        assertEquals(0, actual);
    }
}