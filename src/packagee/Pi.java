package packagee;

public class Pi {
	
static double result =4;
static int counter =3;
	public static void main(String[] args) {
		for(int i=1;i<=999999999;i++){
			
			if (i%2!=0) {
				result=result-(double) 4/counter;
				
			}else {
				result=result+(double) 4/counter;
			
			}
			counter += 2;
			}

			
		System.out.println(result);
	}

}
