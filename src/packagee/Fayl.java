package packagee;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Fayl {
public static String file,iceri,i,setr;
public static int k;
public static ArrayList<Integer> obj=new ArrayList<Integer>();
public static ArrayList<Integer> obj1=new ArrayList<Integer>();
	public static void main(String[] args) {
		
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			Scanner s=new Scanner(System.in);
			file = new File("C:/Users/User/Desktop/java/besiktas.txt");
		    fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			while(true){
				
				String iceri = s.nextLine();
				
			    if(iceri.equals("quit"))
						break;
            bw.write(iceri);
			bw.newLine();
			
			}
			
			bw.close();
			fw.close();
			
		FileReader fw1 = new FileReader(file);
		BufferedReader bw1 = new BufferedReader(fw1);
	
		
		while ((setr = bw1.readLine()) != null){
			k=Integer.parseInt(setr);
			System.out.println(k);
			obj.add(k);	
		}
		System.out.println(obj);
		int size=obj.size();
     for(int i=0;i<size;i++){
		int enkicik=Integer.MAX_VALUE;
		for(Integer item:obj){
			if(item<enkicik){
				enkicik=item;
			}
		}
		
		obj.remove(new Integer(enkicik));
		obj1.add(enkicik);
		}
		System.out.println("qwerty"+obj);
		System.out.println("qwert2"+obj1);
		

		bw1.close();
		fw.close();
		
			System.out.println("Done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	}


