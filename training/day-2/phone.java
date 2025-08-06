public class phone {
    String phoneCompany;
    int ram;
    String model;
    phone(String phoneCompany,int ram,String model){
        this.phoneCompany=phoneCompany;
        this.ram=ram;
        this.model=model;
    }
    public void phoneDetail(){
        System.out.println("phonecompany: "+ phoneCompany +" ram: "+ ram +" model: "+model);
    }
}
