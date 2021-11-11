public class Car{
	private boolean engineOn = false;
	private int fuel;
	public String name;

	public Car(String name, int fuel){
		if(name == null || name.trim().equals("") || fuel < 0 || fuel > 100){
			System.out.println("Enter valid value");
		}else{
			this.fuel = fuel;
			this.name = name;
		}
	}

	public void start(){
		if(this.engineOn){
			System.out.println("The engine is already on");
		}else{
			this.engineOn = true;
			System.out.println("The engine was started");
		}
	}

	public void drive(){
		if(this.engineOn && this.fuel > 0){
			System.out.println("The car was driven forward");
			this.fuel--;
		}else{
			System.out.println("Engine is not on or fuel is low to drive car");
		}
	}

	public void reverse(){
		if(this.engineOn && this.fuel > 0){
			System.out.println("The car was reversed");
			this.fuel--;
		}else{
			System.out.println("Engine is not on or fuel is low to reverse car");
		}
	}

	public void stop(){
		if(this.engineOn){
			System.out.println("The engine was turned off");
			this.engineOn = false;
		}else{
			System.out.println("The engine is already switched off");
		}
	}

	public int getFuel() {
		return this.fuel;
	}

	public void setFuel(int fuel) {
		if(fuel < 0 || fuel > 100){
			System.out.println("Enter relevant amount of fuel");
		}else{
			this.fuel = fuel;
		}
    }
}