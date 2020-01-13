package Starter.Main;

import java.util.ArrayList;

import Starter.Vehicle.Vehicle;

public class Program {

	public static void main(String[] args) {
		System.out.printf("Vehicle Count = %d\n\n", Vehicle.getCount());
		
		ArrayList <Vehicle> vehicles = new ArrayList<>();
		
		for ( int i = 0; i < 8; i++ ) {
			vehicles.add(new Vehicle(i + 10, i % 3 + 1));
		}
		
		for ( int j = 0; j < vehicles.size(); j++ ) {
			Vehicle v = vehicles.get(j);
			if ( j % 2 == 0 ) {
				v.accelerate(5);
			}
			else v.brake(5);
		}
		
		for (int i = 0; i <vehicles.size(); i++) {
			System.out.println(vehicles.get(i).getDetails());
		}
		
		System.out.printf("Vehicle Count = %d\n\n", Vehicle.getCount());
	}

}
