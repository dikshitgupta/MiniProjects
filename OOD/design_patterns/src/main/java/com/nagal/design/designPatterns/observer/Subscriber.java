package com.nagal.design.designPatterns.observer;

public class Subscriber {

	private String name;
	private Channel channel=new Channel();

	public void update(){
		System.out.println("video uploaded");
	}

	public void subscribeChannel(Channel channel){
		this.channel=channel;
	}

	public Subscriber(String name) {
		this.name = name;
	}
}

