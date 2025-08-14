import java.io.FileReader;
import java.io.File;

public class demoStrem {
    public static void main(String[] args)throws Exception{
        int i=0;
        File f=new File(args[0]);
        FileReader fo= new FileReader(f);
        while((i=fo.read())!=-1){
            System.out.print((char)i);
        }


    }
}
