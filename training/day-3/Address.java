class Address {
    String street;
    String city;
    String state;
    String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Display method
    public void displayAddress() {
        System.out.println(street + ", " + city + ", " + state + " - " + zipCode);
    }
}