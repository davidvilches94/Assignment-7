
public class Coin {
	
private String sideUp;

Coin(){
	toss();
}

void toss(){
	double prob = Math.random();
	if(prob > 0.4)
		sideUp = "heads";
	else
		sideUp = "tails";
}
	String getSideUp(){
		return sideUp;
	}
	
}
	
	
		
		
	
