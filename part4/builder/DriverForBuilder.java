package com.finalExam.part4.builder;
/********************************************************************************************
 * Johnson Wei																				*
 * CS 5800																					*
 * Part IV of the final: Utilizing Design Patterns											*
 * Description: Complete one design pattern from each category.								*				
 * 				(1) Creational - Builder   <======											*
 * 				(2) Structural - Decorator													*
 * 				(3) Behavioral - Visitor													*
 *******************************************************************************************/
public class DriverForBuilder {
	
	public static void main(String[] args) {
		demonstrateBuilder();
	}
	
	// This method will go through the Builder Design Pattern
	public static void demonstrateBuilder() {
		System.out.println("****** [Beginning of Builder Design Pattern Example] ******");
		// The client never calls VehicleBuilder directly, instead		
		// the client interacts with the director and it is the
		// director that initializes the construction process of a vehicle
		Director director = new Director();
		
		// The Sedan object gets built using the Director as a liaison
		// with the VehicleBuilder.
		Sedan myFamilyCar = director.makeFamilySedan();
		
		// Printing the representation of the sedan object to the console.
		System.out.println(myFamilyCar.toString());
		
		// The director initializes the task of building a Truck too.
		Truck myOffRoadTruck = director.makeOffRoadTruck();
		
		// Printing the specs of myOffRoadTruck to console.
		System.out.println(myOffRoadTruck.toString());
		
		// Similarly, we can create a Motorcycle object in the same way.
		Motorcycle myMotocrossBike = director.makeMotocrossBike();
		System.out.println(myMotocrossBike.toString());
		System.out.println("****** [End of Builder Design Pattern Example] ******");
	}
}