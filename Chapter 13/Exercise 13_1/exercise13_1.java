import java.util.Scanner;
public class exercise13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
// prompt the user to enter 3 triangle side value and a boolean value to indicate
// that the triangle is filled as well as a color.
		
		System.out.print("Enter three sides for the triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
		
		//enter a color
		System.out.print("Enter a color: ");
			String color = input.next();
		
		//enter whether triangle is filled or not
		System.out.print("Enter whether the triangle is filled (true or false): ");
			boolean filled = input.nextBoolean();
			
		//create a triangle
			Triangle triangle = new Triangle(side1, side2, side3, color, filled);
			
				System.out.println(triangle);
	}

}
