// class should have the same name as .java file (else Compile Error). If so, JVM enters class and looks for main method.
public class Hello{

	// main method should be public static void main(String[] args). JVM will then enter method and create Main.main() stackframe in stack memory.
	public static void main(String[] args){

		//JVM prints String object to screen and exits out of main method
		System.out.println("HelloHai");
	}

	//once JVM is outside main method the stackframe Main.main() will be popped and JVM will end program execution.

}