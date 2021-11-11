

public class Lab3{
	public static void main(String[] args){
		// Testing all methods

		System.out.println("1.)");
		oddOrEven(1231);
		System.out.println();

		System.out.println("4.)");
		System.out.println(isPrime(1231));
		System.out.println();

		//5) WAP to generate all primes within an positive int number given.
		//Can you reuse the method coded for 4th problem?
		System.out.println("5.)");
		 for(int i = 0; i < 25; i++){ // just use isPrime to check if number is prime, and if so print it. i < your number here in for loop.
			if(isPrime(i)){
				System.out.println(i);
			}
         }
		System.out.println();

		System.out.println("6.)");
		System.out.println(avgOfThree(12,12,34));
		System.out.println();

		System.out.println("7.)");
		bitCounter(-1);
		System.out.println();

		System.out.println("8.)");
		System.out.println(positivePowerOf2(16));
		System.out.println();

		System.out.println("9, 10, 11.)");
		System.out.println(descendingDigits(-54321));
		System.out.println();

		System.out.println("12.)");
		sumOfDigits(54321);
		System.out.println();

		System.out.println("13.)");
		System.out.println(isDigitPresent(1234123, 6));
		System.out.println();

		System.out.println("14.)");
		System.out.println(isPalindrome(1234123));
		System.out.println();

		System.out.println("15.)");
		System.out.println(sameDigits(121,112));
		System.out.println();

		System.out.println("16.)");
		gcd(300, 500);
		System.out.println();

		System.out.println("17.)");
		System.out.println(secondBiggest(300, 4520, 500));
		System.out.println();
	}



	// Solution Methods

	//1) WAP to test if a given number is even (use % first and then anding with 1 using bitwise & operator to test)
	public static void oddOrEven(int num){
		// %
		if(num % 2 == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}

		// bitwise &
		if((num & 1) == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
    }


    // Question 2 - 3 repeated questions from Lab 2


	//4) WAP to test if a given number is prime
    public static boolean isPrime(int num){
	        // numbers equal to and less than 1 cannot be prime.
	        if(num <= 1){
	            return false;
	        }

	        //we start i at 2 and only check half the variables because num/2 values is enough check all conditions of prime
	        for(int i = 2; i < num/2; i++){
	            if(num % i == 0){
	                return false;
	            }
	        }
	        // if none of above conditions are met then num is prime.
	        return true;
    }


	//6) Given 3 numbers, return the correct average of them.
	public static double avgOfThree(int num1, int num2, int num3){
		return ((double) num1 + num2 + num3)/3;  // cast operator to double because 3 int addition may cause overflow
	}


	//7) WAP to test number of bits set to 1 in a positive int given.
	public static void bitCounter(int num){
		// for negatives and positives values we will use unsigned right shift >>>
		// if only positive values we could use normal >>
		int count = 0;
		// we'll use while loop because we're going to be >>> till number becomes 000...0000 bits which is 0;
		while(num != 0){
			// num & 1 is good way to check LSB of any number.
			if((num & 1) == 1){
				count++;
			}
			num >>>= 1;
		}
		System.out.println(count);
    }


	//8) WAP to test if a given int number is a positive power of 2.
    public static boolean positivePowerOf2(int num){
	        if(num == 1){
	            return false;
	        }
	        while(num != 1){
	            if(num % 2 != 0){
	                return false;
	            }
	            num /= 2;
	        }
	        return true;
    }


	//9) WAM to test if all digits in a given number are in decreasing order
	//(allow -ves)

	//10) WAM to test if all digits in a given number are in increasing order (allow -ves).

	//11) WAM to test if all digits in a given number are the same (allow
	//-ves).
    public static boolean descendingDigits(int num){
	        int remainder = num % 10;
	        while(num != 0){
				//for Question 10 change to (num % 10 < remainder), for Question 11 change to (num % 10 != remainder)
	            if(num % 10 > remainder ){
	                return false;
	            }
	            remainder = num % 10;
	            System.out.println(remainder);
	            num /= 10;
	        }
	        return true;
    }


	//12) WAM to return the sum of all the digits in a given number (allow
	//-ves).
	public static void sumOfDigits(int num){
			 int remainder = 0;
			 while(num != 0){
				 remainder += num % 10;
				 num /= 10;
			 }
			 System.out.println(remainder);
    }



	//13) WAM to return the if a given digit is present in a given number
    public static boolean isDigitPresent(int num, int digit){
	        int remainder = 0;
	        while(num != 0){
	            remainder = num % 10;
	            if(digit == remainder){
	                return true;
	            }
	            num /= 10;
	        }
	        return false;
    }


	//14) WAP to identify if an int number is a palindrome! Generate all
	//palindromes from 10 till 1 million and print to monitor
	public static boolean isPalindrome(int num){
	        // reverse whole number and see if it's == to original number
	        int reverse = 0;
	        int original = num;
	        while(num != 0){
	            reverse *= 10;
	            reverse += num % 10;
	            num /= 10;
	        }
	        if(reverse == original){
	            return true;
	        }
	        return false;
    }


	//15) WAP to test whether 2 numbers given as inputs contains the
	//same digits, for ex: 121, 112, 211 contain the same digits!
	public static boolean sameDigits(int num1, int num2){
		//The only solution I have come up with for this requires arrays. I cannot figure out any other way

		// first make both numbers into arrays separated by digits. I could convert the numbers into strings and use
		// split() or I could make it harder by looping each digits and adding it 1 by 1 to array. Trying with string.
		// I convert he numbers to string
		String numStr1 = String.valueOf(num1);
		String numStr2 = String.valueOf(num2);

		// make sure we have been given digits that are of same length or it's no use going further.
		if(numStr1.length() != numStr2.length()){
			return false;
		}

		// Split the number into array so we have an array which holds each digit of num ["1","1","2"] as such
		char[] charArray1 = numStr1.toCharArray();
		char[] charArray2 = numStr2.toCharArray();

		// we sort the arrays since the values are chars they are sorted on their unicode value
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		//Convert the arrays to string again
		numStr1 = new String(charArray1);
		numStr2 = new String(charArray2);

		//check if both strings are equal
		return numStr1.equals(numStr2); // shortened method which return boolean value
	}


	//16) WAP to test GCD of 2 int numbers given as parameter
    public static void gcd(int num1, int num2){
	       int minNumber = num1 > num2 ? num1 : num2;
	       int gcd = 0;
	       // the gcd can only be as big as the lowest provided input;
	       for(int i = 1; i <= minNumber; i++){
	           if(num1 % i == 0 && num2 % i ==0){
	               gcd = i;
	           }
	       }
	        System.out.println(gcd);
    }

    //17) Given 3 numbers, return the second biggest.
    public static int secondBiggest(int num1, int num2, int num3) {
			// if num1 is bigger than num2 then check if num1 is also bigger than num3
	        if(num1 > num2){
				//if num1 bigger return num3 else num1
	            return num1 > num3 ? num3 : num1;
			// if num2 is bigger then check if num2 is also bigger than num3
	        }else{
	        	//if num2 bigger return num3 else num2
	            return num2 > num3 ? num3 : num2;
	        }
    }
}