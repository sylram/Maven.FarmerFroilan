package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Mammal implements Rideable{


    private Boolean rideStatus;


    public void eat(Edible edibleFood) {

    }

    public String noise() {
        return "neigh!";
    }

    public void setRideStatus(Boolean b) {
        this.rideStatus = b;

    }

    public Boolean getRideStatus() {
        return null;
    }
}
