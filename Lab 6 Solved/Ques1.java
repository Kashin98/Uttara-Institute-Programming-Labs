public class Ques1{
	public static void main(String[] args){
		//1) Write a main() program to test methods of string to perform the
		//   following (directly create a string in main() like String str = “abcdef”):

		String str = "KasHIN";

		//a) check its length
		System.out.println(str.length());

		//b) print all the chars in string one at a time
		for(int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i));
		}
		System.out.println();

		//c) convert string to array of chars and print chars
		for (char x: str.toCharArray()){
			System.out.print(x);
		}
		System.out.println();

		//d) convert string to uppercase and lowercase and print
		String strUppercase = str.toUpperCase();
		String strLowercase = str.toLowerCase();
		System.out.println(strUppercase);
		System.out.println(strLowercase);

		//e) take 2 strings and check if they are equal (create 2 strings directly in
		//   main())
		String str2 = "kashin";
		System.out.println(str.equals(str2));

		//f) take 2 strings and check which is bigger or lesser (alphabetical
		// comparison)
		System.out.println(str.compareTo(str2)); // compareTo works on char unicodes. str has caps K which is
		// somehwere in 65+x while str2 has small k which is 97+x. So str2 has the bigger char and so the return will
		// -1*x (x being difference between (97+11) - (65+11)) as str2 first char is bigger than str first char.

		//g) take 2 strings and find out if one string occurs in other. Print the first
		//occurring index
		String hay = "ask";
		String needle = "sk";
        System.out.println(needleInHaystack(hay,needle));

	}

	//g) take 2 strings and find out if one string occurs in other. Print the first
	//occurring index
	public static int needleInHaystack(String hay, String needle){
		// check null as first conditions, not anything else, then check if needle is bigger than haystack.
		if(hay == null || needle == null || hay.length() < needle.length()){
			return -1;
		}
		for (int i = 0; i <= hay.length() - needle.length(); i++){
			if(needle.equals(hay.substring(i, needle.length() + i))){
				return i;
			}
		}
		return -1;
    }
}