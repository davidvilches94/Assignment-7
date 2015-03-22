// Do not copy or give out code to another student again.
public class Coin {
	
private String sideUp;

Coin(){
	toss();
}

void toss(){
	double prob = Math.random();
	if(prob > 0.4) //this is not correct. It will give 60% heads, 40% tails.
		sideUp = "heads";
	else
		sideUp = "tails";
}
	String getSideUp(){
		return sideUp;
	}
	
}
	
	
		
		
	
