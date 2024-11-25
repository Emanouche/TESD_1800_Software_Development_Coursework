
public class Test13_7 {
	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[5];
		
		objects[0] = new Triangle(3.0, 4.0, 5.0, "red", true); // Filled
		objects[1] = new Triangle(5.0, 12.0, 13.0, "Blue", false); // Not filled
		objects[2] = new Triangle(6.0, 8.0, 10.0, "Green", true); // Filled
		objects[3] = new Triangle(7.0, 24.0, 25.0, "Yellow", false); // Not filled
		objects[4] = new Triangle(9.0, 12.0, 15.0, "Purple", true); // Filled
		
			for (GeometricObject obj : objects) {
				System.out.println("Triangle details:");
				System.out.println(obj);
				System.out.println("Area: " + obj.getArea());
					if (obj instanceof Colorable) {
						((Colorable) obj).howToColor();
					}
				System.out.println();
			}
		
		
		
	}
}
