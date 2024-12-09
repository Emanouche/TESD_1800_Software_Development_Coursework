package Ex17_3;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class exercise17_3 {
    public static void main(String[] args) {
        writeRandomIntegers("Exercise17_03.dat");
        int sum = readAndSumIntegers("Exercise17_03.dat");
        System.out.println("The sum of integers in the file is: " + sum);
    }

    public static void writeRandomIntegers(String filename) {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(filename, true))) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomInt = random.nextInt();
                output.writeInt(randomInt);
                output.writeChar(' '); // Separating integers by a space
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int readAndSumIntegers(String filename) {
        int sum = 0;
        try (DataInputStream input = new DataInputStream(new FileInputStream(filename))) {
            while (input.available() > 0) {
                int number = input.readInt();
                input.readChar(); // Read and discard the space character
                sum += number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
