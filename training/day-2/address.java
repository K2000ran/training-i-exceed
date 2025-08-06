public class address {
   String country,city;
   phone p;
   int pinCode;
   address(String country,String city,int pinCode,phone p){
    this.country=country;
    this.city=city;
    this.pinCode=pinCode;
    this.p=p;
}
public void displayAddress(){
    System.out.println("country: "+country +" city: "+city +" pincode: "+pinCode);
    p.phoneDetail();
}
}
