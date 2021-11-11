import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        if(name == null || name.trim().equals("")|| height < 0){
            throw new IllegalArgumentException("Invalid values provided");
        }
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Overrided equal() is called");
        if(this == obj) return true;

        if(obj instanceof Person){
            Person p = (Person) obj;
            return (this.name.equals(p.name) && this.height == p.height);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person: " +this.name +" "+this.height;
    }
}

class TestPerson{
    public static void main(String[] args) {
        Person p1 = new Person("Kashin", 20);
        Person p2 = new Person("Karan", 22);

        System.out.println("identity check = "+(p1==p2)); // this is comparing object address.
        System.out.println("equality = "+(p1.equals(p2))); // the dummy implementation of equals does the same ^.
        System.out.println(p1);
        System.out.println(p2);

//        4) After checking how collections work with strings, create Person objects
//        and add them to a new ArrayList. Verify if addition, search, removal works
//        correctly. Put SOPs in equals() in Person class and verify if it is being
//        called when you search/remove.

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(new Person("Jon", 35));

        personList.remove(p2);
        personList.contains(p1);
        System.out.println(personList.size());
    }
}