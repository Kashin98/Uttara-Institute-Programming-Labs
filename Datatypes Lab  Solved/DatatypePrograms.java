 public class DatatypePrograms{

	 public static void main(String[] args){

		 	//1.) WAP to assign an Hex value to an int and see the result similarly check it for Octal ?
			int hex = 0X5403;
			int octal = 073;
			System.out.println("Hex and Octal Check");
			System.out.println(hex+" "+octal);
			System.out.println();


			//2.) WAP to add two int values and see the result ?
			System.out.println("Adding two integers");
			System.out.println(3 + 4);
			System.out.println();


			//3.) WAP add byte value and with no. 10 and see the result ?
			byte byteValue1 = 2;
			System.out.println("Adding byte to 10");
			System.out.println((byteValue1 + 10)); // result is implicitily upcasted to int.
			System.out.println();



			//4.) WAP to add byte and short value then assign the output value to short and see the result ?
			short shortValue1 = 3;
			short shortResultWAP4 = (short) (shortValue1 + byteValue1); // result is implicitily upcasted to int and can't be assigned to short resulting in Compile Error.
			//Cast whole result to short as casting only operand will still return int result
			System.out.println("Adding byte to short and assigning to short");
			System.out.println((shortResultWAP4));
			System.out.println();



			//20.) WAP to assign a Maximum long(data type) value to float and see the result ?
			float floatValue1 = Float.MAX_VALUE; // Float.MAX_VALUE assigns the maximum value a float can hold.
			System.out.println("Assign max float value to float datatype");
			System.out.println((floatValue1));
			System.out.println();


			//21.) WAP to subtract two int values and see the result ?
			System.out.println("Substracting two integers");
			System.out.println(5 - 5); // overflow possible with int + int
			System.out.println();


			//22.) WAP to Multiply two int values and see the result ?
			System.out.println("Multiplying two integers");
			System.out.println(35 * 5); // overflow possible with int + int
			System.out.println();


			//23.) WAP to Divide two int values and get the output of remainder and quotient ?
			System.out.println("Dividing two integers");
			System.out.println(5 / 5);
			System.out.println();


			System.out.println("Checking o/p of code");
			//27.) Execute the code given below and check the o/p ?
			System.out.println(1+2*5/2-2*4); //Precdence order / * + -
			System.out.println(1*2*5-2+24);	//Precdence order * + -
			System.out.println(1+2/5/2/2-4); //Precdence order / + -
			System.out.println();


			//28.) Execute the code given below and check the o/p ?
			System.out.println(10);
			System.out.println(012); //Converted from octal to decimal form
			System.out.println(0xAB); //Converted from hex to decimal form
			System.out.println();


			//33.) Execute the code given below and check the o/p ?
		    int x = 10;
			int y = 6;
			System.out.println(x | y); // bitwise OR causes bits to be altered like 1010 | 0110 = 1110 (14)

			int a = 100;
			int b = 50;
	    	System.out.println(a | b); // bitwise OR causes bits to be altered like 1100100 | 0110010 = 1110110 (118)
	    	System.out.println(); //Remember 1|1, 1|0, 0|1 = 1 and 0|0 = 0 for OR.


			//34.)Execute the code given below and check the o/p ?
			int x2 = 10;
			int y2 = 6;
			System.out.println(x2 & y2); // bitwise AND causes bits to be altered like 1010 | 0110 = 0010 (2)

			int a2 = 100;
			int b2 = 50;
	    	System.out.println(a2 & b2); // bitwise AND causes bits to be altered like 1100100 | 0110010 = 0100000 (32)
			System.out.println(); //Remember 1|1 = 1 and 1|0, 0|1, 0|0 = 0 for AND.


			//34.)Execute the code given below and check the o/p ?
			int x3 = 10;
			int y3 = 6;
			System.out.println(x3 ^ y3); // bitwise AND causes bits to be altered like 1010 | 0110 = 1100 (12)

			int a3 = 100;
			int b3 = 50;
	    	System.out.println(a3 ^ b3); // bitwise AND causes bits to be altered like 1100100 | 0110010 = 1010110 (86)
			System.out.println(); //Remember 1|1, 0|0 = 0 and 1|0, 0|1 = 1 for XOR.


			//Execute the code given below and check the o/p ?
			int x5 = 10;
			System.out.println(x5 >>> 2); // bitwise unsigned right shift so 1010 >>> 2 = 000...0010 (2);

			int a5 = -10;
			System.out.println(a5 >>> 2); // bitwise unsigned right shift so 1010 >>> 2 = 0011...0001 (1073741809);
        	System.out.println(); // bitwise unsigned right shift adds 0 to MSB and doesn't check previous signed bit

			//37.) Execute the code given below and check the o/p ?
			System.out.println(4 | 3); // 0111 (7)
			System.out.println(4 | 4); // 0100 (4)
			System.out.println(4 & 3); // 0000 (0)
			System.out.println(4 / 3); // int result so result is rounded down to 1


			//42.) Execute the code given below and check the o/p ?
			// Ternary operator syntax and working is
			// (cond exp) ? x : y => meaning if cond exp is true, x is
			// returned else y.
			// Check the working of it:
			System.out.println(1==1 ? 5 : 6); // 5
			System.out.println(1==2 ? 5 : 6); // 6
			System.out.println(1==1 ? true : false); // true
			System.out.println(1==2 ? false : true); // true
			System.out.println( true ? false : true); // false
			System.out.println( true ? true: false); // true

			char x6 = 'X';
			byte i6 = 0;
			System.out.println(true ? x6 : 0);
			System.out.println(false ? i6 : x); // why 88 int result ?


			//43.) Execute the code given below and check the o/p ?
			int i7 = 0;
			boolean t = true;
			boolean f = false, b7;
			b7 = (t & ((i7++) == 0)); // true because ++ causes i2 to increase by 1 the next time i2 is accessed so it is
			// still 0
			b7 = (f & ((i7+=2) > 0)); // false
			System.out.println(i7); // i7 = 3 (i2++, i2+=2)


			//47.) Execute the code given below and check the o/p ?
			int i8 = 50;
			while(i8 != 0){
				System.out.println(i8 >>>= 1); //bit shifted value is assigned to i3
			}
			// i>>>=1 => i = i >>> 1. Do you understand working of this?


			//48.) Execute the code given below and check the o/p ?
			int i9 = 55;
			int j = 55;
			while(i9 <= j && j<=i9 & i9==j){ // all conditions evaluate true
			System.out.println("Abc"); // infinite loop
			break;
			}

			//        49.) WAP to find the Area of circle ?

			        System.out.println(areaOfCircle(15));
			//
			//        50.) WAP to find the Area of Rectangle ?
			//
			        System.out.println(areaOfRectangle(15, 30));

			//        51.) WAP to find the Area of Square ?

			        System.out.println(areaOfSquare(15));

			//        52.) WAP to find the Area of Triangle ?

			        System.out.println(areaOfTriangle(15, 15));
			//
			//        53.) WAP to find the Perimeter of circle ?

			        System.out.println(perimeterOfCircle( 15));
			//
			//        54.) WAP to find the value of Simple Interest ?

			        System.out.println(simpleInterest(1000, 15));
			//
			//        55.) WAP to find the power of two no's ?

			        powerOf(20, 30);
			//
			//        56.) WAP to find the cube of two no's ?

			        cubeOf(20, 30);
			//
			//        57.) WAP to check whether the triangle is equilateral triangle or not ?

			        isTriangleEquilateral(30, 30, 30);
			//
			//        58.) WAP to find the average of given 10 numbers ?

			        average10(30, 30, 30, 1, 2, 12, 3, 1, 23, 1);
	}

	public static double areaOfCircle(double radius){
		return Math.PI * (radius * radius);
	}

	public static long areaOfRectangle(int length, int breadth ){
		return (long)length * breadth; // operand casting to prevent int + int possible overflow.
	}

	public static long areaOfSquare(int length ){
		return (long)length * length;
	}

	public static long areaOfTriangle(int height, int base ){
		return ((long)base * height)/2;
	}

	public static double perimeterOfCircle(double radius){
		return 2 * Math.PI * radius;
	}

	public static double simpleInterest(int amount, double interest){
		return amount + (amount * (interest/100));
	}

	public static void powerOf(int x, int y){
		System.out.println(((long)x * x)+" "+((long)y * y));
	}

	public static void cubeOf(int x, int y){
		System.out.println(((long)x * x * x)+" "+((long)y * y * x));
	}

	public static void isTriangleEquilateral(int l1, int l2, int l3){
		if(l1 == l2 && l2 == l3){
			System.out.println("Triangle is equilateral");
		}else {
			System.out.println("Triangle is not equilateral");
		}
	}

	public static void average10(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10){
		System.out.println(((long)x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10);
    }

 }