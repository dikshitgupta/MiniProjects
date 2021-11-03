package com.nagal.design.multithreading;

import java.util.Timer;

class MyThread1 extends Thread{
	@Override
	public void run() {
		int a=500;
		while (a--!=0)
			System.out.println("thread 1 running");
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {

		for(int i=0;i<10;i++){

		}
	}
}



public class ThreadClass {
	public static void main(String[] args) {
	MyThread2 t1=new MyThread2();
	MyThread2 t2=new MyThread2();

	t1.setPriority(1);
	t2.setPriority(10);

	t1.start();
	t2.start();

	long start=java.time.LocalDateTime.now().getSecond();
	long end=java.time.LocalDateTime.now().getSecond();
	System.out.printf("time taken : %d\n",end-start);

	}
}

