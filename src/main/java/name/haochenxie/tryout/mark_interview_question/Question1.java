package name.haochenxie.tryout.mark_interview_question;

import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		
	}
	
	// TODO: not implemented
	public static Point getBottomLeft(List<Point> points) {
		return null;
	}
	
	// TODO: not implemented
	public static Point getTopRight(List<Point> points) {
		return null;
	}

}

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}