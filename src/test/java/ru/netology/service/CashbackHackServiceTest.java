package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculate() {

        int actual = service.remain(900);

        assertEquals(100,actual);
    }

    @Test
    public void shouldCalculateMaxRemain() {

        int actual = service.remain(2001);

        assertEquals(999,actual);
    }

    @Test
    public void shouldCalculateMinRemain() {

        int actual = service.remain(1999);

        assertEquals(1,actual);
    }

    @Test
    public void shouldCalculateBoundaryValues() {

        int actual = service.remain(1000);

        assertEquals(actual, 0);
    }
}