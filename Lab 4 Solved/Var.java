public class Var{
	public static String instStr;
	public static int instInt;
	public static boolean instBool;

	public void test(){
		// can't access local vars without initialization, no default values are assigned to them.
		String locStr;
		int locInt;
		boolean locBool;

		//instance vars and static vars both can be assigned default values as long as they're String, int and boolean.
		System.out.println(instStr + " " + instInt + " " + instBool + " - Instance Vars");

		//System.out.println(locStr + " " + locInt + " " + locBool + " - Local Vars");



	}

}