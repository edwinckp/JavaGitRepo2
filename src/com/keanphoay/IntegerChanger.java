package com.keanphoay;

public class IntegerChanger {

    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number >= 0) {
            this.number = number;
        }
    }

    public void add(int number) {
        int prevNumber = this.number;
        this.number += number;
        if(this.number < 0) {
            this.number = prevNumber;
        }
    }

    public void subtract(int number) {
        if(this.number >= number) {
            this.number -= number;
        }
        else {
            this.number = 0;
        }
    }
}
