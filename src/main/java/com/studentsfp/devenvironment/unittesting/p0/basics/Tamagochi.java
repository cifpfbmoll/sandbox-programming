package com.studentsfp.devenvironment.unittesting.p0.basics;

public class Tamagochi implements LivingBeingActions{
    private TamaType tamaType;

    public Tamagochi(TamaType tamaType) {
        this.tamaType = tamaType;
    }

    @Override
    public void feed() {

    }

    @Override
    public void cleanIt() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void play() {

    }

    @Override
    public void die() {

    }

    @Override
    public String render(RenderType renderType) {
        return null;
    }
}
