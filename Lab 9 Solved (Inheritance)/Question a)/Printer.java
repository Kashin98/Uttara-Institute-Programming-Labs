public class Printer extends Device{
    public Printer(String name){
        super(name);
    }

    @Override
    public void doSomething(){
        System.out.println(getName() + " is printing something.");
    }
}