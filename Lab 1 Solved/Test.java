/* ) Create a class Test. Create a method named process that accepts an int as a
parameter. Create a main method. Create a int variable x with value 10. Print the value of
x to monitor using SOP. Then invoke process() and pass x as a parameter. Print the value
in process(). Change the value in process(). Print the value in main() after invoking
process(). Are you understanding the control flow? Are you understanding how parameters
are being passed? */

public class Test{
	public static void main(String[] args){
		int x = 10; // local variable's data is created and copied into stackframe Main.main()
		System.out.println(x);
		process(10); // process is passed deep copy of variable, JVM leave main() it will also remember which line it left main().
		System.out.println(x); // data is not altered
		char a = 'a';
		for(int i = 0; i <= 10; i++){
			a += 1;
			System.out.println(a);
		};

		int y = 1;
		while(y <= 10){
			y++;
			a += 1;
			System.out.println(a);
		};

		do{
			y++;
			a += 1;
			System.out.println(a);
		}while(y <= 20);

	}

	public static void process(int a){ // stackframe Main.process() is created in stack
		a = 20; // copied variable is altered
		System.out.println("process "+a); // copied variable printed
		x();
	} // method ends and stackframe Main.process is popped out, all data including copy a is deleted

	public static void x(){
		System.out.println("method x"); //can't use process local var a in another method. The var is local to the method it is initialized in.
		y();
	}

	public static void y(){
		System.out.println("method y");
		Test2.test();
	}
}

