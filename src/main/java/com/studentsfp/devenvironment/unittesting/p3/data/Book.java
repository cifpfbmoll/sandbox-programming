package com.studentsfp.devenvironment.unittesting.p3.data;

public class Book extends Publication implements Shareable {
    private boolean isLend = false;

    @Override
    public void doLend() {
        setLend(true);
    }

    @Override
    public void doReturn() {
        setLend(false);
    }

    public boolean isLend() {
        return isLend;
    }

    public void setLend(boolean lend) {
        isLend = lend;
    }
}
