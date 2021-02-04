package com.studentsfp.devenvironment.unittesting.p0.abstracto;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Article {
    private List<Item> items = new ArrayList<>();

    @Override
    public Double getValue() {
        Double totalValue = 0.;
        for (Item item : items) {
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public Double getDiscountPercentage() {
        return 1.;
    }
}
