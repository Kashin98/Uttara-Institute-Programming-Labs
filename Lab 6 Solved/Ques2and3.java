public class Ques2and3{

	public static void main(String[] args) {
//        2) Create 2 strings as literals with same state and check this:
		//String s1 = "abc";
		//String s2 = "abc";
		//System.out.println(s1==s2);
		//Then create a string object using String s3 = new String("abc") and
		//check s1 == s3. Why are you getting true and false as result? Do you
		//understand?
		//Now check s1.equals(s3) and print the result. What are you getting and
		//why?.

		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2); // we get true because string literals are created in the String pool of Heap
		// memory and where JVM first checks if a string literal with same state was created previously and if it was
		// it just references that same object instead of creating a new object. If it doesn't find any matches, it
		// creates the object in the string pool and keeps it there till it is completely de-referenced and collected
		// eventually by the GC. It is not immediately collected, it is just eligible for collection.
		// So, we have two references vars pointing to the same object in the string pool, thus true.

		String s3 = new String("abc");
		System.out.println(s1==s3); // we get false because when an object is created using new String() method the
		// JVM first checks the string pool to see if same state object was created previously if it was, it will
		// take that string pool object and create another object with same state but it will create it
		// directly in heap memory and not the string pool. This causes 1 extra object to be always created which is
		// just memory wastage, it can also create 2 objects if the string pool doesn't have a previous created
		// string object with same state.
		// So, we have one string s1 pointing to an object in string pool and s3 pointing to object created in Heap
		// memory.

		System.out.println(s1.equals(s3)); // true, because equals() method always checks state, while == checks
		// address of objects.






//        3) String s1 = "happynew”;
		// s1.concat("year”);
		// System.out.println(s1); // what is printed? why?
		// Create StringBuilder sb = new StringBuilder(); Test working of
		// sb.append(“abc”), sb.reverse(), sb.toString(), sb.replace() methods

		String s4 = "happynew";
		s4.concat("year");
		System.out.println(s4); // happynew is printed as we're concatenating two strings but the new object created
		// from this manipulation is not stored on new reference var.

		StringBuilder sb = new StringBuilder("Hello"); // THIS IS not the same datatype as string.
		sb.append("abc"); // string becomes "Helloabc", append adds the string to end of stringbuilder.
		sb.reverse(); // reverses all the values in string to become "cbaolleH";
		sb.replace(0, 3, "abc"); // it was "cbaelleH" before, now it will be "abcolleH"
		s1 = sb.toString(); // this converts StringBuilder to string class, needs to be assigned to a reference var
		// as a new string class is created.
		System.out.println(s1);
    }

}