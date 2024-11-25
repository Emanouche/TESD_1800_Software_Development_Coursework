
public class exercise13_11 {

		public static void main(String[] args) throws CloneNotSupportedException {
			
			//create an Octagon Object
			Octagon octagon1 = new Octagon(5);
			
			//display area and perimeter of object
			
			System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
					"\nPerimeter: " + octagon1.getPerimeter());
			
			// create new object using the clone method
			
			System.out.println("Cloning Octagon...");
			Octagon octagon2 = (Octagon)octagon1.clone();
			
			//compare the two objects usng compareTo method
			int result = (octagon1.compareTo(octagon2));
			if (result == 1)
				System.out.println("Octagon is greater than its clone");
				else if (result == -1)
					System.out.println("Octagon is less than its clone");
				else
					System.out.println("Octagon is equal to its clone");
			
		}
}
