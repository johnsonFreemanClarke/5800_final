package com.finalExam.part4.decorator;

// Since a breakfast is the base meal that we all 
// start with for the day, it serves as a concrete
// component. This is the most inner class that 
// will allow us to stop the cascading process of
// adding decorators to the instantiation process.
public class BreakfastMeal implements Meal {

	public String getTotalMeal() {
		return "Breakfast, ";
	}
}
