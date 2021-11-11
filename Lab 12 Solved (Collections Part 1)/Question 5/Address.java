public class Address{
    private String city;
    private String street;
    private String pin;
    private int zip;

    public Address(String city, String street, String pin, int zip) {
        if(city == null || street == null || pin == null || city.trim().equals("") || street.trim().equals("") || pin.trim().equals("")
                || zip < 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        this.city = city;
        this.street = street;
        this.pin = pin;
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj instanceof Address){
            System.out.println("Address equals() method called");
            Address address = (Address) obj;

            if(this.city.equals(address.city) && this.street.equals(address.street) && this.pin.equals(address.pin) &&
                    this.zip == address.zip){
                return true;
            }
        }
        return false;
    }
}