public class Person{
	private String name;
	private int age;
	public static int objectCount = 0;

	// one method is we can use it in instance initializer which runs everytime an object is created.
	{
	 objectCount++;
	}

	// method 2 is two place it in constructor of the object which always runs when an object is instantiated.
	// Problem with this is that if we have more than one constructor, we need this() keyword or we need to apply it
	// in every constructor.
	public Person(int age) {
//        objectCount++;
//        System.out.println("Single param constructor");
		if (age <= 0 || age >= 100) {
			System.out.println("Enter valid value");
		} else {
			this.age = age;
		}
	}

	public Person(String name, int age) {
//        objectCount++;
//        System.out.println("Double param constructor");
		if (age <= 0 || age >= 100) {
			System.out.println("Enter valid value");
		} else {
			this.age = age;
		}
		if (name == null || name.trim().equals("") || name.length() > 30) {
			System.out.println("Enter valid value");
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("") || name.length() > 30) {
			System.out.println("Enter valid value");
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0 || age >= 100) {
			System.out.println("Enter valid value");
		} else {
			this.age = age;
		}
    }
}

// Test Class
class TestPerson{
	public static void main(String[] args) {
		Person person = new Person(879);
		Person person2 = new Person("", -8);

		System.out.println(person.getName()); // null
		System.out.println(person.getAge());; // 89
		System.out.println(person2.getName());;
		System.out.println(person2.getAge());;

		for (int i = 0; i < 50; i++){
			new Person(55);
			new Person("KASHIN",55);
		}
		System.out.println(Person.objectCount); // 102
    }
}