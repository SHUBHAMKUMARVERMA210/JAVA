//PROGRAM FOR ABSTRACTION OR ABSTRACT CLASS

import java.util.*;

abstract class Vehical 
{
	abstract void get();
	abstract void show();
}

class Car extends Vehical
{
	Scanner sc=new Scanner(System.in);
	private long cost;
	private String name;

	void get()
	{
		System.out.print("\n\nEnter the name of car : ");
		name=sc.nextLine();
		System.out.print("Enter the cost of car : ");
		cost=sc.nextLong();
	}

	void show()
	{
		System.out.println("\nName of car is : "+name);
		System.out.println("Cost vo car is : "+cost);
	}
}

class Bike extends Vehical
{
	Scanner sc=new Scanner(System.in);
	private long cost;
	private String name;

	void get()
	{
		System.out.print("\n\nEnter the name of Bike : ");
		name=sc.nextLine();
		System.out.print("Enter the cost of Bike : ");
		cost=sc.nextLong();
	}

	void show()
	{
		System.out.println("\nName of bike is : "+name);
		System.out.println("Cost of bike is : "+cost);
	}

}

class ExAbstract
{
	public static void main(String arg[])
	{
		Vehical V;
		Car C=new Car();
		V=C;
		V.get();
		V.show();
		Bike B=new Bike();
		V=B;
		V.get();
		V.show();

	}
}
