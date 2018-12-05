package library;

public class Math {
	
	//Default Constructor
	
	public Math(){
		System.out.println("This is a default constructor!");
	}

	// User-defined functions

	// Addition

	public int add(int a, int b){

		int c = a + b; 
		System.out.println("The sum of "+ a + " and "+b + " = "+c);
		return c;

	}




	// Difference

	public int subtract(int a, int b){

		int c = a - b; 
		System.out.println("The difference of "+ a + " and "+b + " = "+c);
		return c;

	}

	// Product

	public int product ( int a, int b){
		int c = a*b;
		System.out.println("The product of "+a + " and "+ b + " = "+ c);
		return c;
	}


	// Division

	public int divide ( int a, int b){
		int c = a/b;
		System.out.println("The quotient when "+a + " is divided by "+ b + " = "+ c);
		return c;
	}
	
	
// Polymorphism (Overloading)
	public double divide(double m, double n)
	{
		double quotient;
		quotient=m/n;
		System.out.println("The result of dividing "+ m +" and "+ n +" is "+ quotient);
		return quotient;
	}
	
	
	//Static function
	
		public static int moduloOfNumbers (int a, int b){
			System.out.println("Remainder of two numbers when they are divided in that order = "+a%b);

			return a%b;
	}

	// Multiplication Table

	public void multiTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "*" + i+" = " +(n*i));  
		}
	}

	//Multiple multiplication tables
	public void multiTable(int maxNumberForTable, int tableLines)
	{
		for(int i=1;i<=maxNumberForTable;i++)
		{
			for (int j=1;j<=tableLines;j++)
			{ 
				System.out.print(" "+i*j);
			}
			System.out.println();    
		}

	}
	
	public static int subtraction(int x, int y)
	{
		int diff;
		if (x>y)
			diff=x-y;
		else
			diff=y-x; 


	System.out.println("the difference of two numbers is "  +diff);
	return diff;

	
	}
		
		public static int min(int x, int y){
			
			if(x<y)
				return x;
			else
				return y;
			
		}
		
		
		public static int perimeterOfTriangle(int a, int b, int c)
		{
			int perimeter=a+b+c;
			System.out.println("the value of the perimeter of Triangle is:" +perimeter);
			return perimeter;

		}
		public static int perimeterOfRectangle(int l, int w)
		{
			int perimeter= 2*(l+w);
			System.out.println("the value of the perimeter of rectangle is:" +perimeter);
			return perimeter;

		}

	
		
		public static void display(int maxnum){
			for (int i=1; i<=maxnum; i++){
				if(i%3==0 && i%5==0)
					System.out.println("DingDong");
				else if(i%3==0)
				System.out.println("Ding");
				else if(i%5==0)
					System.out.println("Dong");
				
				else System.out.println(i);
			}
		}
		
		/*	Write a java program which will count the number 
		of vowels, consonants, digits, tabs and blank spaces from 
		a string “We appreciate your interest
		in employment at Infosys”.*/
		
		public static void countLetters(String x){
		int vowels = 0;
		int consonents = 0;

		x=x.toLowerCase();
		for(int i=0; i<x.length(); i++){
			char ch = x.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
				vowels= vowels +1;
			else if(x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' ||x.charAt(i)=='u')
				consonents++;
		}


		System.out.println("vowels = "+vowels);
			
			
			
		}
		
		 public float simpleInterest()
		    {
		        // initialise instance variables
		       int p=1000,r=8,t=2;
		       float value;     
		       value=(p*r*t)/100;
		       System.out.println("The rate of interest is " +value);
		       return value;
		    }

}
