public class Ques1 {
    public static void main(String[] args) {
        String s1 = "kashin"; // created in string pool only
        String s2 = new String("kashin"); // creates object in heap memory outside string pool and points to object
        // in string pool if already created there, or creates one object in string pool as well.
        compareStrings(s1,s2);
    }

    public static void compareStrings(String s1, String s2){
        System.out.println("Equals() method answer = " + s1.equals(s2));
        System.out.println("== operator answer = " + (s1 == s2));
    }
}