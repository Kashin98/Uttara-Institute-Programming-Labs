public class Ques1 {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Outside Try catch block"); // yes it is executed because control flow only exits from
        // the statements inside try block, is caught and handled thus not crashing program allowing code to proceed.

        // the necessity of a try catch block is that it doesn't crash are program abruptly, our try catch block
        // handles the exception and allows the program end with an altered control flow which could be used to print
        // a message etc.
    }
}