package tr.org.linux.kamp.mathKutuphane;

import java.util.Scanner;

public class MatematikKutuphane {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Math.max(10, 5));
		System.out.println(Math.min(10, 5));
		System.out.println(Math.log10(100));//10 luk tabanda log işlemi
		System.out.println(Math.pow(10,2));
		System.out.println(Math.log10(Math.pow(10,2)));
		
		
		
		
		//Asal sayılı sqrt fonksiyonu ile bulma
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int number = input.nextInt();
		boolean isPrime = true;
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%2==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
				
				System.out.println(number + " bir asal sayı.");
			}
			else {
				System.out.println(number + " bir asal sayı değildir.");
			}
			
		
		
		input.close();
	}

}
