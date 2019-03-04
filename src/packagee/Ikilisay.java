package packagee;

import java.util.ArrayList;
import java.util.Scanner;

public class Ikilisay {
	
	static ArrayList<Integer> arraylist=new ArrayList<Integer>();
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		//int t=ikilikden(arraylist);
		//System.out.println(t);
		int b = s.nextInt();
		ArrayList<Integer> z=onluqdan(b);
		System.out.println(z);
		
	}
	
	
	public static int ikilikden(ArrayList<Integer> arlist){
		int topla=0;
		while(true){
			String abc=s.next();	
			if(abc.equals("quit"))
				break;
			int a = Integer.parseInt(abc);
			
				arlist.add(a);	
			
		}
		System.out.println(arlist);
			for(int i=0;i<arlist.size();i++){
			topla+=arlist.get(i)*Math.pow(2,arlist.size()-1-i);		
		}	
	
		return topla;
}
	public static ArrayList<Integer> onluqdan(int b){
		 ArrayList<Integer> arraylist2=new ArrayList<Integer>();
		 ArrayList<Integer> arraylist3=new ArrayList<Integer>();
		int k = 0;
		while(true){
		if(b==(1/2))
			
			break;
			
			
		 k=b/2;
		 arraylist2.add(b%2);
		b=k;
		
		}
		
		
		
		for(int i=arraylist2.size()-1;i>=0;i--){
			
				arraylist3.add(arraylist2.get(i));
		}
		return arraylist3;
	}
}
	
	
	
	