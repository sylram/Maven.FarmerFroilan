package com.zipcodewilmington.froilansfarm.crops;

public class WatermelonPlant extends Crop {


    public Watermelon yield() {
        return new Watermelon();
    }

    @Override
    public String toString() {
        return "WatermelonPlant";
    }
}
