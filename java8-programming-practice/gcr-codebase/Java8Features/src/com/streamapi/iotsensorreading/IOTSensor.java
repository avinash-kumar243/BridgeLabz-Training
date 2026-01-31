package com.streamapi.iotsensorreading;

import java.time.LocalTime;

public class IOTSensor {
	private String sensorId;
	private String sensorType;
	private double value;
	private String unit;
	private LocalTime timeStamp;
	
	public IOTSensor(String sensorId, String sensorType, double value, String unit, LocalTime timeStamp) {
		this.sensorId = sensorId;
		this.sensorType = sensorType;
		this.value = value;
		this.unit = unit;
		this.timeStamp = timeStamp;
	}

	public String getSensorId() {
		return sensorId;
	}

	public String getSensorType() {
		return sensorType;
	}

	public double getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}

	public LocalTime getTimeStamp() {
		return timeStamp;
	}

	@Override
	public String toString() {
		return "IOTSensor [sensorId: " + sensorId + ", sensorType: " + sensorType + ", value: " + value + ", unit: " + unit
				+ ", timeStamp: " + timeStamp + "]";
	}
}