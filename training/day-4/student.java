class grade1{
   private String stName;
   private int Roll;
   private  String dateOfBirth;
   grade1(String stName,int Roll,String dateOfBirth){
      this.stName=stName;
      this.Roll=Roll;
      this.dateOfBirth=dateOfBirth;
   }
   public void setRoll(int Roll){
      this.Roll=Roll;
   }
   public void setstName(String stName){
      this.stName=stName;
   }
   public void setdateOfBirth(String dateofBirth ){
      this.dateOfBirth=dateOfBirth;
   }
   public String getstName(){
      return stName;
   }
   public int getRoll(){
      return Roll;
   }
   public String getdateOfBirth(){
      return dateOfBirth;
}
}
public class student {
public static void main(String[] args){
grade1 s1=new grade1("rakesh", 12, "june");
System.out.println("the student name : "+ s1.getstName());
System.out.println("the student roll : "+ s1.getRoll());
System.out.println("the student DOB : "+ s1.getdateOfBirth());
s1.setRoll(20);
System.out.println("the student updatedroll : "+ s1.getRoll());
s1.setdateOfBirth("january");
System.out.println("the updatd DOB: " + s1.getdateOfBirth());
}

}
