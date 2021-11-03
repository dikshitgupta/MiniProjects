package com.nagal.design.designPatterns.CreationalDesignPatterns.builder;

public class driver {

	public static void main(String[] args) {

		PhoneBuilder p = new PhoneBuilder();
		p.setBattery(45);
		p.setOs("IOS");
		p.setRam(6);
		System.out.println(p.getPhone());


		Phone q=new Phone();
		q.setBattery(34);
		q.setOs("Android");
		q.setRam(6);
		System.out.println(q);

	}
}
