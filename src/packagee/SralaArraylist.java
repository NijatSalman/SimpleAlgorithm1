package packagee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SralaArraylist {
static int enkicik;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
	   System.out.println("eded daxil et");	
	   
	   ArrayList<Integer> array1=new ArrayList<Integer>();
	   ArrayList<Integer> array2=new ArrayList<Integer>();
	
	   array1.add(15);
	   array1.add(18);
	   array1.add(17);
	   array1.add(16);
	   array1.add(19);
	   array1.add(5);
	   array1.add(1);
	   System.out.println("qwerty"+array1);
	  
	   
	   int size = array1.size();
	   
	  for(int i=0;i<size;i++){
		  int enkicik=Integer.MAX_VALUE;  
	   for (Integer item : array1) {
		if(item<enkicik){
				enkicik=item;
		}
		 
	   }
	   System.out.println(enkicik);
      array1.remove(new Integer(enkicik));
      array2.add(new Integer(enkicik));
      
	  }
	  System.out.println("en kicik ededd"+enkicik);
	  System.out.println(array2);
}
}
