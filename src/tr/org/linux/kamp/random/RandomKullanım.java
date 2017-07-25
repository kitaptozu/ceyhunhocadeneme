package tr.org.linux.kamp.random;

import java.util.Random;

public class RandomKullanım {

	public static void main(String[] args) {
		System.out.println(Math.random());
		Random rgen = new Random();
		System.out.println("Rgen random: " + Math.random());
		System.out.println("Rgen random: " + rgen.nextInt());
		System.out.println("Rgen random double: " + rgen.nextDouble());
		System.out.println("Rgen random boolean: " + rgen.nextBoolean());
		System.out.println(rgen.nextInt(100));

		
		Random rgen2 = new Random();
		System.out.println("Rgen random: " + rgen2.nextInt());
	}

}
