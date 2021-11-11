//Simple programs to help learn return / looping / passing parameters / switch / if / continue (IMPORTANT):

// previous programs solved in Datatypes Folder (Questions repeated)
public class MethodTest{
	public static void main(String[] args){
		//
		System.out.println("3.)");
		printTables(62);

		System.out.println("4.)");
		printMultiples(5, 2);

		System.out.println("5.)");
		no11Multiples(52);

		System.out.println();
		System.out.println("6.)");
		daysInAMonth(3, 2012);

		System.out.println("7.)");
		ascendingNumberPattern(6);

		System.out.println("8.)");
		shamboOrGovinda(3);

		System.out.println("9.)");
		descendingNumberPattern(4);

		System.out.println("10.)");
		starPattern(5);

		System.out.println("11.)");
		allChars();
	}

	// 3.) Accept an int as input to a method named printTables(int num)
	//and then print the multiplication tables of the num from 1 to 10 to
	//monitor (see end of document for solution code).
	public static void printTables(int num){
		for(int i=1; i <= 10; i++){
			System.out.println(num * i);
		}
		System.out.println();
	}


	//4) Accept 2 ints in a method, print the multiplication tables of the
	//smaller number till the second number times (if 5,2 and given, print
	//2X1 till 2X5) => Print directly inside the method
	public static void printMultiples(int times, int num){
		for(int i=1; i <= times; i++){
			System.out.println(num * i);
		}
		System.out.println();
	}


	//5) Code a class named TestLoop with main(). Write the code to print
	//the following when executed:
	//12345678910
	//12131415161718192021
	//2223242526272829303132
	//33�
	//Print all numbers in 1 line till you get a multiple of 11. Then skip the
	//multiple of 11 and print the next set of numbers in next line.
	public static void no11Multiples(int num){
		for(int i=1; i <= num; i++){
			if(i % 11 != 0){
				System.out.print(i);
			} else{
				System.out.println();
			}

		}
		System.out.println();
	}


	//6) Write a method to take an int number and int year as input and
	//return number of days in that month as int. Which control statement
	//will you use to effectively reduce writing more conditional code?
	public static void daysInAMonth(int month, int year){
		// check year is multiple of 4 but not a decade start year (1100 etc.).
		boolean isLeapYear = false;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			isLeapYear = true;
		};

		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("There are 31 days in this month");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("There are 30 days in this month");
				break;
			case 2:
				if(isLeapYear){
					System.out.println("It is a Leap Year so there are 29 days in this month");
				}else {
					System.out.println("There are 28 days in this month");
				}
		}
		System.out.println();
	}


	//7) Print the following pattern in main() of a Test class using looping
	//control statements (Think: 5 lines you need to print and in each line
	//you need to print 1,2,3,4 and 5 values�how many loops do you
	//need? See code solution given in the last part of the document if
	//you do not get the answer to this)
	public static void ascendingNumberPattern(int rowsNColumns){
			for(int i = 1; i <= rowsNColumns; i++){
				for(int j = 1; j <= i; j++){
					System.out.print(j);
				}
				System.out.println();
        }
        System.out.println();
	}


	//8) Write a method to accept an int input. If the number is even, it
	//should print �shambo� the given number of times. If it is odd, it
	//should print �govinda� that many number of times
	public static void shamboOrGovinda(int num){
			for(int i = 1; i <= num; i++){
				if(num % 2 == 0){
					System.out.println("shambo");
				}else{
					System.out.println("govinda");
				}
			}
			System.out.println();
	}


	//9) Code a method to accept an int as input and print the following. If
	//the int num is 4, printed output should be
	//1234
	//123
	//12
	//1
	public static void descendingNumberPattern(int rowsNColumns){
		for(int i = rowsNColumns; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}


	//10) Print this pattern to monitor in main() [The stars are centered]
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	public static void starPattern(int rows){
		for (int i=0; i<rows; i++) {
			for (int j=rows-i; j>1; j--){
				System.out.print(" ");
			}

			for (int j=0; j<=i; j++ ){
				System.out.print("* ");
			}

			System.out.println(); //ending line after each row
        }
        System.out.println();
	}

	//11) Print all character symbols to monitor from 1 to 65535. You
	//should leave a space after each character symbol and if the numerical value is divisible by 5, you should skip to next number (which
	//control statement will help you to go to end of iteration?).
	public static void allChars(){
		for(char i = 0; i < Character.MAX_VALUE; i++){
			if( i % 5 != 0){
				System.out.print(i+" ");
			}
		}
	}

}