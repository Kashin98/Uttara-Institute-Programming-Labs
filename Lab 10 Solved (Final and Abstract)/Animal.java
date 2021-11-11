public abstract class Animal{
    String name;

    public Animal(){
        System.out.println("no-params constructor");
    }

    public Animal(String name) {
        System.out.println("Params constructor");
        this.name = name;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("Animal closes it's eyes sleep");
    }
}



class Croc extends com.kashin98.challenge.Animal {
    public Croc(String name) {
        super(name);
        System.out.println("Params Croc constructor");
    }

    public Croc(){
        System.out.println("no params Croc constructor");
    }

    public void swim(){
        System.out.println(this.name + "is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Croc is eating");
    }

//    @Override
//    public void sleep() {
//        System.out.println("Croc closes it's eyes sleep");
//    }
}

class TestAnimal{
    public static void main(String args[]) {
        com.kashin98.challenge.Croc croc = new com.kashin98.challenge.Croc();
        croc.eat();
        croc.sleep();
    }
}