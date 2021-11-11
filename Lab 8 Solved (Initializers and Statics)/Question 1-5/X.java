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
}

class TestX{
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.a);
        System.out.println(X.b);

        // static initializers only run once and always runs guaranteed when the class is loaded, never again.
        X x2 = new X();
        System.out.println(X.b);
    }
}