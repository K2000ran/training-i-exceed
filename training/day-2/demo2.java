import java.rmi.server.SocketSecurityException;

class car {
    String nameofCompany;
    boolean isAvailable;
    car(String nameofCompany,boolean isAvailable){
        this.nameofCompany=nameofCompany;
        this.isAvailable=isAvailable;
    }
    public void getCarDetail (){
        System.out.println("the name of comapny "+nameofCompany);
        System.out.println("the car is availabe "+isAvailable);
    }

}
class scorpio extends car{
    String carName,modeName,color;
    scorpio(String carName,String modeName,String color){
        super("mahindra",true);
        this.carName=carName;
        this.modeName=modeName;
        this.color=color;
    }
    public void displayCarModel(){
        System.out.println("the car Name: "+carName);
        System.out.println("the modeName Name: "+modeName);
        System.out.println("the color Name: "+color);
    }

}
public class demo2 {
   public static void main(String[]args){
     scorpio s=new scorpio("scropio", "vls", "black");
    s.getCarDetail();
    s.displayCarModel();
   }
}
