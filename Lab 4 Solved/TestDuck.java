public class TestDuck{
	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();
		d1.setTailSize(10);
		d2.setTailSize(20);
		d1.swim();
		d2.swim();

		d1.tailSize = d2.tailSize; //d1.size is now the same value as d2 object
		System.out.println(d1.tailSize);
		System.out.println(d2.tailSize);
		d1.setTailSize(30);

		System.out.println(d1.tailSize);// will print 30
		System.out.println(d2.tailSize);// will print 20, because d1 and d2 are not pointing the same object, they just copied eachother's values.

		// now d1 points to same Duck object in heap as that of d2. So they will print same values and changes are reflected on same object.
		d1 = d2; // d1 object has been de-referenced and is eligible for garbage collection.
		System.out.println(d1.tailSize); // 20
		System.out.println(d2.tailSize); // 20

		 //both reference variables are pointed to null. So, now d2 object is also de-referenced and thus both object that were created are eligible for garbage collection.
		d1 = d2 = null;
		//System.out.println(d1.tailSize); // This code compiles but we get runtime NullPointerException
		//System.out.println(d2.tailSize); // This code compiles but we get runtime NullPointerException

		d1 = new Duck(); // New Duck object is again created by JVM in Heap memory and address is assigned to d1.
		d1.swim();

	}

}