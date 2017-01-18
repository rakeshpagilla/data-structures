package com.rakesh.algorithms.greedy;

import java.util.*;

/*Refer Elements of programming Pg 306. Consider assigning tasks to worked. EachWorker must be
assigned two tasks and each task takes fixed amount of time. Tasks are independent. 
5,2,1,6,4,4 - (5+2, 6+1, 4+4) = 8Hrs. The intuition observation is that a longer task should 
be paired with shortest one.
*/
public class PairedTasks {

	public Integer task1;
	public Integer task2;

	public PairedTasks(Integer task1, Integer task2) {
		this.task1 = task1;
		this.task2 = task2;
	}
	
	@Override
	public String toString() {
		return "PairedTasks [task1=" + task1 + ", task2=" + task2 + "]";
	}

	public static List<PairedTasks> optimumTaskAssignment(List<Integer> taskDurations) {
		Collections.sort(taskDurations);
		ArrayList<PairedTasks> toReturn = new ArrayList<PairedTasks>();

		for (int i = 0, j = taskDurations.size() - 1; i < j; i++, j--) {
			System.out.println(i + " " + j);
			toReturn.add(new PairedTasks(taskDurations.get(i), taskDurations.get(j)));
		}
		return toReturn;
	}

	public static void main(String[] a) {
		Integer[] array = { 5, 2, 1, 6, 4, 4 };
		List<PairedTasks> data = optimumTaskAssignment(Arrays.asList(array));
		for (PairedTasks pt : data) {
			System.out.println(pt.toString());
		}
	}
}
