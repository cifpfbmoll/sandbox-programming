package com.studentsfp.devenvironment.unittesting.p0.abstracto;

public abstract class Article implements OnSale {

    //private Double price;
    public abstract Double getValue();

    private Double taxPercentage = 0.21;

    public Double getTaxValue() {
        return getValue() * taxPercentage;
    }

    public Double getTotalValue() {
        return (getValue() + getTaxValue()) * getDiscountPercentage();
    }

    @Override
    public Double getDiscountPercentage() {
        return 1.;
    }
}
