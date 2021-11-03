package com.nagal.code.Logger;

import java.util.*;

/*

start     end     poll
TreeMap
O(logn)  0(logn)  O(1)
Hashmap
O(1) O(1) O(n)

Heap
o(logn) O(n)   O(1)
 LInkedlist
O(1)  O(n) o(n)
*/
//  map processId startTime
//  TreeMap startTime, Processes

public class LoggerImplementation implements Logger{

	private final TreeMap<Long,Process> queue;     // map time to process and it is stored in sorted order.
	private final Map<String,Process> processes;   // map processid to process

	public LoggerImplementation() {
		this.processes= new HashMap<>();
		this.queue= new TreeMap<>( Comparator.comparingLong(startTime -> startTime));
	}

	@Override
	public void start(String processId) {
		long startTime=System.currentTimeMillis();
		Process process= new Process(processId,startTime);
		processes.put(processId,process);
		queue.put(startTime,process);
	}

	@Override
	public void end(String processId) {
		long endTime=System.currentTimeMillis();
		processes.get(processId).setEndTime(endTime);
	}

	@Override
	public void poll() {
//		final Process process=queue.firstEntry().getValue();
//		System.out.println(process);
		if(!queue.isEmpty() && queue.firstEntry().getValue().getEndTime()!=-1){
			while(!queue.isEmpty() && queue.firstEntry().getValue().getEndTime()!=-1) {
				final Process process=queue.firstEntry().getValue();
				System.out.printf("process %s started at %d ended at %d  total time taken in seconds %d \n", process.getProcessId(), process.getStartTime(), process.getEndTime(), (process.getEndTime() - process.getStartTime()) / 1000);
				processes.remove(process.getProcessId());
				queue.pollFirstEntry();
			}
		}
		else{
			System.out.println("No completed tasks in queue: " + queue.size());
		}
	}

}
