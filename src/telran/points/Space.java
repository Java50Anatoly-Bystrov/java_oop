package telran.points;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Space {
	private Point[]points;
	public void addpoint(Point point) {
		points = Arrays.copyOf(points,points.length +1);
		points[points.length-1]= point;
	}
	public Point[] getAllPoints(Comparator<Point> comp) {
		Point [] res  = Arrays.copyOf(points,points.length);
		Arrays.sort(res,comp);
		return res;
	}
	public Point[] getPointsByPredicat(Predicate<Point>predicate,Comparator<Point>comp){
		 Point [] res = new Point[points.length];
		 int index = 0;
		 for(int i = 0; i<points.length; i++) {
			 if(predicate.test(this.points[i])) {
				 res[index++]= points[i];
			 }
		 }
		 res = Arrays.copyOf(res, index);
		 Arrays.sort(res,comp);
		 return res; 
	}
	public boolean removePointsByPredicate(Predicate <Point> predicate) {
		int oldsize = points.length;
		Point[]tmp = new Point[oldsize];
		int index = 0;
		for(int i = 0 ; i< oldsize; i++) {
			if(!predicate.test(this.points[i])){
				tmp[index++]= points[i];
			}
		}
		points = Arrays.copyOf(tmp, index);
		return oldsize > points.length;
	}

	public Space(Point[] points) {
		super();
		this.points = Arrays.copyOf(points, points.length);
	}
	
}
