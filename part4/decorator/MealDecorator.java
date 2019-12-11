package com.finalExam.part4.decorator;

// The MealDecorator is an aggregate of Meal and will
// add new behaviors.
public abstract class MealDecorator implements Meal{
	
	// This will allow the successive chaining of
	// decorators.
	protected Meal meal;
	
	public MealDecorator(Meal meal) {
		this.meal = meal; 
	}
	
	public String getTotalMeal() {
		return meal.getTotalMeal();
	}
}
