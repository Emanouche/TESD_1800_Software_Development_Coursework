package exercise17_15;

import java.io.*;
import java.util.Scanner;

public class Exercise17_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter encripted file): ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter decripted file name: ");
        String outputFileName = scanner.nextLine();

        try (InputStream inputStream = new FileInputStream(inputFileName);
             OutputStream outputStream = new FileOutputStream(outputFileName)) {

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData - 5);
            }

            System.out.println("File decrypted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}