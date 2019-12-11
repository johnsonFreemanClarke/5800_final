package com.finalExam.part4.builder;

import com.finalExam.part4.visitor.Entity;
import com.finalExam.part4.visitor.Visitor;

public abstract class Vehicle implements Entity{
	public static int TWO_WHEELER = 2;
	public static int THREE_WHEELER = 3;
	public static int FOUR_WHEELER = 4;
	
	protected int wheels;
	protected String engineType;
	protected String title; // corresponds to the what the car is used for
	protected String color;
	
	public void setEngine(String newEngineType) {
		this.engineType = newEngineType;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String toString() {
		return "{Engine: " + engineType + " , Title: " + title + " , Color: " + color + "}";
	}
	
	// This method adheres to the Entity interface and will be fully implemented
	// in the vehicle subclasses.
	public abstract double accept(Visitor visitor);
}
