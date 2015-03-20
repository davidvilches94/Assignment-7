
public class Fan {

	int speed;
	boolean fanstatus = false;
	double radius = 5;
	String color = "yellow";
	
	public Fan(){
		
	}
	public Fan(int Speed,boolean fanstat,double rad,String Color){
		
		speed = Speed;
		fanstatus = fanstat;
		radius = rad;
		color = Color;
	}
	public String toString(){
		
		return "\n" + speed + "\n" + fanstatus + "\n" + radius + "\n" + color;
		
	}
}
