package packagee;

public class Pi2 {
static int m=3,f=5,n=4;
static double z, b=0,k=0;
	public static void main(String[] args) {
		for(int i=1;i<=999;i++){
			if(i%2!=0){
				b=b+(double)n/m;
				m+=4;
			}}
			for(int l=1;l<=999;l++){
				if(l%2!=0){
					k=k+(double)n/f;
					f+=4;
				}
			}
			z=n-b+k;
			System.out.println("qwertyu"+z);
		

	}

}
