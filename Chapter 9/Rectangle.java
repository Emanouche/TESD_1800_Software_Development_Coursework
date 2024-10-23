
public class Rectangle {
	double width = 1;
	double height = 1;
	
	//Default constructor
	Rectangle(){
		
	}
	//constructor that is a certain width and height
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	
	}
		
	//Calculate area
	public double getArea(){
		return width * height;
	
	}
	
	//calculate Perimeter
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
