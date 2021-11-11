public class TestDog{
	public static void main(String[] args){
		Dog d = new Dog();
		d.bark(); // won't work as no age set.

		d.name = "Doggie";
		d.setSize(4);
		d.bark();

		d.setSize(14);
		d.bark();

		d.setSize(-13);
		d.setSize(1032);

	}
}
