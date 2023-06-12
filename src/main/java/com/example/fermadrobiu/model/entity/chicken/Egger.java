package com.example.fermadrobiu.model.entity.chicken;

import jakarta.persistence.Column;

public class Egger extends Chicken{
    @Column(nullable = true)
    private int amountOfEggs;
}
