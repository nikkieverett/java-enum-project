package com.example.common;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("January"),
    APRIL("January"),
    MAY("January"),
    JUNE("January"),
    JULY("January"),
    AUGUST("January"),
    SEPTEMBER("January"),
    OCTOBER("January"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String englishName;

    Month(String englishName){
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
