package com.tscovid19project.Models;

public class Meals {

    String sno, name, meals;

    public Meals() {
    }

    public Meals(String sno, String name, String meals) {
        this.sno = sno;
        this.name = name;
        this.meals = meals;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }
}
