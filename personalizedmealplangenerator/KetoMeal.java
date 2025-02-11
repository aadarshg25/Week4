package com.tit.week04.day01.generics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void showDetails() {
        System.out.println("Keto Meal: " + mealName);
    }
}
