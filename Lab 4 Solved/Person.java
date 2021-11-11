public class Person{
	public String name;
	private int age;

	public void eat(){
		if(age < 40){
			System.out.println(this.name +" eats less");
		}else{
			System.out.println(this.name +" eats more");
		}
	}

	public void sleep(){
		if(age < 40){
			System.out.println(this.name +" sleeps more");
		}else{
			System.out.println(this.name +" sleeps less");
		}
	}

	public void setAge(int age){
		if(age > 0 && age <= 100){
			this.age = age;
		}else{
			System.out.println("Enter Relevant age");
		}
	}
}