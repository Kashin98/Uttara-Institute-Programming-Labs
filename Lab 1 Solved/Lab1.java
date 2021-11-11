public class Lab1{
	public static void main(String[] args){

		//1) Build a HelloWorld program
		System.out.println("Hello World");


		//2) Print HelloWorld 10 times to the monitor
		for (int i=0; i<10; i++){
			System.out.println("Hello World");
		}


		//3) Print Hello with number (as Hello1, Hello2, Hello3...till Hello10) to the monitor
		for(int i = 1; i < 11; i++){
			System.out.println("Hello" + i);
        };


        //4) Print 1 to 10 to the monitor using for, while, do..while
        // for loop
		for(int i = 1; i < 11; i++){
		            System.out.println(i);
        };

		// while loop
        int x1 = 1;
		        while(x1 < 11){
		            System.out.println(x1);
		            x1++;
        };

        //do while loop
		do{
				System.out.println(x1);
				x1++;
        }while(x1 < 11);


        //5) Print all odd numbers from 1 to 100 to the monitor
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}


		//6) Print all even numbers from 1 to 100 to the monitor
		for(int i = 1; i <= 100; i++){
		            if(i % 2 == 0){
		                System.out.println(i);
		            }
        }


        //7) Print all non multiples of 3 between 1 to 100 to the monitor
        for(int i = 1; i <= 100; i++){
		            if(i % 3 != 0){
		                System.out.println(i);
		            }
        }


        //8) Print "even" and the number or "odd" and the number between 1-100
		for(int i = 1; i <= 100; i++){
		            if(i % 2 == 0){
		                System.out.println(i + " even");
		            }else{
		                System.out.println(i + " odd");
		            }
        }


        //9) Print "divisible" and the number if the num is divisible by 3 or 5 and not both between
        for(int i = 1; i <= 100; i++){
		            if((i % 3 == 0) ^ (i % 5 == 0) ){
		                System.out.println(i + " divisible");
		            }
        }


		//11) WAP to Divide any two int values and get the output of remainder and quotient?
        int num1 = 10;
		int num2 = 30;
		System.out.println(10%30);
        System.out.println(10.0/30);

		//12) Create a byte variable with value 127. Add 10 to it and store in byte. Print the result. Is
		//the result correct? Why not?
		byte byte12 = 127;
		System.out.println(byte12+10); // answer is -118 because overflow occurs


		// Q-13 to 23 are copy paste code, solved on paper
	}
}