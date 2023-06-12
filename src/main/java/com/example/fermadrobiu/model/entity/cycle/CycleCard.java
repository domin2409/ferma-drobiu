package com.example.fermadrobiu.model.entity.cycle;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

public class CycleCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cycleCardId;
    private List<DayData> dayData = new ArrayList<>();
    private int totalWaterUsage;

    public DayData createDayData(int dayNo, int waterUsage) {
        DayData dayData = new DayData(dayNo, waterUsage);
        this.dayData.add(dayData);
        this.totalWaterUsage += waterUsage;
        return dayData;
    }

    }
    class DayData {   //kompozycja
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int dayDataId;
        private int dayNo;
        private int waterUsage;


        public DayData(int dayNo, int waterUsage) {
            this.dayNo = dayNo;
            this.waterUsage = waterUsage;

        }
    }


