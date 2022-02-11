package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    //Junit4
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

        int actual = service.remain(2001);

        assertEquals(999, actual);
    }

    @Test
    public void shouldCalculateBoundaryValues() {

        int actual = service.remain(1000);

        assertEquals(0, actual);
    }

    //Junit5

    @org.junit.jupiter.api.Test
    void shouldCalculateJU5() {

        int actual = service.remain(900);

        org.junit.jupiter.api.Assertions.assertEquals(100, actual);
    }

    @Test
    public void shouldCalculateMinRemainJU5() {

        int actual = service.remain(1999);

        org.junit.jupiter.api.Assertions.assertEquals(1, actual);
    }

    @Test
    public void shouldCalculateMaxRemainJU5() {

        int actual = service.remain(2001);

        org.junit.jupiter.api.Assertions.assertEquals(999, actual);
    }

    @Test
    public void shouldCalculateBoundaryValuesJU5() {

        int actual = service.remain(1000);

        org.junit.jupiter.api.Assertions.assertEquals(0, actual);
    }
}