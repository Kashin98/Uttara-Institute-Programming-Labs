public class Hippo extends Animal{
    public Hippo(String name){
        super(name);
    }

    public void smoke(){
        System.out.print("Special child method - ");
        System.out.println( super.getName() +" is smoking");
    }
}