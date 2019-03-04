package packagee;

import java.util.Scanner;

public class Nimune2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int topla=0;
	   
	    while(true){
	    	 int a=s.nextInt();
	    	  if(a==0)
	    		break;
	    	topla=topla+a;
	    	
	    }
	  System.out.println(topla);
	  System.out.println("####3");
	  String b=s.next();
	   if(b.length()>7){
		   System.out.println("adiniz uzundur"+b);
	   }
	   else 
		   System.out.println("adiniz normaldir"+b);

}
	
}