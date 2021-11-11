public final class Person{
    final String name;
    final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TestPerson{
    public static void main(String args[]) {
        com.kashin98.challenge.Person kashin = new com.kashin98.challenge.Person("Kashin", 23);
        kashin.age = 25; // CE
        kashin.name = "karan"; // CE
    }
}