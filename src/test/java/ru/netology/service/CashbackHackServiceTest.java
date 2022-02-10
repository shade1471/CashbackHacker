package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCalculate() {

        int actual = service.remain(900);

        assertEquals(100,actual);
    }

    @Test
    void boundaryValuesMax() {

        int actual = service.remain(10000);

        assertEquals(1000,actual);
    }

    @Test
    void boundaryValuesMin() {

        int actual = service.remain(0);

        assertEquals(1000,actual);
    }
}