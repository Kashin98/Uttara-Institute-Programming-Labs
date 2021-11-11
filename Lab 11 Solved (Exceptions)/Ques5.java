public class Ques5 {
    public static void main(String[] args) {
        try {
            System.out.println("going to use throws");
            throw new MyException("This is my exception");
//            System.out.println("after using throws"); // won't compile as unreachable line
        } catch(Exception e) {
            System.out.println("in main()->catch() msg = "+e.getMessage());
            e.printStackTrace();
        }
//        Will this compile?? change throws statement to this:
        if(1==1)
            throw new NullPointerException("null pointer");
    }
}

// Yes coding your own exception as subclass of Exception will make it a checked exception and now you can use the
// throws keyword to make sure the invoker of your method will be forced to catch and handle the exception. Checked
// exceptions are useful to stop end-user from abusing the system in anyway.

class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
