package com.tit.week04.day01.generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void showDetails() {
        System.out.println("Vegetarian Meal: " + mealName);
    }
}


