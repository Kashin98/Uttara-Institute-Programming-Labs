public class Ques3to5 {
    public static void main(String[] args) {
        System.out.println("Question-3");
        String str = "aBC$1";
        System.out.println(lowerToUppercase(str));
        System.out.println();


        System.out.println("Question-4");
        String str2 = ""+Integer.MAX_VALUE;
        System.out.println(strToInteger(str2));
        System.out.println();

        System.out.println("Question-5");
        String needle = "kashin";
        String haystack = "jakashin";
        System.out.println(needle);
        System.out.println(haystack);
        System.out.println(needleInHaystack(needle, haystack));
        System.out.println();
    }

    //    3) Code a method to accept a string and return a string with all uppercase letters
    //    converted to lowercase and vice versa with every other char retained as is.
    //    Ex: aBC$1 => Abc$1
    public static String lowerToUppercase(String str){
        if(str == null || str.trim().equals("")){
            return "";
        }
        String answer = "";
        for(int i = 0; i < str.length() ; i++){
            // Just check if each character is uppercase and convert to lowercase. Uppercase and lowercase do not
            // affect the numbers and special characters so they're not changed.
            if(Character.isUpperCase(str.charAt(i))){
                answer += (str.charAt(i)+"").toLowerCase();
            }else{
                answer += (str.charAt(i)+"").toUpperCase();
            }
        }
        return answer;
    }

    //  Need to practice, couldn't come up with own solution.
    //    4) *Challenge problem* Build a method to accept a string and parse it to an int
    //    without using library parse functions!
    public static int strToInteger(String str){
        if(str == null || str.trim().equals("")){
            return -1;
        }
        int answer = 0;

        for(int i = 0; i <str.length(); i++){
            // this checks whether the char is a digit so we know we're only converting numbers and not
            // any special chars or letters to numbers.
            if(Character.isDigit(str.charAt(i))){
                answer *= 10;
                // we're subtracting 48 because the numbers character start from 48 to 57 in the ascii table. So when
                // 0 char is converted to int it becomes 48, by subtracting 48 we get the exact number value.
                // So 1 char is 49 - 48 = 1, 3 char is 51 - 48 = 3 etc.
                answer += ((int)str.charAt(i)-48);
            }else {
                System.out.println("string cannot be parsed");
                return -1;
            }
        }
        return answer;
    }


    //    5) *Challenge problem* Build a method to accept 2 strings as param and check if
    //    first string content exists in another without using lib functionality
    public static boolean needleInHaystack(String needle, String haystack){
        if(needle == null || haystack == null || needle.trim().length() > haystack.length() || needle.trim().equals(
                "") || haystack.trim().equals("")){
            return false;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(needle.charAt(i) == haystack.charAt(i)){
                for(int j = i; j < needle.length()+i; j++){
                    if(needle.charAt(i) != haystack.charAt(i)){
                        break;
                    }
                    if((needle.length()+i - j) == 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}