import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class empolyee implements Serializable{
    String e_name,e_dept;
    int salary;
    empolyee(String e_name,String e_dept,int salary){
        this.e_name=e_name;
        this.e_dept=e_dept;
        this.salary=salary;

    }
}
//converting object into bytestream
public class demoObjectSerlizable  {
    public static void main(String [] args)throws Exception{
        empolyee e1=new empolyee("kiran","cse" , 10000);
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("sample1.txt"));
        os.writeObject(e1);

        ObjectInputStream io=new ObjectInputStream(new FileInputStream("sample1.txt"));
        empolyee e=(empolyee)io.readObject();
        System.out.println("the name is :"+e.e_name);
        System.out.println("the dept is :"+e.e_dept);
        System.out.println("the salary is :"+e.salary);
    }
}
