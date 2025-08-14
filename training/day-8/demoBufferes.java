import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demoBufferes {
    public static void main(String [] args) throws IOException{
        System.out.println("Enter the file name without extension: ");
        Scanner sc=new Scanner(System.in);
        String  fileName=sc.nextLine();
        String fullPath = "C:\\Users\\kiran.mahato\\Desktop\\training\\" + fileName + ".txt";

        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(fullPath));
        System.out.println("enter the content: ");
        String s=sc.nextLine();
        byte byts[]=s.getBytes();
        bo.write(byts);
        bo.close();

        BufferedInputStream bi=new BufferedInputStream(new FileInputStream(fullPath));
        int i=0;
        while((i=bi.read())!=-1){
            System.out.print((char)i);
            
        }
        bi.close();
        sc.close();


    }
}
