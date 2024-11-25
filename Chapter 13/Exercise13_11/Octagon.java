
public class Octagon extends GeometricObject
		implements Cloneable, Comparable<Octagon> {
	private double side;
	
	//default constructor
	public Octagon() {
		
	}

	//construct Octagon of a specified side
	public Octagon(double side) {
		this.side = side;
	}
	 //set a new specified side
	public void setSide(double side) {
		this.side = side;
				
	}
	
	//return side
	public double getside() {
		return side;
		
	}
	
	//return area of octagon
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side; 
	}
	//return the area of this octagon
	@Override
	public double getPerimeter() {
		return 8 * side;
		
	}
	
	//implement compareTo method
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
		
		}
	
	//override the protected clone in method defined
	//in the Object class, and strengthen its accessiblity
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	
	}

	//return a String descripton of this Octagon object
	public String toString() {
		return super.toString() + "\nArea: " + getArea() +
				"\nPerimeter: " +getPerimeter();
	}
	
	
	
}
