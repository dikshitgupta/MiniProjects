package com.nagal.design.designPatterns.CreationalDesignPatterns.prototype;

public class Driver {

	MangoTree m1=new MangoTree(100,10);
	MangoTree m2= (MangoTree) m1.copy();
	

}
