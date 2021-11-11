public class Quesd {

	private String name;
    private int age; // assuming age is int since, info not provided
    private int count = 0; // tracks how many pets are added and acts as array index value
    private String[] petNames = new String[20];

    public void dance(){
        if(this.age > 25){
            System.out.println(this.name +" is doing the Waltz");
        }else{
            if(this.age ==0){
                System.out.println("Please set Person age");
            }else{
                System.out.println(this.name +" is doing the Cha Cha");
            }
        }
    }

    public void sing(){
        if(this.count<1){
			System.out.println("There are no pets");
			return;
		}else{
			System.out.println(this.name + " is singing");
			for(int i = 0; i < this.count; i++){
				// this will cause random values between 0 - number of pet names (count) are present in array, by
				// cast to int all values are rounded down so no chance we get petName.length exact value cause
				// IndexArrayOutOfBounds exception. Even if our petNames array has null values (from setting size to
				// 20 at the beginning, we make sure to only check the amount values we have)
				int random = (int) ((Math.random()) * this.count);
				System.out.print(this.petNames[random] + " ");
			}
			System.out.println();
        }
    }

    // normal method for single pet addition
    public void addPets(String petName){
        if(petName.isEmpty() || petName == null){
            System.out.println("provide valid pet name");
            return;
        }
        // This validation makes sure we don't overflow our array, if the count is 20 or more (count is being used as
        // array index value so it has be between 0-19) then we cannot add more pet Names as that overflows array and
        // throws arrayOutOfBounds exception.
        if(this.count < 20){
            petNames[this.count] = petName;
            this.count++;
        }else{
            System.out.println("You have reached maximum number of pets that can be owned, stop buying pets, c***");
        }
    }

//    ------------------------------------------------------------------------------------------------------------

    //(This is not part of the question, I'm adding this code for my own convenience of not typing addPet() method 20
    // times in a row)
    // Overloaded method to add many pets by just passing an array[]
    public void addPets(String[] multiplePets){
        if(multiplePets == null){
            System.out.println("provide valid pet names");
            return;
        }

        // This validation makes sure people don't submit any petname that is null or "" in multiplePets array
        for(String pet : multiplePets){
            if(pet == null || pet.isEmpty()){
                System.out.println("provide valid pet names");
                return;
            }
        }

        // This validation makes sure we don't overflow our array, if length of multiplePets array added with
        // count is greater than 20 then we don't execute.
        if(this.count + multiplePets.length < 20){
            for(int i = 0; i < multiplePets.length; i++){
                petNames[this.count] = multiplePets[i];
                this.count++;
            }
        }else{
            System.out.println("You have reached maximum number of pets that can be owned, stop buying pets, c***");
        }
    }

//    ------------------------------------------------------------------------------------------------------------

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Please set valid Person name");
        }else {
            this.name = name;
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 1 || age > 100){
            System.out.println("Please set age between 0 - 100");
        }else{
            this.age = age;
        }
    }

}

class TestQuesd{
    public static void main(String[] args) {
        Quesd person = new Quesd();
        person.dance(); // fails since age isn't set
        person.sing(); // fails since petName array is has no pets.

        person.setAge(200);//fails
        person.setAge(20);

        person.setName("");//fails
        person.setName(null);//fails
        person.setName("Kashin");

        person.dance(); // works since age is set
        person.addPets("pet - 1");
        person.addPets("pet - 2");
        person.addPets("pet - 3");
        person.addPets("pet - 4");
        person.sing();


        // ------------------------------------------------------------------------------------------------------------
        // Not part of the question

        String[] pets = {"pet - 5", "pet - 6", "pet - 7", "pet - 8", "pet - 9", "pet - 10", "pet - 11", "pet - 12",
                "pet - 13", "pet - 14"};
        String[] petsFail = {"pet - 5", "pet - 6", ""};
        String[] petsFail2 = {"pet - 5", "pet - 6", null};
        person.addPets(petsFail);
        person.addPets(petsFail2);
        person.addPets(pets);
        person.sing();
    }
}