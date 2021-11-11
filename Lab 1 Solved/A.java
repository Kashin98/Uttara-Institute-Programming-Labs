public class A{
	public static void main(String[] args){
		//int i;  initialization error
		byte b = 100;
		b = -128;
		System.out.println(b);

		int x = Integer.MAX_VALUE;
		int y = 4;
		int result1 = x + y;
		int result2 = x * y;
		int result3 = x / y;
		int result4 = x % y;
		int result5 = x - y;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

		System.out.println("1"+2+3); // 123 Read expression left to right but operations from right to left.
		System.out.println(6+2+"4"); // 84
		System.out.println('2'+2+"2"); // '2' is char and it is converted to int result so it is 50 + 2 + "2" = 522
		System.out.println("2"+'2'+2);
		System.out.println('2'+2);



	}
}

 class B{
	public static void main(String[] args){
			System.out.println("This is class B");
	}

}

 class C{
	public static void main(String[] args){
			System.out.println("This is class C");
	}
}

