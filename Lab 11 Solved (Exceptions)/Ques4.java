public class Ques4 {
    public static void main(String[] args) {
        TestFinally testFinally = new TestFinally();
        testFinally.m1();
        // When using finally block don't code return statements inside finally block as it ignores any exception it
        // previously encountered and instead returns the new value from the finally block. Finally block will always
        // execute in every scenario except System.exit(); .
    }
}

class TestFinally{
    public int m1() {
        int x = 10;
        try {
            System.out.println("in m1() x="+x );
            String s = null;
            s.trim();
            return ++x;
        } catch(Exception e) {
            System.out.println("in catch of m1() "+e.getMessage());
            String s = null;
            s.trim();
            return ++x;
        } finally {
            System.out.println("in finally() of m1() x = "+x);
            String s = null;
            s.trim();
            return ++x;
        }
    }
}





