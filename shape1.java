import java.util.Scanner;

abstract class Shape1
{
	Scanner KB=new Scanner(System.in);
	abstract void getDimensions();
	abstract void showArea();
}

class Reactangle extends Shape1
{
	private double length, breadth;
	void getDimensions()
	{  	
		System.out.println("Enter Length of Rectangle");
		length=KB.nextDouble();
		System.out.println("Enter Breadth of Rectangle");
		breadth=KB.nextDouble();
	}

	void showArea()
	{
		System.out.println("Length of Reactangle:"+length);
		System.out.println("Breadth of Reactangle:"+breadth);
		System.out.println("Area of the Rectangle is:"+length*breadth);
	}
}

class Circle extends Shape1
{
	private double radius;
	void getDimensions()
	{		
		System.out.println("Enter Radius of Circle");
		radius=KB.nextDouble();
	}
	void showArea()
	{		
		System.out.println("Radius of the Circle is:"+radius);
		System.out.println("Area of Circle :"+3.14*radius*radius);	
	}
}

class Triangle extends Shape1
{
	private double baselength, height;
	void getDimensions()
	{
		System.out.println("Enter Base Length of Triangle");
		baselength=KB.nextDouble();
		System.out.println("Enter height of Triangle");
		height=KB.nextDouble();
	}

	void showArea()
	{
		System.out.println("Base Length of Triangle:"+baselength);
		System.out.println("Height of Triangle:"+height);
		System.out.println("Area of the Rectangle is:"+0.5*baselength*height);			
	}
	
	
}

class DMDShape
{
	public static void main(String args[])
	{
		Shape1 S;//will not be instantiated
		Reactangle R=new Reactangle();
		S=R;
		S.getDimensions();
		S.showArea();
		Circle C=new Circle();
		S=C;
		S.getDimensions();
		S.showArea();
		Triangle T=new Triangle();
		S=T;
		S.getDimensions();
		S.showArea();
		
	}	
}