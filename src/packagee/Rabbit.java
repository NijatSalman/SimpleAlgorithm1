package packagee;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit {

	public static void main(String[] args) {
		Random random=new Random();
		ArrayList<Integer> arraytor=new ArrayList<Integer>();
		ArrayList<Integer> arrayrabbit=new ArrayList<Integer>();
		
	    while(true){
	    	int a=(int)(Math.random()*10);
	    	if(arraytor.size()>=70){
	    		System.out.println("tortoise qazandi");
	    		break;
	    	}
	    	
	    	
	    	if(arrayrabbit.size()>=70){
	    		System.out.println("rabbit qazandi");
	    		break;
	    	}
	    	
	    	if(a<6){
	    		for(int i=1;i<=3;i++){
	    			if(i<3){
	    		arraytor.add(0);
	    			}
	    			else
	    				arraytor.add(1);
	    		}
	    	}
	    		if(a>5 && a<8){
	    			for(int i=1;i<6;i++){
	    				//arraytor.remove(i);
	    			}
	    		}
	    		
	    			if(a>7 && a<=10){
	    				arraytor.add(1);	
	    			}	
	    			
	    		if(a<3){
	    			
	    		}
	    		
	    		if(a==3 ||a==4){
	    			for(int i=1;i<=9;i++){
	    				if(i==9){
	    					arrayrabbit.add(1);
	    				}
	    				else
	    					arrayrabbit.add(0);
	    			}
	    		}
	    		
	    			if(a==5){
	    				for(int i=1;i<=12;i++){
	    					//arrayrabbit.remove(i);
	    				}
	    			}
	    			
	    			if(a>5 && a<9){
	    				arrayrabbit.add(1);
	    			}
	    			
	    			if(a>8 && a<=10){
	    				for(int i=1;i<3;i++){
	    					//arrayrabbit.remove(i);
	    				}
	    			}
	    		}
	     System.out.println("rabbit"+arrayrabbit);
	     System.out.println("tor"+arraytor);
	     
	    }
	    		
	    	}
	    	
	

