package com.codebrew.examples;

public class PhoneNumber {
    private int npa;
    private int nxx;
    private int lastFour;

    public PhoneNumber() {
    }

    public PhoneNumber(int npa, int nxx, int lastFour) {
        this.npa = npa;
        this.nxx = nxx;
        this.lastFour = lastFour;
    }

    public int getNpa() {
        return npa;
    }

    public void setNpa(int npa) {
        this.npa = npa;
    }

    public int getNxx() {
        return nxx;
    }

    public void setNxx(int nxx) {
        this.nxx = nxx;
    }

    public int getLastFour() {
        return lastFour;
    }

    public void setLastFour(int lastFour) {
        this.lastFour = lastFour;
    }
}
