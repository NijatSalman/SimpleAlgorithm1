package packagee;

public class Asal1 {

	public static void main(String[] args) {
		
		Boolean asaldi;
		
		for (int i = 2; i < 1000; i++) {
		    asaldi = true;
			for (int j = 1; j < i; j++) {		
				if (i%j==0 && i!=j && j!=1) {
					asaldi=false;
					break;
				}
			}
			if (asaldi) 
				System.out.println(i);	
			

		}
		
	}

}
