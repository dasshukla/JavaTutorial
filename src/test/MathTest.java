package test;

import library.Conditions;
import library.Math;

public class MathTest {

	public static void main(String[] args) {

		//Instantiation

		Math m = new Math();

		//Addition
		System.out.println("\n ################# Addition ############## \n");
		int sum =	m.add(7, 9);
		System.out.println("The sum = "+ sum);	

		m.add(1, 3);
		m.add(12121, 1212123);
		m.add(0, 2312312);
		m.add(34324234, 1312312);
		m.add(-123123, 3423423);
		m.add(-3233424, -34345345);

		//Difference
		System.out.println("\n ################# Difference ############## \n");

		m.subtract(5, 6);
		m.subtract(23232, 3434);
		m.subtract(2232, 3434234);
		m.subtract(0, 343);
		m.subtract(-334, -343);

		//Product

		System.out.println("\n ################# Product ############## \n");

		m.product(1, 3);
		m.product(3, 6);
		m.product(343, 3434);
		m.product(232, -3434);
		m.product(-343, -3434);
		m.product(0, 3434);


		//Division

		System.out.println("\n ################# Division ############## \n");

		m.divide(4, 2);
		m.divide(344234, 34);
		m.divide(232, 12);
		m.divide(121, - 43);
		m.divide(0,23);
		//m.divide(343, 0);

		//Overloading method
		m.divide(25.5, 5.5);


		//Multiplication Table
		m.multiTable(25);
		m.multiTable(10, 10);

		//------------------------------------------------

		//Static calling (by class name)

		Conditions con= new Conditions();

		Math.moduloOfNumbers(6, 4);

		Conditions.maxMinOfNumber(128898, 128888);
		Conditions.maxMinNumbers(134.343, 454.454);
		Conditions.maxMinOfNumber(1, 1);



		con.weekDays(9);

		con.displayNumbers(1000);

		Conditions cond= new Conditions();
		int number1=5, number2=10, number3 = 15;

		cond.min(number1, number2);


		new Conditions().max(50, 457);//non-static calling

		cond.min(number1, number2, number3);

		new Conditions().max(15,20,50);
		cond.max(number1, number2, number3);


		String x = "A quick brown fox jumps over the lazy dog";
		m.perimeterOfTriangle(5, 7, 11);
		m.perimeterOfRectangle(9, 13);
		m.subtraction (30, 50);
		m.display(50);
		m.countLetters(x);

		m.simpleInterest();


	}

}
