
public class TestCoin {
	
	public static void main (String [] args){
		
		Coin nickel = new Coin();
		
		for(int i = 0; i < 20; i++){
			nickel.toss();
			System.out.println(nickel.getSideUp());
		}
	}
}
