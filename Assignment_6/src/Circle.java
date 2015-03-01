public class Circle {
	
	final double PI = 3.141159;
	double radius;
	public double getRadius(){
	    
	return radius;
	}
	
	public double getArea(){
	    double area = PI * radius * radius;
	
	return area;
	}
	
	public double getDiameter(){
		double diameter = radius*2;
	
	return diameter;
	}
	
	public double getCircumference(){
		double circumference = 2* PI * radius;
		
	return circumference;
	}
	
	
	
		
}
