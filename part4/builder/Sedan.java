package com.finalExam.part4.builder;

import com.finalExam.part4.visitor.Visitor;

public class Sedan extends Vehicle {
	public Sedan() {
		this.wheels = FOUR_WHEELER;
		this.engineType = "sedan engine";
		this.title = "default sedan title";
		this.color = "silver";
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
