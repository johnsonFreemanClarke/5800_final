package com.finalExam.part4.builder;

import com.finalExam.part4.visitor.Visitor;

public class Motorcycle extends Vehicle {
	public Motorcycle() {
		this.wheels = TWO_WHEELER;
		this.engineType = "motorcycle engine";
		this.title = "default motorcycle title";
		this.color = "silver"; // for simplicity, all vehicles are silver by default
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
