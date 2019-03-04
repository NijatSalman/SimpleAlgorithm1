package packagee;

import java.util.Scanner;

public class Texmini6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ustsinir,adimsayi,tutulaneded,tahmin=0, alttahmin, usttahmin, tahminsonuc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ust sinir: ");
		ustsinir = sc.nextInt();
		adimsayi = adimsayihesabla(ustsinir);
		System.out.print("tutdugun eded: ");
		tutulaneded = sc.nextInt();
		
	
		
		alttahmin = 1;
		usttahmin = ustsinir;
		
		while (adimsayi !=0 && tutulaneded !=tahmin) {
			
			tahmin = ortasintap(alttahmin, usttahmin);
			
			tahminsonuc = tahminele(tahmin, tutulaneded);
			
			System.out.println("adim sayi: " + adimsayi + " ust: " + usttahmin + " alt: " + alttahmin + " tahmin:" + tahmin);
			
			if(tahminsonuc == 0)
			{
				System.out.println("tahmin kicikdir");
				alttahmin = tahmin;
			}else if(tahminsonuc == 1)
			{
				System.out.println("tahmin boyukdur");
				usttahmin = tahmin;
			}else if(tahminsonuc == 2)
				System.out.println("tapildi tapildi: " + tahmin);
			
			
			adimsayi--;
		}
		
		sc.close();
		
	}
	
	public static int tahminele(int tahmin, int tutulaneded)
	{
		if(tahmin<tutulaneded)
			return 0;
		else if(tahmin>tutulaneded)
			return 1;
		else if(tahmin==tutulaneded)
			return 2;
		
		
		return -1;
		
	}
	
	
	 public static int ortasintap(int q,int w){	 
	       return (q+w)/2;
	 }
	 
	 public static int adimsayihesabla(int a){
			
		 for(int x=0;x<Integer.MAX_VALUE;x++){
		if(Math.pow(2,x)>=a){
			return x;
		}
	}
		 return 0;	
	}

}
