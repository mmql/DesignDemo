package com.example.designdemo.builder;

public class MealBuilder {
    public Meal breakfast() {
        Meal meal = new Meal();
        meal.addItem(new Egg());
        meal.addItem(new Milk());
        return meal;
    }

    public Meal lunch() {
        Meal meal = new Meal();
        meal.addItem(new Rice());
        meal.addItem(new Coffee());
        return meal;
    }
}
