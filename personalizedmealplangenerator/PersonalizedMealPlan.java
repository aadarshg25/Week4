package com.tit.week04.day01.generics.personalizedmealplangenerator;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        VegetarianMeal vegMeal1 = new VegetarianMeal("Grilled Paneer Salad");
        VegetarianMeal vegMeal2 = new VegetarianMeal("Soup");
        vegetarianMealPlan.addMeal(vegMeal1);
        vegetarianMealPlan.addMeal(vegMeal2);

        Meal<VeganMeal> veganMealPlan = new Meal<>();
        VeganMeal veganMeal1 = new VeganMeal("Tofu Stir-fry");
        VeganMeal veganMeal2 = new VeganMeal("Quinoa Salad");
        veganMealPlan.addMeal(veganMeal1);
        veganMealPlan.addMeal(veganMeal2);

        Meal<KetoMeal> ketoMealPlan = new Meal<>();
        KetoMeal ketoMeal1 = new KetoMeal("Grilled Chicken with Avocado");
        KetoMeal ketoMeal2 = new KetoMeal("Egg and Cheese Omelet");
        ketoMealPlan.addMeal(ketoMeal1);
        ketoMealPlan.addMeal(ketoMeal2);

        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>();
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        highProteinMealPlan.addMeal(highProteinMeal);


        System.out.println("\nVegetarian Meal Plan:");
        Meal.displayMeals(vegetarianMealPlan.getMeals());

        System.out.println("\nVegan Meal Plan:");
        Meal.displayMeals(veganMealPlan.getMeals());

        System.out.println("\nKeto Meal Plan:");
        Meal.displayMeals(ketoMealPlan.getMeals());

        System.out.println("\nHigh Protein Meal Plan:");
        Meal.displayMeals(highProteinMealPlan.getMeals());

        System.out.println("\nValidating Meals:");
        Meal.validateMeal(vegMeal1);
        Meal.validateMeal(veganMeal1);
        Meal.validateMeal(ketoMeal1);
        Meal.validateMeal(highProteinMeal);
    }
}
