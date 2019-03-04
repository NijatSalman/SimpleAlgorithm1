package packagee;
import java.util.Scanner;
public class Texmini5 {
 public static int z;
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("EDED DAXIL ET");
        int b=s.nextInt();
        int addimsayi=hesabla(b);
        System.out.println("addim sayi"+"-"+addimsayi);
        int tutdugum=s.nextInt();
      
        if(bol(1,b)==tutdugum){
        	System.out.println("hemin eded1"+" "+tutdugum);
        }
        else if (bol(1,b)>tutdugum){
        	System.out.println("asagi hissseni yoxlamaq");
        	while(true){
        	
        	}
        }
        
        
	}


 public static int bol(int q,int w){
	    z=(q+w)/2;
 
       return z;
 }
 
 public static int hesabla(int a){
	
	 for(int x=0;x<Integer.MAX_VALUE;x++){
	if(Math.pow(2,x)>a){
		return x;
	}
}
	 return 0;	
}
 
 
}