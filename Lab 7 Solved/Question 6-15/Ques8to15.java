import java.util.StringJoiner;

public class Ques8to15 {
    public static void main(String[] args) {
        System.out.println("Question-8");
        int num = 20;
        System.out.println(isRoot(num));
        System.out.println();


        System.out.println("Question-9");
        randomString();
        System.out.println();


        System.out.println("Question-10");
        short s = 34;
        long l = 34L;
        double d = 34.0;
        X x = new X();
        x.test(s);
        x.test(l);
        x.test(d);
        System.out.println();


        //11) WAP (directly in main()) to create an array of strings with 5 colors as values. Use
        //Math.random() to randomly print out 5 values from the array. [Do this if you have not
        //solved it already]
        System.out.println("Question-11");
        String[] arr = {"red", "green", "blue", "purple", "pink"};
        for (int i = 0; i < 4; i++){
            System.out.println(arr[(int)(Math.random()*5)]);
        }
        System.out.println();


        // Question 12
        System.out.println("Question-12");
        String str = "blah";
        str.toUpperCase();
        System.out.println(str); //"blah" is printed again because when we do string manipulation a new object is
        // created and it needs to be assigned to str var.
        str = " blah ";
        System.out.println(str.trim()); //after this, print its length.
        System.out.println(str.length());//the length will not reduce as str was not assigned the new object from trim()
        String s1 = new String("abc"); // 2 objects one in string pool and other in Heap Memory
        String s2 = new String("abc"); // only 1 object in Heap memory as "abc" object was created in string pool
        // previously
        System.out.println(s1==s2); // it is false since we're comparing address and s1, s2 have address of objects
        // created in heap and not string pool
        System.out.println(s1.equals(s2)); // it is true as this method checks state and not address.
        String s3 = "abc";
        System.out.println(s1==s3); // still false as one is in string pool and other is object in heap
        System.out.println(s1.equals(s3)); // true as the states are compared.
        String s4 = "abc";
        System.out.println(s3==s4); //true as these are both string literals & they both point to string object created
        // in string pool.
        System.out.println(s3.equals(s4)); // true again as it is state comparison
        System.out.println();


        System.out.println("Question-13");
        String str2 = "alphabet";
        System.out.println(vowelsInString(str2));
        System.out.println();

        System.out.println("Question-14");
        String needles = "ab";
        String haystack = "absentee about abhor abdomen";
        System.out.println(occurencesOfString(needles, haystack)); //4
        System.out.println();

        System.out.println("Question-15");
        String str3 = "abcde";
        System.out.println(charsToInteger(str3));
        System.out.println();

    }


    //        8) Test whether an int number has an int square root or not (Use Math class) Ex: 16
    //        square root is 4 which is an integer, 20 square root is 4.X which is not an int square root.
    public static boolean isRoot(int num){
        // casting down the double to int will give a whole number, now if we square that same number and see if it
        // matches the original passed argument, we can find out if the number is perfect square. This also works
        // well in preventing negative values returning true for square root.
        // This works because if the number is a perfect square then when we cast it to int it will still be a
        // perfect number.
        // EG: if 4.0 is casted to int it will still be 4, but 4.4 casted to int will not be the same value.
        int answer =(int) Math.sqrt(num);
        return Math.pow(answer, 2) == num;
    }


    //        9) WAP to generate 10 random strings with 6 length each with each containing random
    //        digits.
    public static void randomString(){
        for(int i = 0; i <10; i++){
            // Method 1 - Generates a string of numbers with length of 6
            // String answer = (int)((Math.random()+1)*Math.pow(10,5)) + "";

            // Method 2 - Generates a string of chars ranging between 0 - 1000 with length of 6
            String answer = "";
            for (int j = 0; j < 6; j++){
                answer += (char)(Math.random()*1000);
            }
            // an easy way to check that all strings are 6 length, some chars don't print
            System.out.println(answer.length());
            System.out.println(answer);
        }
    }

    //    13) Create a method to accept a string as parameter and return how many vowels
    //    are present in it.
    public static int vowelsInString(String str){
        if(str == null || str.trim().equals("")){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if(x == 'a' || x == 'e'||x == 'i'||x == 'o'||x == 'u'){
                count++;
            }
        }
        return count;
    }


    //   14) *Important repeat problem* Create a method to accept 2 strings and find
    //   number of occurrences of second string in first string and return the result.
    public static int occurencesOfString(String needles, String haystack){
        int occurences = 0;
        if(needles == null || haystack == null || needles.trim().equals("")||  haystack.trim().equals("")){
            return -1;
        }
        for(int i = 0; i< haystack.length() - needles.length(); i++){
            if(needles.equals(haystack.substring(i,i+needles.length()))){
                occurences++;
            }
        }
        return occurences;
    }

    //    15) *Important problem* Create a method to accept a string as parameter and
    //    return a new string with all the unicode int values with a dot delimiter. Ex: input is
    //    abd, output should be 97.98.100
    public static String charsToInteger(String str){
        if(str == null || str.trim().equals("")){
            return "";
        }
        char[] charArray = str.toCharArray();

        // Method 1 - using append() solution has trailing for leading ".";
//        StringBuffer sb = new StringBuffer("");
//        for(char x : charArray){
//            sb.append((int)x + "");
//            sb.append(".");
//        }
//        str = new String(sb);
//        return str;

        //Method 2 - using String Joiner, best answer
        StringJoiner sj = new StringJoiner(".");
        for (char x : charArray){
            sj.add((int) x + "");
        }
        return sj.toString();
    }
}

//10) Create the following static overloaded methods with simple SOPs in a class named X:
//test(long)
//test(double)
//test(short)
//Now try invoking the test() from main() by passing 5, 5.5, 5.5f,10L, a byte as parameter
//and understand which method body is being picked. Do you understand how the decision
//is made to pick which method body?
class X{
    // these are overloading methods, by changing just params list we overload a method, we can't change anything else.
    public void test(long x){
        System.out.println("long " + x);
    }
    public void test(double x){
        System.out.println("double " + x);
    }
    public void test(short x){
        System.out.println("short " + x);
    }
}