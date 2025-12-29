// Parking Lot Gate System 🚗
// Develop a smart parking system.
// ● Options: Park, Exit, Show Occupancy
// ● Use switch-case for the menu.
// ● while loop to continue until the parking lot is full or the user exits.

import java.util.Scanner;
public class ParkingLotGateSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int occupancy = 0;
		System.out.println("----------------------------------------------------------");
		System.out.println("---------------- Parking Lot Gate System -----------------");
		System.out.println("----------------------------------------------------------");
		
		int car = 0, truck = 0, bus = 0;
		
		// Program will run till all places do not occupied
		while(occupancy != 3) {
			System.out.println("\n\n---------------- Choose Options -----------------");
			System.out.println("1 - Park");
			System.out.println("2 - Exit");
			System.out.println("3 - Check occupancy");
			System.out.println("----------------------------------------------------------\n");
			
			int option = sc.nextInt();
			

			switch(option) {
				
				// Choose for what to Park
				case 1 : {
					System.out.println("\n------------- Choose Options for Parking --------------");
					System.out.println("1 - Car Parking");
					System.out.println("2 - Truck Parking");
					System.out.println("3 - Bus Parking");
					System.out.println("----------------------------------------------------------\n");
					
					int choise = sc.nextInt();
					
					switch(choise) {
						case 1 :
							System.out.println("\n--------------- Car has been Parked -------------");
							car++;
							break;
							
						case 2 :
							System.out.println("\n-------------- Truck has been Parked -------------");
							truck++;
							break;
						
						case 3 :
							System.out.println("\n--------------- Bus has been Parked -------------");
							bus++;
							break;
						
						default :
							System.out.println("\n--------------- Invalid Options -------------");						
					}
				}
				occupancy++;
				break;
				
				
				// Choose for what to Exit
				case 2 : {
					System.out.println("\n------------- Choose Options for exit --------------\n");
					System.out.println("1 - Car Exit");
					System.out.println("2 - Truck Exit");
					System.out.println("3 - Bus Exit");
					System.out.println("----------------------------------------------------------\n");
					
					int choise = sc.nextInt();
					
					switch(choise) {
						case 1 :
							if(car == 0) {
								System.out.println("\n\nCar hasn't parked yet");
								System.exit(0);
							}
							System.out.println("\n--------------- Car has been Exit -------------");
							break;
							
						case 2 :
							if(truck == 0) {
								System.out.println("\n\nTruck hasn't parked yet");
								System.exit(0);
							}
							System.out.println("\n-------------- Truck has been Exit -------------");
							break;
						
						case 3 :
							if(bus == 0) {
								System.out.println("\n\nBus hasn't parked yet");
								System.exit(0);
							}
							System.out.println("\n--------------- Bus has been Exit -------------");
							break;
						
						default :
							System.out.println("\n\n--------------- Invalid Options -------------");						
					}
					System.out.println("\n----------------------------------------------------------\n");
				}
				occupancy--;
				break;
				
				
				// Check How many places already occupied
				case 3 : {
					System.out.println("----------------------------------------------------------");
					System.out.println("-------------- Occupied Car - " + car + " ---------------");
					System.out.println("-------------- Occupied Truck - " + truck + " ---------------");
					System.out.println("-------------- Occupied Bus - " + bus + " ---------------");
					System.out.println("----------------------------------------------------------\n");
				}
			}
		}
	}
}