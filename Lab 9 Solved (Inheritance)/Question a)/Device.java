
public class Device {
    private String name;

    public Device(String name){
        System.out.println("Inside Device construtor");
        if(name == null || name.trim().equals("")){
            System.out.println("Invalid name");
        }else{
            this.name = name;
        }
    }

    public void doSomething(){
        System.out.println("Device is doing something");
    }

    public String getName() {
        return name;
    }
}


class TestDevice {
    public static void main(String[] args) {
//        Device d = new Device("Davy");
//
//        System.out.println("d instance of Microwave? "+ (d instanceof Microwave));
//        System.out.println("d instance of Printer? "+ (d instanceof Printer));
//        System.out.println("d instance of TV? "+ (d instanceof TV));
//        System.out.println("d instance of Device? "+ (d instanceof Device));
        // This will show CE because String is not in anyway related to Device parent class.
//        System.out.println("d instance of String? "+ (d instance of String));

        // Tester who is written with polymorphic code so it can take any children references of Device class only,
        // if any class extends parent Device, then we can pass it to method to run it.
        Electrician electrician = new Electrician();

        // Devices
        // using super we're passing name to parent private string, then using public method getName() which we inherit
        // from device class we get the name we passed through super() to device name field. If a no-args constructor
        // is put in any of the below classes we get error because Compiler adds super() empty method but the device
        // class has a constructor which takes a String parameter and since the empty super() method cannot find
        // constructor to run, it leads to CE.
        TV tv = new TV("Samsung TV");
        Microwave microwave = new Microwave("Tenzin Microwave");
        Printer printer = new Printer("JetStream Printer");

        // Testing the devices
        // Using polymorphic code we're able to pass any child references to the parent parent references and if we
        // need to test child specific methods which are not overwritten from parent class, we use isntanceof to
        // check if passed reference is-a child reference, then downcast it and call the child ref var which we have
        // downcasted the passed reference to.
        electrician.testDevice(tv);
        electrician.testDevice(microwave);
        electrician.testDevice(printer);
    }
}