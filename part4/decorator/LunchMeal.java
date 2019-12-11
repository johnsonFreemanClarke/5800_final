package com.finalExam.part4.decorator;

// The subclass of the MealDecorator are considered
// concrete decorators. This LunchMeal specifically 
// adds onto a pre-existing string (new behavior)
// from a previous call.
public class LunchMeal extends MealDecorator {

	public LunchMeal(Meal meal) {
		super(meal);
	}
	
	public String getTotalMeal() {
		return meal.getTotalMeal() + "Lunch, ";
	}
}
