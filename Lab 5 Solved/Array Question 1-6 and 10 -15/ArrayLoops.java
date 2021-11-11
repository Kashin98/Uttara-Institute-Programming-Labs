// Lab 5 - Arrays

public class ArrayLoops{

	public static void main(String[] args){
	// Q -2
	   // Method 1 - create int with size and store vars individually

		int[] array = new int[10]; // empty array created first with assigned size
		for (int i=0; i < array.length; i++){
			// arrays start at index 0 but we need to store starting from 1-10 so i+1
			array[i] = i+1;
			System.out.println(array[i]);
		}


		// Method 2 - Directly assign values when creating array and loop using for-each loop

		int[] array2 = {1,2,3,4,5,6,7,8,9,10}; // array created using given values and size will be exact to how many values given
		// for-each loop
		for(int i : array2){
			System.out.println(i);
        }


    // Q-3

		System.out.println();
		System.out.println("Q-3");
		int[] array3 = new int[10]; // empty array created
		for(int i = 0; i < array3.length; i++){
			array3[i] = i+1;
		}
		// for loop
		for(int i = 0; i < array3.length; i++){
			System.out.println(array3[i]);
		}
		// for-each loop
		for(int x : array3){
			System.out.println(x);
		}


	// Q-4

		System.out.println();
		System.out.println("Q-4");
		int[] array4 = new int[10]; // empty array created
		for(int i = 0; i<array4.length; i++){
			// We're adding 10 random values, Math random only returns values between 0-1, we need to multiply into 10.
			// By multiplying the values become decimal numbers which are given double datatype, so we need to
			// downcast to int.
			array4[i] = (int) (Math.random()*100); // random works by using system nano time to determine random values.
		}
		// for loop
		for(int i = 0; i < array4.length; i++){
			System.out.println(array4[i]);
		}
		// for-each loop
		for (int x : array4){
			System.out.println(x);
		}


	// Q-5

		System.out.println();
		System.out.println("Q-5");
		int array5[] = {10,20,30,40}; // literal values passed directly into array
        test(array5);


	// Q-6

		System.out.println();
		System.out.println("Q-6");
		double result = add(array4); // using random value array
        System.out.println(result);

	}


	// Q-5

	    public static void test(int[] arr){
	        // for loop
	        for (int i = 0; i < arr.length; i++){
	            System.out.println(arr[i]);
	        }
	        // for-each loop
	        for (int x: arr){
	            System.out.println(x);
	        }
    }

	// Q-6

	    public static double add(int[] arr) {
	        int sum = 0;
	        for(int x : arr){
	            sum += (double) x; // casting to double as adding several Max integer values could cause overflow.
	        }
	        return sum;
    }
}