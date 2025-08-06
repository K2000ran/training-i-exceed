class student{
    String name,dept;
    int age;
    bank b;
    address ad;
    student(String name,String dept,int age,bank b,address ad){
        this.name=name;
        this.dept=dept;
        this.age=age;
        this.b=b; 
        this.ad=ad;
    }
    public void displayStudent(){
        System.out.println("the name of stu : "+ name);
        System.out.println("the name of dept : "+ dept);
        System.out.println("the name of age   : "+ age);
        b.displaybankDetails();
        ad.displayAddress();


    }

}

public class demoStudent {
    public static void main(String[] args){
        bank ba=new bank("SBI","kerala",420123112);
        bank ab=new bank("NIB","janakpur",22202333);
        phone p=new phone("Samsung",4,"XXMOD");
        address ad=new address("Nepal","janakpur",45600,p);
        student s1=new student("kiran", "csr  ", 25,ba,ad);
        s1.displayStudent();
        System.out.println();
        student s2=new student("Nabin","EE" , 22, ab,ad);
        s2.displayStudent();
        System.out.println("the bank accout od s2 is :"+ab.bankNumber);
        System.out.println(p.phoneCompany);

    }
}
