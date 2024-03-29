package telran.points.test;

import java.util.function.Predicate;
import telran.points.Point;

public class XyEqualsPredicate implements Predicate<Point> {

	@Override
	public boolean test(Point t) {
	
		return t.getX() == t.getY();
	}

}
