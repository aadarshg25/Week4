package com.tit.week04.day01.generics.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public void removeMeal(T meal) {
        meals.remove(meal);
    }

    public List<T> getMeals() {
        return meals;
    }

    // Wildcard method to display all meals
    public static void displayMeals(List<? extends MealPlan> meals) {
        for (MealPlan meal : meals) {
            meal.showDetails();
        }
    }

    // Generic method to validate meal plan
    public static <T extends MealPlan> void validateMeal(T meal) {
        System.out.println("Validating meal plan: " + meal.getMealName());
    }
}
