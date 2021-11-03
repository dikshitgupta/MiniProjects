package com.nagal.design.designPatterns.CreationalDesignPatterns.singleton;

public class Client {
	public void main(){

		AirforceOne airforceOne=AirforceOne.getAirForceOne();
		airforceOne.fly();

	}
}
