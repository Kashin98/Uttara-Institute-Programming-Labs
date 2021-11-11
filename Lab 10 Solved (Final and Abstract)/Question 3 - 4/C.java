public class C{
    static String name = "C";

    public static void print(){
        System.out.println("Print in C");
    }

    public C(String name) {
        System.out.println("Constructor C");
        this.name = name;
    }
}

class D extends C {
    static String name = "D";

    public static void print() {
        System.out.println("Print in D");
    }

    public D(String name) {
        super(name);
        System.out.println("Constructor D");
        this.name = name;
    }
}

class TestC{
    public static void main(String args[]) {
        D d = new D("B");
        System.out.println(d.name);
        C c = d;
        System.out.println(c.name);
        C.print();
        D.print();
    }
}