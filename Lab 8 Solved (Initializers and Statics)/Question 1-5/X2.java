public class X2 {
    public static void test(long num){
        System.out.println("long " + num);
    }
    public static void test(double num){
        System.out.println("double " + num);
    }
    public static void test(float  num){
        System.out.println("float " + num);
    }
    public static void test(byte num){
        System.out.println("byte " + num);
    }
    public static void test(Long num){
        System.out.println("Long boxing and unboxing " + num);
    }
    public static void test(Short num){
        System.out.println("Short boxing and unboxing "  + num);
    }
}

class TestX2{
    public static void main(String[] args) {
        // Overloading allows us to call same method through Compile time polymorphism which allows to reuse same
        // method by passing in different params which depends on no. of params, params datatypes, params order(if
        // they have more than 2 different datatypes)
        X2.test(5L);
        X2.test(5.5);
        X2.test(5.5f);
        X2.test((byte)5);
        X2.test(Long.valueOf(5L));
        X2.test(Short.valueOf((short) 5));
    }
}