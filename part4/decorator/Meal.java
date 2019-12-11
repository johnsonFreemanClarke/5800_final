package com.finalExam.part4.decorator;

// The Meal interface will serve as the common interface
// for wrappers and wrapped objects. The Meal will have
// behaviors added to it at runtime via decorators.
// Let's assume that this interface will work with a 
// program that allows a client to keep track of what
// he/she ate throughout the day.
public interface Meal {
	String getTotalMeal();
}
