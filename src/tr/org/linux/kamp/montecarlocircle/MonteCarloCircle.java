package tr.org.linux.kamp.montecarlocircle;

import java.util.Random;
import java.util.Scanner;

public class MonteCarloCircle {

	private static Random rgen = new Random();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen kaç atış yapılacağını giriniz!");
		int atisSayisi = input.nextInt();
		boolean result;
		double isabet=0,iska=0;

		for (int i = 0; i < atisSayisi; i++) {
			
			result = atis();
			
			if(result) {
				isabet++;
			}
			else {
				iska++;
			}
		}
		System.out.println(isabet+  "   "+ iska);
		double pi=isabet/(atisSayisi)*4;
		
		System.out.println("Pi Sayısı: "+pi);
		

	}

	private static boolean atis() {
		double x,y;
		x=rgen.nextDouble()*2-1;
		y=rgen.nextDouble()*2-1;
		
		
		if(  (Math.pow(x,2) + Math.pow(y, 2))<=1) {
			return true;
		}
		else {
			return false;
		}
		

	}

}
