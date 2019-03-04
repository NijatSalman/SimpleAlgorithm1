package packagee;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		ArrayList<Integer> arraylist2=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
        arraylist.add(i);
		} 
		System.out.println(arraylist);
	   
		
		System.out.println("3eded silin:3 cu ve 4 cunun yerini deyisin");
		int a=arraylist.size();
		for(int n=a;n>a-3;n--){
			
			arraylist.remove(new Integer (s.nextInt())); 
		}
		System.out.println(arraylist);
		for(int k=0;k<arraylist.size();k++){
			if(k==2){
				arraylist2.add(arraylist.get(3));
			}
			if(k==4){
				
			}
			
		    arraylist2.add(arraylist.get(k));
		} 
		System.out.println(arraylist2);
	}
  
}
