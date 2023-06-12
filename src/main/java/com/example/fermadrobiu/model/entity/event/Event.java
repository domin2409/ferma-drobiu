package com.example.fermadrobiu.model.entity.event;

import com.example.fermadrobiu.model.entity.user.Farmer;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private Date startDate;
    private Date endDate;
    private String description;
    private Boolean status;

    @ManyToOne
    private Farmer farmer;


    public void NotifyFarmer(Farmer farmer){
        farmer.getNotified("New event has started");
    }

    public Event() {

    }

//    @Override
//    public String toString() {
//
//    }
}
