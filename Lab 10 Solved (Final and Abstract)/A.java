public class A{
    final int p;
    public static final int R = 5;
    public A(int p) {
        this.p = p;
    }
}

class TestA{
    public static void main(String args[]) {
        com.kashin98.challenge.A a = new com.kashin98.challenge.A(7);
        System.out.println(a.p);
        System.out.println(com.kashin98.challenge.A.R);
        // A.R = 4; // cannot assign values to constants
    }
}