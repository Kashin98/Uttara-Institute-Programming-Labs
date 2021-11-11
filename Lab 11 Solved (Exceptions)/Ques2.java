public class Ques2 {
    public static void main(String[] args) {
        try {
            // a) NullPointerException
            String s = null;
            s.trim(); // Calling a method on null object will cause NullPointerException;
        }catch (Throwable t){  // write Polymorphic catch for user facing methods, you can also break it down into
            // multiple catches but a user facing method with polymorphic catch is good.
            t.printStackTrace();
        }
        System.out.println("NPException caught");

        try {
            // b) ClassCastException
            Animal dog = new Dog();
            Animal whale = new Whale();
            Dog dog1 = (Dog) whale; // casting improperly, they both extend animal and we're trying to downcast to a
            // subclass that are not similar.
        } catch (Throwable t){
            t.printStackTrace();
        }
        System.out.println("ClassCastException caught");


        try {
            // c) NumberFormatException
            String s2 = "ten";
            Integer.parseInt(s2); // trying to parse a string to int but the string doesn't consist numbers.
        }catch (Throwable t){
            t.printStackTrace();
        }
        System.out.println("NumberFormatException caught");

        // DO NOT CATCH OutOfStackMemoryError, it will lead to another OutOfStackMemoryError inside the catch block and
        // crash your program
//        try {
//            // d) OutOfStackMemoryError
//            main(args); // no you can't catch this, trying to catch OutOfStackMemoryError can lead to it's own
//            // OutOfStackMemoryError. DO NOT CATCH OutOfStackMemoryError.
//        }catch (Throwable e){
//            e.printStackTrace();
//        }


        try {
            // e) OutOfMemoryError
            int[] intArray = new int[Integer.MAX_VALUE]; // The array size is too large
            // you can catch this error, but remember OutOfMemoryError is an Error and not an Exception. Either code
            // catch to catch Error or Throwable.
        }catch (Error e){
            e.printStackTrace();
        }
        System.out.println("OutOfMemoryError caught");
    }
}


class Animal{
    // for ClassCastException
}

class Dog extends Animal{
    // for ClassCastException
}

class Whale extends Animal{
    // for ClassCastException
}
