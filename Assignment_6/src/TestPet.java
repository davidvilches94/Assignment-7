import java.util.Scanner;
public class TestPet {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Pet P1 = new Pet();
		
		System.out.println("Enter the name of the pet: ");
		P1.name = input.next();
		
		System.out.println("Enter the type of pet: ");
		P1.type = input.next();
		
		System.out.println("Enter pet's age ");
		P1.age = input.nextInt();
		
		System.out.println(P1.getName());
		System.out.println(P1.getType());
		System.out.println(P1.getAge());
	}

}
