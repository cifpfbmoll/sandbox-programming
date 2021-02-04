package com.studentsfp.devenvironment.unittesting.p0.abstracto;

public class Item extends Article {
    private Double price;
    @Override
    public Double getValue() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
