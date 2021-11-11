public class X{
    public int a = 10; // Field Initializer
    public static int b = 15; // Static field initializer (initializes first because of class loading)

    // if multiple initializers are there then first initializer from top runs first.
    // static/field initializer first, static/instance initializer and last constructor.
    {
        System.out.println("in inst init 1 a = " +this.a);
        this.a = 20;
    }

    {
        System.out.println("in inst init 2 a = " +this.a);
        this.a = 30;
    }

    static
    {
        System.out.println("in static init 1 b = " +b);
        b = 25;
    }

    static
    {
        System.out.println("in static init 2 b = " +b);
        b = 35;
    }

    public X(){
        System.out.println("inside no args constructor "+this.a);
        this.a = 40;
    }

    public X(int x) {
        System.out.println("in X param constr with x = "+x);
        this.a = x;
    }
}

class Y extends X{
    public int c = 10; // Field Initializer
    public static int d = 15; // Static field initializer (initializes first because of class loading)

    // if multiple initializers are there then first initializer from top runs first.
    // static/field initializer first, static/instance initializer and last constructor.
    {
        System.out.println("in inst init 1 c = " +this.c);
        this.c = 20;
    }

    {
        System.out.println("in inst init 2 c = " +this.c);
        this.c = 30;
    }

    static
    {
        System.out.println("in static init 1 d = " +d);
        d = 25;
    }

    static
    {
        System.out.println("in static init 2 d = " +d);
        d = 35;
    }

    public Y(){
        System.out.println("inside no args constructor "+this.c);
        this.c = 40;
    }

    public Y(int y) {
        super(y);
        System.out.println("in Y param constr with y = "+y);
        this.c = y;
    }

}


class TestX{
    public static void main(String[] args) {
//        X x = new X();
//        System.out.println(x.a);
//        System.out.println(X.b);

        Y y = new Y(99);
        System.out.println(y.c); // reference var is used here
        System.out.println(Y.d); // class reference is used here because static var and doesn't need to be instantiated.

        // static initializers only run once and always runs guaranteed when the class is loaded, never again.
//        X x2 = new X();
//        System.out.println(X.b);



    }
}