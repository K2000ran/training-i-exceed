import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class demo_File {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demoText.txt");
            writer.write("this is the next line:");
            writer.write("THis the theird line");
            writer.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}