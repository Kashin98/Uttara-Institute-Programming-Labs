public class TestWrapper
{
	public static void main(String[] args)
	{
		String s = "10";
		// int n = (int) s; //will this work? why not?
		int num = Integer.parseInt(s);
		double d = Double.parseDouble(s);
		System.out.println("num = "+num+" d = "+d);
		
		//how to convert primitive to String?
		String s1 = num + ""; //remember "" is empty string
		// and " " is string with space
		String s2 = String.valueOf(num); //static method
		String s3 = String.valueOf(d); 
		System.out.println("s1 = "+s1+" s2 = "+s2+" s3 = "+s3);
		//What does String.valueOf(..) method take as input.
		//Read its javadoc
		
		//We have not discussed this wrapper in class but 
		//go through the below code to understand how 
		//it works...
		
		String val = "abc123AXY !@#";
		
		for (int i = 0 ; i < val.length() ; i++)
		{
			char c = val.charAt(i);
			//how to get to know more about characters?
			//like is it in uppercase / digit / letter, etc?
			//for this we use Character wrapper class static methods
			if(Character.isUpperCase(c))
				System.out.println(c+" is in uppercase");
			else
				System.out.println(c+" is not in uppercase");
			
			if(Character.isDigit(c))
				System.out.println(c+" is a digit");
			if(Character.isLetter(c))
				System.out.println(c+" is a letter");
		
			if(Character.isUpperCase(c))
				System.out.println(Character.toLowerCase(c) +" is the lowercase of "+c);
		}
		
		
		
	}
}	
