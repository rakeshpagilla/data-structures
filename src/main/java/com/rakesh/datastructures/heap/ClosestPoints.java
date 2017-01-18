package com.rakesh.datastructures.heap;
import java.util.ArrayList;
//Find the K closest points to the origin in 2D plane, given an array containing N points. 
//You can assume K is much smaller than N and N is very large.
import java.util.Collection;
import java.util.PriorityQueue;
//http://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/ . 
//Another form of the same problem.
public class ClosestPoints {
	public static void main(String[] args) {
        Collection<Point> points = new ArrayList<Point>();
        Point origin = new Point(0, 0);
        points.add(new Point(1, 1, origin));
        points.add(new Point(1, 3, origin));
        points.add(new Point(-1, 1, origin));
        points.add(new Point(-1, 3, origin));
        points.add(new Point(1, -1, origin));
        points.add(new Point(3, -1, origin));
        points.add(new Point(-1, -1, origin));
        points.add(new Point(-1, 3, origin));
        points.add(new Point(2, 2, origin));

        Collection<Point> closestPoints = new ClosestPoints().getClosestPoints(points, 8);
        System.out.print(closestPoints);
	}

    public Collection<Point> getClosestPoints(Collection<Point> points, int k) {
    	
    	PriorityQueue<Point> result = new PriorityQueue<Point>();
    	for(Point p : points){
    		if(result.size() < k){
    			result.offer(p);
    		}else if(result.peek().dist < p.dist){
    			result.poll();
    			result.offer(p);
    		}
    	}
    	return result;
    }
}

class Point implements Comparable<Point> {
	
	int x, y;
    double dist;

    public Point(int x, int y, Point originPoint) {
        this.x = x;
        this.y = y;
        this.dist = Math.hypot(x-originPoint.x, y-originPoint.y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "x: " + x + " y: " + y + " dist: " + dist;
    }
    
    public int compareTo(Point o){
    	return Double.valueOf(o.dist).compareTo(this.dist);
    }
}
