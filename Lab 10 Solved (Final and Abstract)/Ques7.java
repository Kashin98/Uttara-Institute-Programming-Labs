abstract class Ques7{
//    a) Can an abstract class/method be marked final? Why not?
//    No, when final opt modifier is applied it states that the method/class cannot be further modified which beats
//    and conflicts with the purpose of abstract class/method whose main goal is to require further modification
    // final abstract void test();

//    b) Can an abstract class/method be marked static? Why not?
//    No, A class cannot be marked static under any conditions as static is only applicable on class members.
//    A static member cannot be marked absent as class-scoped variables can't be overridden in anyway.

//    c) Can an abstract class inherit from another abstract class? Should any method have to be mandatorily overridden?
//    Yes, an abstract class can inherit from another abstract class, no abstract class is required to overwrite the
//    abstract methods (but they can). Any normal class inheriting from an abstract class however has to overwrite
//    all abstract methods including any inherited from other parent abstract classes.

//    d) Can a concrete class be inherited by an abstract class? Test it.
//    Yes, they can inherit from a concrete class because abstract classes are exactly same as concrete classes but
//    with the ability to have abstract methods and the consequence of not being able to be instantiated into an
//    object. They can still inherit from a normal class.

//    e) Can an abstract class have initializer/constructors? Test it
//    Yes, they can have initializers and constructors since they're exactly like a concrete class and have all the
//    benefits of a concrete class.

//    f) Can you have a private abstract method? Test it.
//    No, you can't have private abstract methods since abstract methods are by default considered to always be
//    public, also from a logical standpoint you can't override a private method in a subclass so you can't
//    override the abstract method.

//    g) Can you have a abstract class with final method?
//    Yes, you can have a final method inside an abstract class since abstract class is basically a concrete class
//    with ability to have abstract methods in it.

//    h) Can you have a final class with abstract method?
//    No, once you add an abstract method inside a class, the class has to also be made abstract and an abstract
//    class cannot be made final.
}