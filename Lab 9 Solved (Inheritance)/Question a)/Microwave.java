public class Microwave extends Device{
    public Microwave(String name){
        super(name);
        System.out.println("Inside Microwave construtor");
    }

    @Override
    public void doSomething(){
        System.out.println(getName() + " is cooking food.");
    }
}