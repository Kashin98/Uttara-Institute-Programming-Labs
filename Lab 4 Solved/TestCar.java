public class TestCar{
	public static void main(String[] args){
		Car c = new Car();
		c.name = "Honda Civic";
		c.drive(); // Should fail as engine is not on;
		c.start(); // Engine is on;
		c.drive(); //will fail again as fuel was not set and default value for fuel inst var is 0;

		c.setFuel(300); // fails, should be less than 100.
		c.setFuel(-300); // fails, should be more than 0.
		c.setFuel(2); //should work as fuel is correct limit.
		c.drive(); //works, -1 fuel

		c.stop(); // engine is switched off
		c.drive(); //engine is off so please switch on again.
		c.start();
		c.reverse(); //works, -1 fuel
		c.drive(); // fails fuel was set 2, no more fuel now :(
    }
}