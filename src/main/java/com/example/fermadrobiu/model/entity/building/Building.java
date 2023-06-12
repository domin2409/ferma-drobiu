package com.example.fermadrobiu.model.entity.building;

import com.example.fermadrobiu.model.helpers.Adress;
import jakarta.persistence.Embedded;

public abstract class Building {
    @Embedded       //Obiekt złożony
    private static Adress adress;
}
