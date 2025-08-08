class Book{
private String BookName;
private  int bookPrice;
Book(String BookName, int bookPrice){
    this.BookName=BookName;
    this.bookPrice=bookPrice;

}
public String getDetail(){
    String bookName=BookName;
    int bookprice=bookPrice;
    return "Book Name: " + bookName + ", Price: ₹" + bookPrice;}



}
public class demo1 {
public static void main(String [] args){
Book b1=new Book("dream",121 );
String B1= b1.getDetail();
System.out.println(B1);
}
}
