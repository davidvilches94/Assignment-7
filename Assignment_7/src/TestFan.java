import java.util.Scanner;
public class TestFan {

	public static void main(String [] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Fan f = new Fan();
		System.out.print("Enter the speed of the fan: ");
		f.speed = input.nextInt();
		
		System.out.print("Enter the radius of the fan: ");
		f.radius = input.nextInt();
		
		System.out.print("Is the fan on? (T or F) ");
		f.fanstatus = input.nextBoolean();
		
		System.out.print("Enter the color of the fan ");
		f.color = input.next();
		
		System.out.println("Fan description: " + f.toString());
	
		
	}
}
