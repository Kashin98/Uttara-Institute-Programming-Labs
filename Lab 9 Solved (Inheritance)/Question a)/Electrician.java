public class Electrician{
    public void testDevice(Device device){
        device.doSomething(); // this will run all subclass overwritten methods
        // if device is tv child object being passed, we will cast it and run child
        if(device instanceof TV){
            TV tv = (TV) device;
            tv.switchChannel();
        }
    }
}