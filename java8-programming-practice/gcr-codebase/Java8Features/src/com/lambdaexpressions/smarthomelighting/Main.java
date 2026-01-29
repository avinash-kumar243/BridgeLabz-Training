package com.lambdaexpressions.smarthomelighting;

public class Main {
	public static void main(String[] args) {
		LightController light = new LightController();
		
		
		// Motion detected behavior
		LightBehavior motion = () -> System.out.println("Turn on the light");
		
		// Night time behavior
		LightBehavior night = () -> System.out.println("Turn off the light");
		
		// voice command behavior
		LightBehavior voiceCommand = () -> System.out.println("Changing light color");
		
		
		// Trigger behavior dynamically
		light.perform(motion);
		light.perform(night);
		light.perform(voiceCommand);
	}
}