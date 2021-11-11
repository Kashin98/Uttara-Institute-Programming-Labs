public class Employee{
    private String name;
    private String email;
    private String dob;
    private Address homeAddress;
    private Address officeAddress;

    public Employee(String name, String email, String dob, Address homeAddress, Address officeAddress) {
        if(name == null || email == null || dob == null || homeAddress == null || officeAddress == null || name.trim().equals("")
                || email.trim().equals("") || dob.trim().equals("")){
            throw new IllegalArgumentException("Invalid Inputs provided");
        }
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj instanceof Employee){
            System.out.println("Address equals() method called");
            Employee e = (Employee) obj;
            if(this.name.equals(e.name) && this.email.equals(e.email) && this.dob.equals(e.dob) && this.homeAddress.equals(e.homeAddress)
                    && this.officeAddress.equals(e.officeAddress)){
                return true;
            }
        }
        return false;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Address officeAddress = new Address("Bangalore", "street", "5054", 567);
        Address homeAddress = new Address("Chennai", "street", "7614", 897);
        Employee e1 = new Employee("Kashin","k@gmail.com","11th Oct 1998", homeAddress, officeAddress);
        Employee e2 = new Employee("Kashin","k@gmail.com","11th Oct 1998", homeAddress, officeAddress);
        System.out.println("equals method: "+e1.equals(e2));
        System.out.println("== operator: "+(e1 == e2));
    }
}