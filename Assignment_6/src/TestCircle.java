import java.util.Scanner;
public class TestCircle {
	public static void main(String [] args){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		Circle C1 =  new Circle();
		System.out.print("Enter the radius of the circle: ");
		C1.radius = input.nextDouble();
		
		System.out.println("The radius of the ciricle is: " + C1.radius);
		
		System.out.println("The area of the circle is: " + C1.getArea());
		System.out.println("The diameter of the circle is: " + C1.getDiameter());
		System.out.println("The circumference of the circle is: " + C1.getCircumference());
	}

}
