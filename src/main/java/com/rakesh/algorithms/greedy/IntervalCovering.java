package com.rakesh.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Consider foreman responsible for number of tasks in a factory. Each task starts at fixed
time and ends at a fixed time. The foreman wants to visit and check on tasks. Your job is to
minimize the visits he makes. In each visit he can check on all tasks at the time of visit. 
Visit takes place at fixed time and he can tasks taking place at exactly that time.
*/
public class IntervalCovering {

	class Interval{
		
		private Integer startTime;
		
		private Integer endTime;
		
		/**
		 * @return the startTime
		 */
		public Integer getStartTime() {
			return startTime;
		}

		/**
		 * @param startTime the startTime to set
		 */
		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		/**
		 * @return the endTime
		 */
		public Integer getEndTime() {
			return endTime;
		}

		/**
		 * @param endTime the endTime to set
		 */
		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}
	}
	
	public static List<Integer> findMinimumVisits(List<Interval> intervals){
		
		if(intervals.isEmpty())
			return Collections.emptyList();
		
		Collections.sort(intervals, new Comparator<Interval>(){
			
			@Override
			public int compare(Interval i1, Interval i2){
				return Integer.compare(i1.getEndTime(), i2.getEndTime());
			}
		});
		
		List<Integer> toReturn = new ArrayList<Integer>();
		Integer lastVisit = intervals.get(0).getEndTime();
		toReturn.add(lastVisit);
		
		for(Interval interval: intervals){
			if(interval.getStartTime() > lastVisit){
				lastVisit = interval.getEndTime();
				toReturn.add(lastVisit);
			}
		}
		
		return toReturn;
		
	}
}
