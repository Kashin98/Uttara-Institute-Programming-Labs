public class Veterinarian {
    public void treat(Animal animal){
        if(animal instanceof Croc){
            Croc croc = (Croc) animal;
            croc.swim();
        }

        if(animal instanceof Hippo){
            Hippo hippo = (Hippo) animal;
            hippo.smoke();
        }
        animal.dance();
        animal.eat();
        animal.sleep();
    }
}