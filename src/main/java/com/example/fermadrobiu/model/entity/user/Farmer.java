package com.example.fermadrobiu.model.entity.user;

import java.util.ArrayList;
import java.util.List;

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
}
