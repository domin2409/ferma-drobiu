package com.example.fermadrobiu.model.entity.event;

import com.example.fermadrobiu.model.entity.user.Farmer;

public class ChickenDisposal extends Event {

    private int amount;
    private Boolean isAlive;

    public void NotifyFarmer(Farmer farmer){
        farmer.getNotified("ChickenDisposal event has started");
    }
    public void NotifyFarmer(Farmer farmer, String specialMessage){
        farmer.getNotified("ChickenDisposal event has started. \n"+specialMessage);
    }
}
