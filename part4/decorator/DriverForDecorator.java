package com.finalExam.part4.decorator;
/********************************************************************************************
 * Johnson Wei																				*
 * CS 5800																					*
 * Part IV of the final: Utilizing Design Patterns											*
 * Description: Complete one design pattern from each category.								*				
 * 				(1) Creational - Builder													*
 * 				(2) Structural - Decorator <======											*
 * 				(3) Behavioral - Visitor   													*
 *******************************************************************************************/
public class DriverForDecorator {
	
	// We see that a component (interface) can have behaviors added
	// to it during runtime. The decorator pattern allows us to
	// "chain" objects during instantiation to produce a customized
	// object.
	public static void main(String[] args) {
		System.out.println("****** [Decorator Design Pattern Example] ******");
		
		// totalMealConsumed is a component that we can modify by 
		// chaining the instantiation with decorators. Note: the
		// inner most wrapped object (right most) gets invoked first,
		// then the wrapper gets evaluated, followed by the outermost
		// wrapper. The ordering of the Strings that get printed out 
		// follows a reading from right to left: which explains the
		// console output that is expected: "Breakfast, Lunch, Dinner"
		Meal totalMealsConsumed = new DinnerMeal(new LunchMeal(new BreakfastMeal()));
		System.out.println(totalMealsConsumed.getTotalMeal());
	}
}
