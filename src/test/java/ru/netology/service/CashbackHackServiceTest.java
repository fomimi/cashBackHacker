package ru.netology.service;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @org.junit.Test
    public void testRemainBoundaryValueFirst() {
        org.junit.Assert.assertEquals(1000,cashbackHackService.remain(0));
    }
    @org.junit.Test
    public void testRemainBoundaryValueSecond() {
        org.junit.Assert.assertEquals(0,cashbackHackService.remain(1000));
    }
    @org.junit.Test
    public void testRemainBoundaryValueThird() {
        org.junit.Assert.assertEquals(1,cashbackHackService.remain(999));
    }
    @org.junit.Test
    public void testRemainBoundaryValueFourth() {
        org.junit.Assert.assertEquals(999,cashbackHackService.remain(1));
    }
    @org.junit.Test
    public void testRemainBoundaryValueFifth() {
        org.junit.Assert.assertEquals(1001,cashbackHackService.remain(999));
    }
    @org.junit.Test
    public void testRemainBoundaryValueSixth() {
        org.junit.Assert.assertEquals(1000,cashbackHackService.remain(1000));
    }
    public @org.junit.Test
    void testRemainBoundaryValueSeventh() {
        org.junit.Assert.assertEquals(100,cashbackHackService.remain(900));
    }
    @org.junit.Test
    public void testRemainBoundaryValueEighth() {
        org.junit.Assert.assertEquals(0,cashbackHackService.remain(-1));
    }
}