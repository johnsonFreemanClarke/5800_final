package com.finalExam.part4.builder;

import com.finalExam.part4.visitor.Visitor;

public class Truck extends Vehicle {
	public Truck() {
		this.wheels = FOUR_WHEELER;
		this.engineType = "truck engine";
		this.title = "default truck title";
		this.color = "silver";
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
