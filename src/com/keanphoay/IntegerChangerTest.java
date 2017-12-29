package com.keanphoay;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class IntegerChangerTest {

    private IntegerChanger instance;

    @BeforeEach
    void setUp() {
        instance = new IntegerChanger();
    }

    @org.junit.jupiter.api.Test
    void getNumber() {
        assertEquals(0, instance.getNumber());
    }

    @org.junit.jupiter.api.Test
    void setNumber() {
        instance.setNumber(1);
        int tempNumber = instance.getNumber();
        assertEquals(1, tempNumber);
        instance.setNumber(-1);
        assertEquals(1, tempNumber);
        instance.setNumber(2);
        assertEquals(2, instance.getNumber());
    }

    @org.junit.jupiter.api.Test
    void add() {
        instance.setNumber(5);
        instance.add(2);
        int tempNumber = instance.getNumber();
        assertEquals(7, tempNumber);
        instance.add(-8);
        assertEquals(7, tempNumber);
        instance.add(-6);
        assertEquals(1, instance.getNumber());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        fail("unimplemented");
    }
}