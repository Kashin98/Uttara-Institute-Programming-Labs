public class TestCow{
	public static void main(String[] args){
		//Testing
		Cow c1 = new Cow();
		c1.name = "Mary";
		c1.moo();

		Cow c2 = c1; // c2 reference var is now pointing to same object as c1. Any changes to c2 will affect the same object that c1 is pointing.
		c2.name = "Anne"; // name in Cow object is now Anne. Both c1 and c2 are both point to this same object.
		c1.moo(); // will print "Anne says moo!" because we changed name to anne.
	}

}