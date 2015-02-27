public class FindPi {
	
	public static void main (String [] args){
		
		double pi = 0;
		int counter =2500000;
		double denominator = 1;
		long start = System.currentTimeMillis();
		
		for (int x = 0; x < counter; x++){
			if(x%2 == 0){
				pi = pi + (1/denominator);
				}
			else
				pi = pi - (1/denominator);
			denominator += 2;
			}
		pi *= 4;
		
		
		long elapsedTimeMillies = System.currentTimeMillis() - start;
		float elapsedTimeSecs = elapsedTimeMillies/1000F;
		System.out.println("PI= " +pi+" after " +counter+" iterations");
		System.out.println("It took "+ elapsedTimeSecs+" seconds to complete this operation");
	}
	}


