package packagee;
import java.util.Scanner;

public class Texmini4 {
	 static int z, n=2;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eded daxil et");
		int b=s.nextInt();
		
		int addimsayi=hesabla(b);
		System.out.println("qwerty"+addimsayi);
		int tutdugum=s.nextInt();
       // for(int i=0;i<=addimsayi;i++){
        if(b/2==tutdugum){
        	System.out.println("hemin eded1"+tutdugum);
        }
        
        
        
        else if(b/2<tutdugum){
        	System.out.println("hemin eded daha boyukdur");
        	while (true){
        		
        		
        	}	
        }
        
        
        
        
        else{
        	System.out.println("hemin eded daha kicikdir");
        	while(true){
        	if(b/(2*n)==tutdugum){
        		System.out.println("hemin eded2"+tutdugum);
        	}
        	else if (b/(2*n)<1){
        		
        	}
        	break;
        	}
        	for(int k=b/(2*n);k<b/2;k++){
        		if(k==tutdugum){System.out.println("hemin eded3"+"  "+tutdugum);
        	}
        		}
        } 
        
        
        
        
        }
       

	public static int hesabla(int a){
	
		 for(int x=0;x<Integer.MAX_VALUE;x++){
		if(Math.pow(2,x)>a){
			return x;
		}
	}
		 return 0;	
	}
	
	public static int bol(int b,int q){
		for(int i=0;i<=b;i++){
		  z=(b+q)/2;
	}
		    return z;
	}
      
}
