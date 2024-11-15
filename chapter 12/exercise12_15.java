import java.util.*;
import java.io.*;
public class exercise12_15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//check if file exists
		File file = new File("Exercise12_15.txt");
			if (file.exists()) {
				System.out.println("File already exist!");
				System.exit(0);
			}
			//create an output file
			try (PrintWriter output =  new PrintWriter(file)){ 
				
				//write 100 integers randomly to file
				for (int i = 0; i < 100; i++) {
					output.print(((int) (Math.random() * 500) + 1));
					output.print(" ");
				}
			}
			//create an array list
			ArrayList<Integer> list = new ArrayList<>();
			//create input file
			try (Scanner input = new Scanner(file)) {
				
					//Read the data back from the file
				while (input.hasNext()) {
					list.add(input.nextInt());
				}
			}	
				//sort array list
			Collections.sort(list);
			
			//display the data in increasing order
			System.out.print(list.toString());
			System.out.println();
		
			
		}
		
	}


