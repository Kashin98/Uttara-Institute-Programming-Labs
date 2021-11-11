public class Ques3 {
    public static void main(String[] args) {
        try {
            TestEx.m1();
        }catch (Throwable t){
            t.printStackTrace();
        }
    }
}

class Animal{

}

class Pig extends Animal{

}

class TestEx{
    public static void m3(Animal a) {
        System.out.println("in m3()");
        //Pig p = (Pig) a; // A ClassCastException was thrown here. This is because we're trying to downcast a parent
        // class to its child class.
        // FIX for this is to check whether the passed Animal object is an instanceof Pig
        if(a instanceof Pig){
            Pig p = (Pig) a;
        }

    }

    public static void m2(){
        System.out.println("in m2()");
        Animal a = new Animal();
        m3(a); // the invoker submitted correct input, it's m3 code designer's fault for not checking instance of
        // passed Animal object.
        Pig p = new Pig();
        m3(p);
    }
    public static void m1() {
        System.out.println("in m1()");
        m2();
    }
}

