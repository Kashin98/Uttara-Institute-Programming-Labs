public class Ques14{
	public static void main(String[] args){
	// Q-14
	// 14) WAP to create a 2 dimensional int array with 3 as first dimension
	// size. Create unidimensional arrays with size 2 and store numbers in the
	// 2-D array. Now loop over the arrays and display the value accordingly.
		question14();

	}

	// Array Program Methods
	public static void question14(){
		int[][] twoDimension = new int[3][];

		// looping first dimension of 2-d array
		for(int i = 0; i < twoDimension.length; i++){
			// using arrayGen method to generate a array of size 2 in every slot of the first dimension array.
			twoDimension[i] = arrayGenerator(2);
		}

		// for loop to loop over first dimension
		for(int i = 0; i < twoDimension.length; i++){
			//for-each loop to iterate over all value of 2-d arrays.
			for(int x : twoDimension[i]){
				System.out.println(x);
			}
		}
	}

	// this method generates an array of specified size given to it with random array values ranging 0-100
	public static int[] arrayGenerator(int size){
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++){
			newArray[i] = (int) (Math.random()*100); // casting to int rounds values down
		}
		return newArray;
    }


}