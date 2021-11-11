public abstract class Device{
    public Device() {
        System.out.println("no=params constructor");
    }

    public static void staticMethod(){
        System.out.println("this is a class-scoped method");
    }

    public abstract void doSomething();
}

abstract class Phone extends Device{
    public abstract void call(String phoneNumber);
}

class MobilePhone extends Phone{
    //you have to overwrite 2 methods, one from parent Device inherited by Phone abstract class and the other is phone's
    //abstract method


    @Override
    public void doSomething() {
        System.out.println("Mobile is ringing");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Mobile is calling "+phoneNumber);
    }
}

class Person{
    public void use(Device d){
        d.doSomething();
        if(d instanceof Phone){
            // you can downcast it to Mobile phone, i just downcasted to phone since call is a Phone method and it is
            // overwritten so it will always call MobilePhone method anyways.
            Phone p = (Phone) d;
            p.call("12312213123");
        }
    }
}

class TestDevice {
    public static void main(String args[]) {
        Device mobilePhone = new MobilePhone();
        Person kashin = new Person();
        kashin.use(mobilePhone);
    }
}