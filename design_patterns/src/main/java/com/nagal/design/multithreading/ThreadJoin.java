package com.nagal.design.multithreading;

public class ThreadJoin {
}

class TestJoinMethod2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){System.out.println(e);}
			System.out.println(i);
		}
	}

	public static void main(String args[]){
		TestJoinMethod2 t1=new TestJoinMethod2();
		TestJoinMethod2 t2=new TestJoinMethod2();
		TestJoinMethod2 t3=new TestJoinMethod2();

		long start=java.time.LocalDateTime.now().getNano();

		t1.start();
		try{
			t1.join(1500);
		}catch(Exception e){System.out.println(e);}

		t2.start();
		t3.start();

		try {
			t2.join(2000);
			t3.join(2000);
		}
		catch(Exception e){System.out.println(e);}

		long end=java.time.LocalDateTime.now().getNano();
		System.out.printf("time taken : %d\n",end-start);


	}
}