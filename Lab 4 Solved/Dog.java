public class Dog{
	public String name;
	private int size;

	public void bark(){
		if(size > 10){
			System.out.println(this.name +" says Meow!");
		}else{
			if(size== 0){
				System.out.println("Please set size");
				return; //no need to return as value is 0 or less loop won't even run.
			}
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