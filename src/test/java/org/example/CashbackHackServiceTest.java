package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {

        int amount = 650;

        int expected = 350;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testMin() {

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testMax() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testThousand() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }
}