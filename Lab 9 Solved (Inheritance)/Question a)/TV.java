public class TV extends Device{
    public TV(String name){
        super(name);
        System.out.println("Inside Tv construtor");
    }

    @Override
    public void doSomething(){
        System.out.println(getName() + " is playing a movie.");
    }

    public void switchChannel(){
        System.out.println(getName() + " is switching between channels.");
    }
}