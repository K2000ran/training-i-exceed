import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class demoCre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask user for the filename
            System.out.print("Enter the name of the file (without extension): ");
            String fileName = sc.nextLine();

            // Define full path (you can change the directory as needed)
            String filePath = "C:\\Users\\kiran.mahato\\Desktop\\training\\" + fileName + ".txt";
            File f = new File(filePath);

            // Create the file
            if (f.createNewFile()) {
                System.out.println("File Created: " + f.getName());
                System.out.println("File Path: " + f.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

            // Ask user for content to write
            System.out.println("Enter text to write into the file:");
            String userInput = sc.nextLine();

            // Write to the file
            FileWriter writer = new FileWriter(f);
            writer.write(userInput);
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
