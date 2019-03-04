package packagee;

public class Sirala {
 public static int Ai;
	public static void main(String[] args) {
			int A1 = 15;
			int A2= 4;
			int A3= 29;
			int min,max,orta;
			
			 
				if(A1<A2 && A1<A3){
					min=A1;
					System.out.println(min);
				}
				else if(A2<A1 && A2<A3){
					min=A2;
					System.out.println(min);
				}
				else if(A3<A1 && A3<A2){
					min=A3;
					System.out.println(min);
				}
				
				if(A1>A2 && A1>A3){
					max=A1;
					System.out.println(max);
				}
				else if(A2>A1 && A2>A3){
					max=A2;
					System.out.println(max);
				}
				else if(A3>A1 && A3>A2){
					max=A3;
					System.out.println(max);
				}
				
			
	}

}
