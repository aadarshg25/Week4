package com.tit.week04.day01.generics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void showDetails() {
        System.out.println("Vegan Meal: " + mealName);
    }
}
