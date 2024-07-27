package handle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_not_founf {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "example.txt";
        
        try {
            // Create a Scanner object to read the file
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Read and print the contents of the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("Error: The file " + filePath + " does not exist.");
        }
    }
}

