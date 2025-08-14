import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.File;

class demoBoS {
    public static void main(String asd[]) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        bos.writeBytes("this is the sample string to be embed into multiple source".getBytes());

        FileOutputStream fous1 = new FileOutputStream(("barray1.txt"));
        FileOutputStream fous2 = new FileOutputStream(("barray2.txt"));
        bos.writeTo(fous1);
        bos.writeTo(fous2);

    }
}
