package com.streamapi.iotsensorreading;

import java.time.LocalTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<IOTSensor> sensorReadings = List.of(new IOTSensor("101", "Temperature", 35.5, "C", LocalTime.now()),
											     new IOTSensor("102", "Humidity", 50.5, "%", LocalTime.now()),
											     new IOTSensor("103", "Temperature", 28.2, "C", LocalTime.now()),
											     new IOTSensor("104", "Temperature", 26.8, "C", LocalTime.now()),
											     new IOTSensor("105", "Pressure", 105.5, "kPa", LocalTime.now()),
											     new IOTSensor("106", "Humidity", 78.4, "%", LocalTime.now()),
											     new IOTSensor("105", "Pressure", 125.2, "kPa", LocalTime.now()));
		
		double temperatureThreshold = 30;
		double humidityThreshold = 60;
		double pressureThreshold = 110;
		
//		sensorReadings.stream()
//					  .filter(reading -> {
//						  if(reading.getSensorType().equalsIgnoreCase("Temperature")) reading.getValue() > temperatureThreshold)
//					  })
//					  .forEach(reading -> System.out.println(reading));
		
		sensorReadings.stream()
						.filter(IOTSensor-> IOTSensor.getSensorType().equalsIgnoreCase("Humidity"))
						.filter(IOTSensor-> IOTSensor.getValue()>humidityThreshold)
						.forEach(System.out::println);
		
		sensorReadings.stream()
					  .filter(IOTSensor-> IOTSensor.getSensorType().equalsIgnoreCase("Temperature"))
					  .filter(IOTSensor-> IOTSensor.getValue()>temperatureThreshold)
					  .forEach(System.out::println);

		sensorReadings.stream()
		.filter(IOTSensor-> IOTSensor.getSensorType().equalsIgnoreCase("Pressure"))
		.filter(IOTSensor-> IOTSensor.getValue()>pressureThreshold)
		.forEach(System.out::println);

	}
}