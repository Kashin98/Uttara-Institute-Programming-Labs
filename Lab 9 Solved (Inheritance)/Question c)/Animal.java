public class Animal{
    private String name;

    public Animal(String name) {
        if(name == null || name.trim().equals("")){
            System.out.println("Invalid name");
        }else {
            this.name = name;
        }
    }

    public void eat(){
        System.out.print("parent class method - ");
        System.out.println(this.name +" is eating");
    }

    public void sleep(){
        System.out.print("parent class method - ");
        System.out.println(this.name +" is sleeping");
    }

    public void dance(){
        System.out.print("parent class method - ");
        System.out.println(this.name +" is dancing");
    }

    public String getName() {
        return name;
    }
}

class TestAnimal{
    public static void main(String[] args) {
        // Vet
        Veterinarian vet = new Veterinarian();

        // Animals
        Croc croc = new Croc("Crocodile");
        Tiger tiger = new Tiger("Indian Tiger");
        Hippo hippo = new Hippo("African Hippo");

        // Treating animals
        // we see that parent methods are running, this because the parent methods were not overwritten in child
        // class so JVM will run the parent class methods instead.
        vet.treat(croc);
        vet.treat(tiger);
        vet.treat(hippo);
    }
}