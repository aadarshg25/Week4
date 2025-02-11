package com.tit.week04.day01.generics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan {
    public String getMealDetails() {
        return "High Protein Meal: Chicken, Beans, Greek Yogurt";
    }

    @Override
    public String getMealName() {
        return "High Protein Meal";
    }

    @Override
    public void showDetails() {
        System.out.println(getMealDetails());
    }
}

