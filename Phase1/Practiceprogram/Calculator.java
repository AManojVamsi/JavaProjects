package Practiceprogram;
import java.util.Scanner;

class Calc{
	
	int x,y;
	Calc(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	int add()
	{
		return x+y;
	}
	 int sub()
	 {
		 return x-y;
	 }
	 
	 int mul()
	 {
		 return x*y;
	 }
	 
	 int div()
	 {
		 return x/y;
	 }
}

public class Calculator
{
	public static void main(String[] args)
	{
		
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = ab.nextInt();
		System.out.println("Enter second number");
		int y = ab.nextInt();
		System.out.println("enter operator(+,-,*,/)");
		String op = ab.next();
		int z = 0;
		Calc c = new Calc(x,y);
		switch(op)
		{
		
		case "+":
			z = c.add();
			break;
				
		case "-":
			z = c.sub();
			break;
			
		case "*":
			z = c.mul();
			break;
			
		case "/":
			z = c.div();
			break;
			
			default:
				System.out.println("Invalid");
		}
		System.out.println("result is :" +z);
	}
}
