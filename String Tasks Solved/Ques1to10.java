import java.util.*;

public class Ques1to10 {
    public static void main(String[] args) {
        // Testing of the methods
        System.out.println("Task-1");
        String[] strings = {"flower", "flo", "flow"};
        System.out.println(prefix(strings));
        System.out.println();


        System.out.println("Task-2");
        String str2 = "kashin  ";
        System.out.println(lastWord(str2));
        System.out.println();


        System.out.println("Task-3");
        String str3 = "kashin is going to college ";
        System.out.println(reverseString(str3));
        System.out.println();


        System.out.println("Task-4");
        String[] strArray = {"eat","tea","tan","ate","nat","bat"};
        anagrams(strArray);
        System.out.println();

        System.out.println("Task-5");
        String str5 = "abcabcabcdebcc";
        System.out.println(longestSubstring(str5));
        System.out.println();


        System.out.println("Task-6");
        String needle = "low";
        String haystack = "flower";
        System.out.println(needleAndHaystack(haystack,needle));
        System.out.println();


        System.out.println("Task-7");
        String str7 = "f1ower123123";
        vowelsAndConsonants(str7);
        System.out.println();


        System.out.println("Task-8");
        String str8 = "kkaasshhiinn";
        System.out.println(removeDuplicates(str8));
        System.out.println();


        System.out.println("Task-9");
        String str9 = " Hello there, my name is kashin. What is your name , mate ?. Name";
        String word = "name";
        System.out.println(wordInAString(str9, word));
        System.out.println();


        System.out.println("Task-10");
        String str10 = "   Hello kashin , my name is kashin  ";
        String word2 = "kashin";
        String replacement = "Karan";
        System.out.println(replaceWords(str10, word2, replacement));
        System.out.println();
    }



    // --------Task 1, find the common prefix among all strings provided in a given array and return the prefix.------
    public static String prefix(String[] strings){
        if (strings == null) return "";
        String start = strings[0];

        // checking if array consists of any null or empty strings. Also finding the string with smallest length();
        // The reason we need to use smallest length string for our start ref var is because we want to find the
        // prefix common among every string. If the array was {"fl", "flow", "flower"} and our start ref var was
        // flower, when we start loop to compare strings we'll end up with an stringOutOfBounds error as we're trying
        // to search a prefix as long as 6 letters but our smallest string is only 2 letters.
        for(String s : strings){
            if(s == null || s.isEmpty()){
                return "";
            }
            if(start.length() > s.length()){
                start = s;
            }
        }

        String answer = "";
        // first loop increases the substring value allowing us to gradually check from 1 char to i chars of the
        // string each iteration.
        o:for (int i= 0; i<start.length(); i++){
            String sub = start.substring(0,i+1);
            // inner loop compares the substring of each value from the array to find correct answer.
            i:for (int j = 0; j < strings.length; j++){
                if(!sub.equals(strings[j].substring(0,i+1))){
                    break o;
                }
            }
            answer = start.substring(0,i+1);
        }
        return answer;
    }


    // -------Task 2, return the length of the last work in a given string, if there is no word return 0.---------
    public static int lastWord(String str){
        if(str == null || str.isEmpty()){
            return -1;
        }
        // removes white spaces from each end of the string.
        str = str.trim();

        // method-1 using for loop and charAt.
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;

        // METHOD-2 using the split() method to split string into an array of strings and return last value in array.
//        String[]  strArray = str.split(" ");
//        return strArray[strArray.length-1].length();
    }


    // ---------------Task 3, reverse the order of the words in string and return it.----------------
    public static String reverseString(String str){
        if(str == null || str.isEmpty()){
            return "";
        }
        str = str.trim();
        String temp = "" ;
        String[]  strArray = str.split(" ");
        int i = 0;
        int j = strArray.length - 1;
        while (i < j){
            temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++; j--;
        }
        String answer = String.join(" ", strArray);
        return answer;
    }

    // Had very similar solution but thought it was too complicated.
    // ---------------Task 4, Anagrams, return all anagrams from a array in groups.----------------
    public static void anagrams(String[] strArray){
        Map<String, List<String>> map= new HashMap<>();

        for(String s : strArray){
            String word = s;
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            }else{
                List<String> arrayList = new ArrayList<String>();
                arrayList.add(word);
                map.put(newWord, arrayList);
            }
        }

        for(String s : map.keySet()){
            List<String> values = map.get(s);
            System.out.println(values);
        }
    }


    // Need to practice question 5, couldn't come with my own solution.
    // --------Task 5, find longest substring of non repeating characters.------
    public static int longestSubstring(String str){
        Map<Character, Integer> map = new HashMap<>();
        int start = 0 ;
        int maxLength = 0;
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                start = Math.max(start, map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i), i);
            maxLength = Math.max(maxLength, i - start + 1);

        }
        return maxLength;
    }


    // ----------------------Task 6, needle and haystack problem.-------------------------
    public static int needleAndHaystack(String haystack, String needle){
        if(haystack == null || needle == null || haystack.length() < needle.length() || needle.isEmpty()){
            return -1;
        }

        for(int i =0; i < needle.length(); i++){
            if(needle.equals(haystack.substring(i,needle.length() + i))){
                return i;
            }
        }
        return -1;
    }


    // --------------Task 7, Find consonants and vowels in string.------------------
    public static void vowelsAndConsonants(String str){
        if(str == null || str.isEmpty()){
            return;
        }
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toLowerCase().charAt(i) == 'a' ||str.charAt(i) == 'e'|| str.charAt(i) == 'i'||str.charAt(i) == 'o'|| str.charAt(i) == 'u' ){
                // counts each letter in word and makes sure it is a vowel
                vowels++;
            }else if(Character.isLetter(str.toLowerCase().charAt(i))){
                //if it not a vowel we will check if it is a letter, if it is a letter than it has to be a consonant.
                consonants++;
            }
        }
        System.out.println("vowels = "+vowels);
        System.out.println("consonants = "+consonants);
    }



    // --------------Task 8, Remove duplicate values from the string.------------------
    public static String removeDuplicates(String str){
        if(str == null || str.isEmpty()){
            return "";
        }
        // linkedHashMap keeps the each key in order of entry.
        // so the returned string doesn't have jumbled values in the strings
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0; i < str.length(); i++){
            map.put(str.charAt(i), i);
        }
        String answer = "";
        for(Character c : map.keySet()){
            answer += c;
        }
        return answer;
    }



    // --------------Task 9, Find occurrence of word in given string (Case-sensitive mandatory)------------------
    public static int wordInAString(String str, String word){
        if(str == null || word == null || str.isEmpty() || word.isEmpty()){
            return -1;
        }
        str = str.trim(); // remove leading and trailing spaces.
        String[] strArray = str.split(" ");
        int count = 0;
        for (String s : strArray){
            if(word.equals(s)){
                count++;
            }
        }
        return count;
    }


    // --------------Task 10, Find occurrence of word in given string (Case-sensitive mandatory)------------------
    public static String replaceWords(String str, String word, String replacement){
        if(str == null || word == null || replacement == null || str.isEmpty() || word.isEmpty() || replacement.isEmpty()){
            return "";
        }
        String[] strArray = str.split(" ");
        for(int i = 0; i< strArray.length; i++){
            if(strArray[i].equals(word)){
                strArray[i] = replacement;
            }
        }
        str = String.join(" ", strArray);
        return str;
    }
}
