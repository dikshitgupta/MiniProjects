package com.nagal.code.Logger;

public class Process {
	String processId;
	private final long startTime;
	private long endTime=-1;

	public Process(String processId, long startTime) {
		this.processId = processId;
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "Process{" +
				"processId='" + processId + '\'' +
				", startTime=" + startTime +
				", endTime=" + endTime +
				'}';
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
}
