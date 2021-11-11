public class Dog{
	public String name = "Doggie";
	private int size;

	public Dog(int size){
		if(size > 0 && size <= 100){
			this.size = size;
		}else{
			System.out.println("Enter Relevant Size");
		}
	}

	public void bark(){
		if(size > 10){
			System.out.println(this.name +" says Meow!");
		}else{
			for(int i = 0; i < size; i++){
				System.out.println(this.name +" Bow Wow");
			}
		}
	}


	public void setSize(int size){
		if(size > 0 && size <= 100){
			this.size = size;
		}else{
			System.out.println("Enter Relevant Size");
		}
	}

	public int getSize(){
		return this.size;
	}
}