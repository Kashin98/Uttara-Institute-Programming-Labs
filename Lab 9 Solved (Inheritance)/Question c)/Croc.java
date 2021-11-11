public class Croc extends Animal{
    public Croc(String name){
        super(name);
    }

    public void swim(){
        System.out.print("Special child method - ");
        System.out.println( super.getName() +" is swimming");
    }
}