package com.example.fermadrobiu.model.entity.user;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Farmer extends User{
    private static List<Farmer> allFarmers = new ArrayList<>();
    private static void addStudent(Farmer farmer) {
        allFarmers.add(farmer);
    }


    public static List<Farmer> getAllFarmers() {
        return allFarmers;
    }
    public static void showAllFarmers() {
        System.out.println("All Farmers:");
        for (Farmer farmer : allFarmers) {
            System.out.println(farmer);
        }
    }
    public void getNotified(String message) {
        System.out.println("Farmer " + this.getLastName() + " received message: " + message);
    }

}
