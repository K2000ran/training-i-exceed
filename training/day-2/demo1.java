class Company {
    String nameofcom;
    String city;

    Company(String nameofcom, String city) {
        this.nameofcom = nameofcom;
        this.city = city;
    }
}

class HR extends Company {
    HR(String nameofcom, String city) {
        super(nameofcom, city); // Call Company constructor
        System.out.println("Name of company from HR: " + super.nameofcom);
    }
}

class Finance extends Company {
    Finance(String nameofcom, String city) {
        super(nameofcom, city); // Call Company constructor
        System.out.println("Company city from Finance: " + super.city);
    }
}

public class demo1 {
    public static void main(String[] args) {
        Finance F = new Finance("i-exceed", "Bengaluru");
        HR H = new HR("i-exceed", "Bengaluru");
    }
}
