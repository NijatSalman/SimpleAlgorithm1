package packagee;

import java.util.concurrent.TimeUnit;

public class Rabbit2 {
 static int toplator=0,toplarabbit=0;
	public static void main(String[] args) {
	
		while(true){
			int rnd=(int)(Math.random()*10+1);
			
			for (int i = 0; i < toplarabbit; i++) {
				System.out.print(" ");
			}
			System.out.println("R");
			
			for (int i = 0; i < toplator; i++) {
				System.out.print(" ");
			}
			System.out.println("T");
			
			System.out.println("**********************************************************************");
			
			
			if(rnd<6){
				toplator+=3;
	    		}
			
			if(rnd>5 && rnd<8){
				toplator-=6;
    		}
			
			if(rnd>7 && rnd<=10){
					toplator+=1;
			}
			
			if(rnd<3){
    			
    		}
			
			if(rnd==3 ||rnd==4){
				toplarabbit+=9;
    		}
			
			if(rnd==5){
				toplarabbit-=5;
			}
			
			if(rnd>5 && rnd<9){
				toplarabbit+=1;
			}
			
			if(rnd>8 && rnd<=10){
				toplarabbit -=2;
			}
			
			if(toplator>=70){
	    		System.out.println("tortoise qazandi");
	    		break;
	    	}
			
			if(toplarabbit>=70){
	    		System.out.println("rabbit qazandi");
	    		break;
	    	}
			
			if(toplator<0){
	    		toplator=0;
	    	}
			
			if(toplarabbit<0){
				toplarabbit=0;
	    	}
			
			
			
			try {
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
