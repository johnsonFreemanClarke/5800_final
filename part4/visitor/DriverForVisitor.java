package com.finalExam.part4.visitor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.finalExam.part4.builder.Motorcycle;
import com.finalExam.part4.builder.Sedan;
import com.finalExam.part4.builder.Truck;
/********************************************************************************************
 * Johnson Wei																				*
 * CS 5800																					*
 * Part IV of the final: Utilizing Design Patterns											*
 * Description: Complete one design pattern from each category.								*				
 * 				(1) Creational - Builder													*
 * 				(2) Structural - Decorator													*
 * 				(3) Behavioral - Visitor   <======											*
 *******************************************************************************************/
public class DriverForVisitor {

	public static void main(String[] args) {
		System.out.println("****** [Visitor Design Pattern Example] ******");
		// Lets assume Disneyland uses this at the end of each business day.
		calculateProfitsFromParkingLot();
		
		// DMV will use this one.
		calculateProfitsFromVehicleRegistration();
	}
	
	public static void calculateProfitsFromParkingLot() {
		// We want the values of type double to represent USD currency
		DecimalFormat moneyFormat = new DecimalFormat("#.##");
		double profitsFromParkingLot = 0;
		double disneyLandParkingFee = 20;
		
		// Lets assume that we have a parking lot that contains a 
		// few vehicles.
		List<Entity> parkingLot = new ArrayList<>();
		
		Sedan myCar = new Sedan();
		
		// We will simulate parked cars by adding a few vehicles into 
		// the parkingLot.
		parkingLot.add(myCar);
		parkingLot.add(new Sedan());
		parkingLot.add(new Motorcycle());
		parkingLot.add(new Truck());
		
		// The parkingFeeVisitor takes in an argument representing the 
		// price admission for parking.
		ParkingFeeVisitor parkingFeeVisitor = new ParkingFeeVisitor(disneyLandParkingFee);
		
		// Lets assume that by the end of the day, right before the 
		// parking lot closes; the automated system calculates the
		// total profits made from parking fees.
		for(int i = 0; i < parkingLot.size(); i++) {
			// The accept method is being polymorphically determined based 
			// on the type of vehicle within the parkingLot.
			profitsFromParkingLot += parkingLot.get(i).accept(parkingFeeVisitor);
		}
		System.out.println("Disneyland parking profits of the day: $" + Double.parseDouble(moneyFormat.format(profitsFromParkingLot)));
	}
	
	public static void calculateProfitsFromVehicleRegistration() {
		double profitsFromRegistration = 0;
		
		// This time we will create a container that holds
		// vehicle registration fee payments.
		List<Entity> dmvPayments = new ArrayList<>();
		
		// Again for simulation purposes, we will add a few registration
		// payments.
		dmvPayments.add(new Sedan());
		dmvPayments.add(new Truck());
		dmvPayments.add(new Motorcycle());
		
		// We instantiate the registrationFeeVisitor in order to calculate
		// the profits earned from vehicle registration fees. This will behave
		// specifically according to how registration fees are calculated.
		RegistrationFeeVisitor registrationFeeVisitor = new RegistrationFeeVisitor();
		
		for(int i = 0; i < dmvPayments.size(); i++) {
			profitsFromRegistration += dmvPayments.get(i).accept(registrationFeeVisitor);
		}
		System.out.println("DMV profits from vehicle registration fees: $" + profitsFromRegistration);
	}
}
