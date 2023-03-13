package com.example.designdemo.builder;

public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal breakfast = mealBuilder.breakfast();
        System.out.println("Breakfast");
        breakfast.showItems();
        System.out.println("Total Cost: " + breakfast.getCost());

        Meal lunch = mealBuilder.lunch();
        System.out.println("Lunch");
        lunch.showItems();
        System.out.println("Total Cost: " + lunch.getCost());
    }
}
