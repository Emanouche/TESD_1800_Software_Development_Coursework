package Ex17_7;

import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"))) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        } catch (IOException ex) {
            System.out.println("File could not be opened");
        }

        outputData("Exercise17_07.dat");
    }

    public static void outputData(String filename) {
        double totalLoanAmount = 0.0;

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    Loan loan = (Loan) input.readObject();
                    totalLoanAmount += loan.getLoanAmount();
                } catch (EOFException ex) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("The total loan amount is: " + totalLoanAmount);
    }
}
