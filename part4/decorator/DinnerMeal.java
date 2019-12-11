package com.finalExam.part4.decorator;

// In this example, we will have DinnerMeal as the
// outermost class (see DriverForDecorator.java)
// in the instantiation process of Meal.
public class DinnerMeal extends MealDecorator {

	public DinnerMeal(Meal meal) {
		super(meal);
	}

	public String getTotalMeal() {
		return meal.getTotalMeal() + "Dinner";
	}
}
