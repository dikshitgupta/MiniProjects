package com.nagal.design.designPatterns.CreationalDesignPatterns.builder;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class Phone {
	private String os;
	private int ram;
	private String processor;

	public Phone() {
	}

	private double screenSize;
	private int battery;

	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"os='" + os + '\'' +
				", ram=" + ram +
				", processor='" + processor + '\'' +
				", screenSize=" + screenSize +
				", battery=" + battery +
				'}';
	}
}
