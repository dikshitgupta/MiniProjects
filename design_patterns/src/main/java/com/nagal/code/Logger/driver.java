package com.nagal.code.Logger;

import java.util.concurrent.TimeUnit;

public class driver {
	public void Psleep(int t){
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch (InterruptedException e){
			System.out.println("process interrupted");
		}
	}

	public static void main(String[] args) {
		driver d= new driver();
		final LoggerImplementation logger=new LoggerImplementation();

		logger.start("1");
		d.Psleep(1);
		logger.poll();
		logger.start("2");
		logger.poll();
		d.Psleep(1);
		logger.end("2");
		d.Psleep(1);
		logger.poll();
		logger.start("3");
		d.Psleep(1);
		logger.poll();
		logger.end("1");
		d.Psleep(1);
		logger.poll();
		logger.end("3");
		logger.poll();
		logger.poll();

	}
}
/*
log.start("1", 100);
log.start("2", 101);
log.end("2", 102);
log.start("3", 103);
log.end("1", 104);
log.end("3", 105);
log.print();

Output:
1 started at 100 and ended at 104
2 started at 101 and ended at 102
3 started at 103 and ended at 105
 */