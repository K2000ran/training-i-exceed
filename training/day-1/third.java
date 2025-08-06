
class star{
    String s ,d;
    int x;
    star(String s,int x,String d){
        System.out.println(s);
        System.out.println(x);
        System.out.println(d);
    }
    public void display(){
        System.out.println(s);
        System.out.println(x);
        System.out.println(s);
    }
}
public class third {
   public static  void main(String[] args) {
   star obj=new star("kiran",10,"mahato");
   obj.display();
   }
}
