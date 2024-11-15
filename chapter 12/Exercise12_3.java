import java.util.Scanner;
public class Exercise12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	
	int[] array = getArray();
	
	System.out.print("Enter the index of the array: ");
try {	
	System.out.println("The corresponding element value of the Index is " +
		array[input.nextInt()]); 
			
	}

catch (IndexOutOfBoundsException ex) {
		System.out.print("Array out of bounds!");
}
	}
//return an array with 100 integer

public static int[] getArray() {
	int[] array = new int[101];
		for (int i = 1; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	
	
	
	}
}
