public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// construct default geometric object
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	// construct a geometric object with color and filled values
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//return color
	public String getColor() {
		return color;
	}
	
	//set a new color
	public void setColor(String color) {	
		this.color = color;
	}
	
	//return filled. Filled is boolean, get method is named isFilled
	public boolean isFilled() {
		return filled;
	}
	
	//Set new filled
	public void setFilled(boolean filled) {
		this.filled = filled;
		
	}
	
	//get dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
		
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	//Abstract method getArea
	public abstract double getArea();
	
	//Abstract method getPerimeter
	public abstract double getPerimeter();
	
	}
