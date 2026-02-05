package com.multithreading.problems.restaurantorderprocessingsystem;

public class Chef implements Runnable {
	private String name;
	private String dishName;
	private int preparationTime;
	
	public Chef(String name, String dishName, int preparationTime) {
		this.name = name;
		this.dishName = dishName;
		this.preparationTime = preparationTime;
	}
	
	public String getName() {
		return name;
	}
	public String getDishName() {
		return dishName;
	}
	public int getPreparationTime() {
		return preparationTime;
	}


	@Override
	public void run() {
		System.out.println("Chef: " + name + " has started preparing [" + dishName + "]");
		
		try {
			Thread.sleep(1000);
			for(int i=0; i<=100; i+=25) {
				Thread.sleep(preparationTime / 4);
				System.out.println("Chef: " + name + " progress: " + i + "%");
			}
			
			System.out.println("Order completed");
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		
	}
}