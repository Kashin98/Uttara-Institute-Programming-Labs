public class TestMath
{
	public static void main(String[] args)
	{
		double x = 140;
		double res = Math.sqrt(x);
		System.out.println("sqrt of "+x+" = "+res);
		res = Math.cbrt(x);
		System.out.println("cbrt of "+x+" = "+res);
		x = 5.6;
		res = Math.round(x);
		System.out.println("round of "+x+" = "+res);
		res = Math.floor(x);
		System.out.println("floor of "+x+" = "+res);
		x = 5.1;
		res = Math.ceil(x);
		System.out.println("ceil of "+x+" = "+res);
		x = Math.random(); 
		//random() returns double random value between 0 - 1 as a decimal
		System.out.println("x = "+x);

		int y;
		// generate random int values between 1 - 100
		for(int i = 0 ; i < 10 ; i++)
		{
			y = (int) (Math.random() * 100); // 0 - 1
			// to get random int value, downcast
			System.out.println("random "+y);
		}
		
	}
}






