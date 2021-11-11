import java.util.*;

public class ArrayPrograms{
	public static void main(String[] args){

	// Q-10

		System.out.println();
        System.out.println("Q-10");
		int[] arr1 = {23,123,-57,233,2344,-19,-19,1};
		int[] arr2 = {64,27,673,43,123,33,33,33};
        System.out.println(maxValue(arr1,arr2));


	// Q-11

		System.out.println();
        System.out.println("Q-11");
        System.out.println(avgOfArrays(arr1, arr2));


	// Q-12

		System.out.println();
        System.out.println("Q-12");
        System.out.println(secondLargestOfArrays(arr1, arr2));


     // Q-13

        System.out.println();
        System.out.println("Q-12");
		int[] uniqueValuesArray = uniqueArray(arr1,arr2);
        System.out.println(Arrays.toString(uniqueValuesArray));

	}

	// Array Program Methods

	// 10) WAM to pass 2 arrays of ints to a method. The method should return
	// the max value present across both the array elements.
	    public static int maxValue(int[] arr1, int[] arr2){
	        int maxValue1 = maxArrayValue(arr1);
	        int maxValue2 = maxArrayValue(arr2);

	        // we don't need to check for condition maxValue1== maxValue2 because the return value can be either as they
	        // both are max values so just checking maxValue1 > maxValue2 and using else return maxValue2 is good enough.
	        return Math.max(maxValue1,maxValue2); // can also use maxValue1 > maxValue2 ? maxValue1 : maxValue2.
	    }

	    // extra method for checking max value in array.
	    public static int maxArrayValue(int[] arr){
	        int maxValue = arr[0];
	        for (int i=1; i<arr.length; i++){ // start at 1 because arr[0] value is already assigned to maxValue var.
	            if(maxValue < arr[i]){
	                maxValue = arr[i];
	            }
	        }
	        return maxValue;
    }


    // 11) WAM to pass 2 arrays of ints to a method. The method should return
	// the average of the values across the 2 arrays. The avg returned should
	// be exact and not an approximation.
    	public static double avgOfArrays(int[] arr1, int[] arr2){
			double sum = 0;
			for(int x : arr1 ){
				sum += x;
			}
			for (int x : arr2){
				sum += x;
			}
			return sum/(arr1.length+arr2.length);
    	}


	// 12) WAM to pass 2 arrays of ints to a method. The method should return
	// the second highest of the values across the 2 arrays.
		public static int secondLargestOfArrays(int[] arr1, int[] arr2){
			int[] combinedArray = new int[arr1.length + arr2.length];

			// combining given two arrays into 1 array
			for (int i = 0; i < arr1.length; i++){
				combinedArray[i] = arr1[i];
			}
			for (int i = arr1.length, j = 0; i < combinedArray.length; i++,j++){
				combinedArray[i] = arr2[j];
			}

			// sorting both given arrays
			Arrays.sort(combinedArray);

			// making 2 vars largestValues and 2ndLargestValue where everytime we get a number larger than current max
			// value, we will copy the current largestValue to 2ndLargestValue and add the new largest value to
			// largestValue variable. This way we can keep track of the previous largest value. This method
			// allows us to get second largest value in all testcases.
			int largestValue = combinedArray[0];
			int secondLargestValue = combinedArray[0];
			for(int i = 1; i < combinedArray.length; i++){
				if(largestValue < combinedArray[i]){
					secondLargestValue = largestValue;
					largestValue = combinedArray[i];
				}
			}
			return secondLargestValue;
		}

	// 13) WAM to accept 2 int arrays as parameters. The method should
	// return one array with only unique elements across both the arrays.
			public static int[] uniqueArray(int[] arr1, int[] arr2){

	//        //Method 1 - HashMap Approach
	//        //This approach works because Map Collections overwrites repeating key values with latest added key. This only
	//        //works if the Integer is set to key, Map can have repeat values, but not keys.

	//        Map<Integer, Integer> uniqueMap = new HashMap<>();
	//
	//        for (int i = 0; i<arr1.length; i++){
	//            uniqueMap.put( arr1[i], i );
	//        }
	//
	//        for (int i = 0; i<arr2.length; i++){
	//            uniqueMap.put( arr2[i], i );
	//        }
	//
	//        int[] uniqueValues = new int[uniqueMap.size()];
	//        int i = 0;
	//        for (Integer x : uniqueMap.keySet()){
	//            uniqueValues[i++] = x;
	//        }
	//
	//        return uniqueValues;


			// Method 2 - HashSet Approach
			// This approach works because Set Collections removes all duplicate values
			Set<Integer> set = new HashSet<>();

			for (Integer x : arr1){
				set.add(x);
			}

			for (Integer x : arr2){
				set.add(x);
			}

			int[] uniqueSetValues = new int[set.size()];
			int i = 0;
			for (Integer x : set){
				uniqueSetValues[i++] = x;
			}

			return uniqueSetValues;
		}
    }
