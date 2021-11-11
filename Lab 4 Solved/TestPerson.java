public class TestPerson{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "Man";
		p.setAge(39);
		p.eat();
		p.sleep();

		p.setAge(56);
		p.eat();
		p.sleep();

		//age can only be between 1 and 100;
		p.setAge(309);
		p.setAge(-39);
	}
}