package ru.netology.service;
import static org.testng.AssertJUnit.*;
public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @org.testng.annotations.Test
    void testRemainBoundaryValueFirst() {
        org.testng.Assert.assertEquals(1000,cashbackHackService.remain(0));
    }
    @org.testng.annotations.Test
    void testRemainBoundaryValueSecond() {
        org.testng.Assert.assertEquals(0,cashbackHackService.remain(1000));
    }
    @org.testng.annotations.Test
    void testRemainBoundaryValueThird() {
        org.testng.Assert.assertEquals(1,cashbackHackService.remain(999));
    }
    @org.testng.annotations.Test
    void testRemainBoundaryValueFourth() {
        org.testng.Assert.assertEquals(999,cashbackHackService.remain(1));
    }
    @org.testng.annotations.Test
    void testRemainBoundaryValueFifth() {
        org.testng.Assert.assertEquals(1001,cashbackHackService.remain(999));
    }
    @org.testng.annotations.Test
    void testRemainBoundaryValueSixth() {
        org.testng.Assert.assertEquals(1000,cashbackHackService.remain(1000));
    }
}