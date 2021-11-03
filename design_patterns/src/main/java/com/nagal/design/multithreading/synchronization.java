package com.nagal.design.multithreading;

public class synchronization {
}

class Calculator extends Thread{

	long sum;

	public void run(){
		synchronized (this){
			for(int i=0;i<100000;i++){
				sum+=i;
			}
//			notify();
		}
	}
}

class waitandNotify{
	public static void main(String[] args) {

		Calculator thread1=new Calculator();
		thread1.start();

				synchronized (thread1){
			try{
				// thread will wait until it is notified.
			thread1.wait();
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}

//		try {thread1.join();}
//		catch (Exception e){
//			System.out.println(e);
//		}

		System.out.println(thread1.sum);

	}
}
