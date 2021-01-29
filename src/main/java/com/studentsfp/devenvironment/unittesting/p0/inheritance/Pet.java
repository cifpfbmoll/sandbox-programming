package com.studentsfp.devenvironment.unittesting.p0.inheritance;

/**
 * com.fbmoll.programming.abstractWorld
 * Class Pet
 * 14/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Pet extends LivingBeing implements Happiness{
    private Gender gender;

    @Override
    public boolean isHappy() {
        //return false;
        return createHappiness();
    }

    @Override
    public boolean createHappiness() {
        return true;
    }
}
