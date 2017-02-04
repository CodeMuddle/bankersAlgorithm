package com.codemuddle.main;

import java.util.Date;
import com.codemuddle.Process;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create resources
		int[] totalResource = new int[]{3,0,1,2};
		// create processes and add to map
		Process[] processes = new Process[3];
		// question for creating objects with curly bracket at end?
		Process p0 = new Process(new int[]{1,2,2,1},new int[]{3,3,2,2}) {};
		Process p1 = new Process( new int[]{1,1,3,3},new int[]{1,2,3,4} ){};
		Process p2 = new Process(new int[]{1,2,1,0},new int[]{1,3,5,0}) {};
		processes[0] = p0;
		processes[1] = p1;
		processes[2] = p2;
		boolean flag = true;
		boolean allProcessCompleted = true;
		int timeStart = (int) new Date().getTime();
		while(flag==true){
			flag = false;
			allProcessCompleted = true;
			for(Process r : processes){
				if(!r.isDone){
					if(r.canProcessComplete(totalResource)){
						flag = true;
						totalResource = r.completeProcess(totalResource);
					} else{
						allProcessCompleted = false;
					}
				}	
			}
		}
		if(allProcessCompleted){
			System.out.println("All process completed [" + totalResource[0]+","+ totalResource[1]+","+ totalResource[2]+","+ totalResource[3]+"]");
		} else{
			System.out.println("System is in deadlock");
		}
		int timeEnd = (int) new Date().getTime();
		System.out.println(timeEnd-timeStart);

	}

}
