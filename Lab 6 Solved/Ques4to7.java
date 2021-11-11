public class Ques4to7{
	public static void main(String[] args) {
		String str ="kashin";

		System.out.println("Q-4");
		System.out.println(swapChars(str));
		System.out.println();

		System.out.println("Q-5");
		System.out.println(palindrome(str));
		System.out.println();



		//6) Test swapping of 2 ints using a) temp variable b) addition &
		//subtraction approach c) swapping using xor (^) approach"
		System.out.println("Q-6");
		int num1 = 20;
		int num2 = 30;

		// method 1 - temp var
//        int temp = 0;
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println(num1);
//        System.out.println(num2);

		// method 2 - subtraction & add
//        num1 += num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println(num1);
//        System.out.println(num2);

		//method 3 - xor ^
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();



		System.out.println("Q-7");
		reverseAndPalindrome(str);
		System.out.println();
	}



	//4) WAM to swap first and last chars of a passed string and return it.
	//char at length-1 + substring from 1, length-1 + char at 0
	//str.charAt(str.length()-1) + str.substr(1,str.length()-1) +str.charAt(0)
	public static String swapChars(String str){
		// checking for null or empty strings.
		if(str == null || str.isEmpty()){
			return "Enter valid value";
		}
		// this will swap every char including whitespace because it's char swap and space is a char in java.
		char start = str.charAt(0);
		char end = str.charAt(str.length() - 1);
		String swapped = end + str.substring(1, str.length()-1) + start;
		return swapped;
	}



	//5) WAM to test whether a given string is a palindrome.
	public static boolean palindrome(String str){
		if(str == null || str.isEmpty()) return false;
		int start = 0;
		int end = (str.length() - 1);
		// this allows us to check for only half the string and not whole string for no reason.
		while (start < end){
			if(str.charAt(start) == str.charAt(end)){
				start++;
				end--;
			}else{ // use else { return false; }. If you're using without else, end if loop with continue; so it doesn't
				   // execute false after if control statement ends.
				return false;
			}
		}
		return true;
	}



	//7) WAM to reverse a given string and use this method to a) find
	//whether a string is a palindrome b) reverse each word in a sentence
	//(commonly asked programming question)
	//Do the reversing of the string in 3 ways - a) using concat by reading
	//each char from end b) using StringBuilder class c) swapping chars in the
	//char array using xor.

	public static void reverseAndPalindrome(String str){
		// method 1 - concat reverse
		String reverse = "";
//        for(int i = 0; i < str.length(); i++){
//            reverse += str.charAt(str.length() - i - 1);
//        }
//        System.out.println(reverse);

		// method 2 - StringBuilder reverse()
//        StringBuffer stringBuffer = new StringBuffer(str);
//        stringBuffer.reverse();
//        str = stringBuffer.toString();
//        System.out.println(str);

		// method 3 - xor charArray;
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end){
			charArray[start] = (char) (charArray[start] ^ charArray[end]);
			charArray[end] = (char) (charArray[start] ^ charArray[end]);
			charArray[start] = (char) (charArray[start] ^ charArray[end]);
			start++;
			end--;
		}
		reverse = new String(charArray);
		System.out.println(reverse);

		// Checks if a string is equal to it's reverse, if it is then it is a palindrome.
		System.out.println(str.equals(reverse));
    }
}