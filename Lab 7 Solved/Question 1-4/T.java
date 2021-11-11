public class T{
    static int val = 10;
    int val2 = 10;

    public void test(){
        System.out.println("test instance method " + val);
    }

//    public static void test2(){
//        System.out.println("test instance method " + val2);
//    }
}


class TestT{
    public static void main(String[] args) {
        T t = null;
        // it still prints because a static variable is a class scoped variable and class scoped vars are stored in
        // class Class object which contains all class scoped variables, methods, initializers and innerclasses along
        // with class design of T. They are single copy variable. The class loading of T.class takes place when we
        // call the T.val, not when we create a ref var T and point it to null because that's just a reference var
        // and lazy loading in java makes it so class loading only takes place when needed.
        System.out.println(T.val);
        T t2 = new T();

        // this works because of how these vars come into existence, a static var can be called in a instance var
        // because a static var is created first during class loading while instance method comes into existence when
        // a object is created.
        t2.test();

        // this works similar to previous explanation, that the instance var comes into existence only when object is
        // created so it can be called in a static method which is created first from class loading.
//        t.test2();

        // can't access instrance vars without instantiating an object first.
        System.out.println(t.val2);

    }

}