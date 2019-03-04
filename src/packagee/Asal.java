package packagee;

import java.util.ArrayList;

public class Asal {
public static int i,n;
	public static void main(String[] args) {
		 int topla = 0;
		int [] massiv =new int [1000];
		for(int i=2;i<1000;i++){
			massiv[i]=1;
		}
			Boolean asaldi;
			for (i = 2; i < 1000; i++) {
			    asaldi = true;
				for (int j = 1; j < i; j++) {		
					if (i%j==0 && i!=j && j!=1) {
						asaldi=false;
						break;
					}
				}
				if (asaldi) {
					for(int n=i*2;n<1000;n+=i){
						massiv[n]=0; 	
					}
				}
			}
			
			for (int j = 0; j < massiv.length; j++) {
				System.out.println(j + " - " + massiv[j]);
			}
			     
		
	
		
		
		
		}
		
			
		
		
	}


