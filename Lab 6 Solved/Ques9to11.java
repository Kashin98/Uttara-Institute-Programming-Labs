import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques9to11{
	public static void main(String[] args) {
		//9) Take any number of strings as input from command line. Concat all
		//of them and print them out.
		System.out.println("Q-9");
		String argsConcat = "";
		for(String s : args){
			argsConcat += s;
		}
		System.out.println(argsConcat);
		System.out.println();


		System.out.println("Q-10");
		String str = "#!!!!###%%@@@12341243abc&&&";
		System.out.println(Arrays.toString(specialCharsOnly(str)));
		System.out.println();

		System.out.println("Q-11");
		String str2 = "xxxxxxxgggggggggmmckkkllxx";
		System.out.println(longSequence(str2));
		System.out.println();
	}

	//10) WAM to accept a string as input and return only unique characters in
	//it (non-repeating) in an array. (commonly asked programming question)”
	public static char[] specialCharsOnly(String str){
		if(str == null || str.isEmpty()){
			return new char[]{};
		}
		// set remove duplicate values, so fast way to eliminate any repeating values
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < str.length(); i++){
			char strchars = str.charAt(i);
			// if char is letter or digit, it is ignored, if ! not then it is added to the set.
			if(!Character.isLetterOrDigit(strchars)){
				set.add(strchars);
			}
		}
		// create an array using set size
		char[] charArray = new char[set.size()];
		int i =0;
		// loop through whole set and add to array. When using a hashset the values are jumbled as there is no
		// ordering when hashset is used. If the question requires ordering we can shift to Map<K,V> setups.
		for(Character c : set){
			charArray[i++] = c;
		}
		return charArray;
	}

	//11) Given a long sequence of limited symbols, Compress the string as
	//shown in the example
	//i/p : xxxxxxxgggggggggmmckkkllxx"
	//o/p : x7g9m2c1k3l2x2 (symbol followed by number of occurrences)
	public static String longSequence(String str){
		if(str == null || str.isEmpty()) return "enter valid value";
		int count = 1;
		String sequence = "";
		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(i) != str.charAt(i+1)){
				sequence += ""+str.charAt(i)+count;
				count = 1;
				if(i+1 == str.length()-1){
					sequence += ""+str.charAt(i+1)+count;
				}
			}else if(i+1 == str.length()-1 && str.charAt(i) == str.charAt(i+1)){
				sequence += ""+str.charAt(i+1)+(++count);
			} else  {
				count++;
			}
		}
		return sequence;
	}

}