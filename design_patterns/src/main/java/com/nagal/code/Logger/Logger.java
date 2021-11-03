package com.nagal.code.Logger;

public interface Logger {
	/**
	 * When a process starts, it calls 'start' with processId and startTime.
	 */
	void start(String processId);

	/**
	 * When the same process ends, it calls 'end' with processId and endTime.
	 */
	void end(String processId);

	/**
	 * Prints the logs of this system sorted by the start time of processes in the below format
	 * {processId} started at {startTime} and ended at {endTime}
	 */
	void poll();
}
