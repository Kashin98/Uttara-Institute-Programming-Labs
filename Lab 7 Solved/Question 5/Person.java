/*9) *Important problem* A person has a name, Car, Dog and a favourite
Song (reuse classes Car, Dog and Song from earlier problems). When
you ask a Person to commute and give him a destination (String
parameter), then he will start the car, drive the car and stop the car and
print that he has reached the destination. When you ask the person to
sing, he will sing (print) his favourite song with lyrics. When you ask a
person to take a walk, he will take his dog for a walk and the dog will
bark. Person has the ability to eat Food. Food has name and price.
Food must be given to Person when you invoke eat(). When a person is
asked to eat, he will specify that he is eating food with name and say out
his name as well. Person also has a generatePrime() behaviour. When
you give him a number as input, then he will generate all prime numbers
until that number and print to monitor.*/


public class Person{

	    private String name;
	    private Car car;
	    private Dog dog;
	    private Song song;
	    private Food food;

	public Person(String name, Car car, Dog dog, Song song, Food food) {
		this.name = name;
		this.car = car;
		this.dog = dog;
		this.song = song;
		this.food = food;
	}

	public void commute(String destination){
	        if(this.car.getFuel() > 3){
				this.car.start();
				this.car.drive();
				this.car.stop();
	        	System.out.println(this.name + " has reached " + destination);
			}else{
				System.out.println("The car has insufficient fuel");
			}
	    }

	    public void sing(){
	        this.song.getName();
	        System.out.println(this.name + " is singing " + this.song.play());
	    }

	    public void walk(){
			if(this.dog.getSize() != 0){
				this.dog.bark();
	        	System.out.println(this.name + " is walking with his dog.");
			}else{
				System.out.println("Please set size for Dog");
			}

	    }

	    public void eat(){
	        System.out.println(this.name + " is eating "+ food.getName() +" of price " + food.getPrice());
	    }

	    public void generatePrime(int num){
	        for(int i = 3; i <= num; i++){
	            if(isPrime(num)){
	                System.out.print(i + " ");
	            }
	        }
	    }

	    // marked private because it is a internal method that user shouldn't access.
	    private boolean isPrime(int num){
	        if(num < 2){
	            return false;
	        }

	        for(int i = 2; i <= num/2; i++){
	            if(num % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }

	    public void setName(String name) {
	        if(name == null || name.isEmpty()){
	            System.out.println("Enter valid Person name");
	            return;
	        }
	        this.name = name;
	    }

}

class TestPerson{
	public static void main(String[] args) {
		// creating objects before passing them into Person constructor
		Car car = new Car("Merc", 50 );
		Dog dog = new Dog(16);
		Song song = new Song("Musikk Per Automatikk","Musikk Per Automatikk Lyrics");
		Food food = new Food("Burger",500);

		Person person = new Person("Kashin", car, dog, song, food);

		// Car
		person.commute("Microsoft Office"); // Works now cause fuel is set.

		// Song
		person.sing(); // should work now

		// Dog
		person.walk(); // Dog will meow

		//Food
		person.eat();

		// generate prime method
		person.generatePrime(10);
    }
}