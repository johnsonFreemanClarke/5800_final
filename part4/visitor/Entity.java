package com.finalExam.part4.visitor;

// In the class textbook for Design Patterns, the naming 
// convention that they utilize for this interface is 
// Element. We will deviate from the norm by using Entity 
// instead.
public interface Entity {
	double accept(Visitor visitor);
}
