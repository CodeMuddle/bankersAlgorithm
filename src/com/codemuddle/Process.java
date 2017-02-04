package com.codemuddle;

public class Process {
	private int[] allocated = new int[4];
	private int[] max = new int[4];
	public boolean isDone = false;
	
	public Process(int[] allocated,int[] max) {
		// TODO Auto-generated constructor stub
		this.allocated = allocated;
		this.max = max;
	}
	
	public boolean canProcessComplete(int[] resource){
		boolean flag = true;
		int[] resourceNeeded = this.resourceNeeded();
		for(int i=0; i< resource.length;i++){
			if(resource[i]-resourceNeeded[i] < 0){
				flag = false;
			}
		}
		return flag;
	}
	
	public int[] completeProcess(int[] resource){
		this.isDone = true;
		resource[0] += this.allocated[0];
		resource[1] += this.allocated[1];
		resource[2] += this.allocated[2];
		resource[3] += this.allocated[3];
		return resource;
	}
	
	public int[] resourceNeeded(){
		int[] resourceNeeded = new int[4];
		for(int i=0;i<4;i++){
			resourceNeeded[i] = this.max[i]-this.allocated[i];
		}
		return resourceNeeded;
	}
	
	int[] getAllocated(){
		return this.allocated;
	}
	
	int[] getMax(){
		return this.max;
	}
	
}
