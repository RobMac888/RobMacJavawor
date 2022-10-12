package Polymorphism2;

public class Circle extends Shape{
	float radius;
	
	public Circle(String color, float radius ) {
		super(color);
		this.radius = radius;
	}
	public void calculateArea() {
		System.out.println("Area of "Color+" circle "+3.14*radius*radius);
		
	}

}
