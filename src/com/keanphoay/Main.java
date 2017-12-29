package com.keanphoay;

public class Main {

    public static void main(String[] args) {
        IntegerChanger intChgr = new IntegerChanger();
        intChgr.setNumber(10);
        System.out.println(intChgr.getNumber());
        intChgr.add(30);
        System.out.println(intChgr.getNumber());
        intChgr.add(-20);
        System.out.println(intChgr.getNumber());
        intChgr.subtract(-20);
        System.out.println(intChgr.getNumber());
    }
}
