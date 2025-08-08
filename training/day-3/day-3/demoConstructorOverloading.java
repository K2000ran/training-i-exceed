class library{
     String bookName;
     String author;
     int price;
    library(){
        System.out.println("this is the defaukt construcor");
        bookName="Unknown";
        author="unknown";
        price=0;
    
    }
    library(String bookName,String author,int price){
        this.bookName=bookName;
        this.author=author;
        this.price=price;
        
    }
    public void display_detail(){
        System.out.println("the bookName : "+ bookName);
        System.out.println("the author of book is : "+author);
        System.out.println("the price of book is : "+price);
    }
}
public class demoConstructorOverloading {
    public static void main(String[] args){
        library l1=new library();
      l1.display_detail();
       library l2=new library("sweetDream","kiran",500);
       l2.display_detail();
    }
}
