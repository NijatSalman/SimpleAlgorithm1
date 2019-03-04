package packagee;
import java.util.Random;
import java.util.Scanner;
public class Texmini3 {

	public static void main(String[] args) {
		Random rnd=new Random();
		int a=rnd.nextInt(10);
		System.out.println("Hansi sayidi tutdugum :");
		Scanner s=new Scanner(System.in);
		int l;
		while(true){
			l=s.nextInt();
			if(a<l){
				System.out.println("verdiyin eded boyukdur :");
			}
			else if(a>l){
				System.out.println("verdiyin eded kicikdir :");
			}
			else{
			System.out.println("hemin eded "+a);
			break;
			}
			
		}
	}
}

