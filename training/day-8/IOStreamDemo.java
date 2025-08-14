import java.io.*;

public class IOStreamDemo {
    public static void main(String[] args) {
        String byteFile = "byteData.txt";
        String charFile = "charData.txt";
        String line;

        // 1. Byte Stream: FileOutputStream and FileInputStream
        try {
            // Writing bytes
            FileOutputStream fos = new FileOutputStream(byteFile);
            String data = "Hello Byte Stream!";
            fos.write(data.getBytes());
            fos.close();

            // Reading bytes
            FileInputStream fis = new FileInputStream(byteFile);
            int b;
            System.out.print("Byte Stream Read: ");
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Character Stream: FileWriter and FileReader
        try {
            // Writing characters
            FileWriter fw = new FileWriter(charFile);
            fw.write("Hello Character Stream!");
            fw.close();

            // Reading characters
            FileReader fr = new FileReader(charFile);
            int c;
            System.out.print("Character Stream Read: ");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. BufferedReader and BufferedWriter
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("Buffered Writer Example");
            bw.newLine();
            bw.write("Second Line");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
            
            System.out.println("Buffered Reader Output:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. InputStreamReader (Console Input)
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader consoleReader = new BufferedReader(isr);
            System.out.print("Enter something: ");
            String userInput = consoleReader.readLine();
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. PrintWriter (Formatted Output)
        try {
            PrintWriter pw = new PrintWriter("printWriter.txt");
            pw.println("PrintWriter Example");
            pw.printf("Formatted number: %.2f%n", 123.456);
            pw.close();

            BufferedReader br = new BufferedReader(new FileReader("printWriter.txt"));
            System.out.println("PrintWriter File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
