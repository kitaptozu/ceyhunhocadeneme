package tr.org.linux.kamp.kartoyunu;

import java.util.Random;
import java.util.Scanner;

public class KartOyunu {

	private static Random rgen = new Random();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi = 0;

		while (true) {

			sayi = input.nextInt();

			System.out.println(sayi + " Seçilen kart: " + chooseRandomSuit() + "  " + chooseRandomRank());

		}

	}

	private static String chooseRandomRank() {

		int result = rgen.nextInt(13) + 1;

		switch (result) {
		case 1:
			return "A";

		case 11:
			return "Bacak";

		case 12:
			return "Kız";

		case 13:
			return "Papaz";

		default:
			return result + "";
			

		}

	}

	private static String chooseRandomSuit() {

		int result = rgen.nextInt(4) + 1;

		switch (result) {
		case 1:
			return "Kupa";

		case 2:
			return "Sinek";

		case 3:
			return "Maça";

		case 4:
			return "Karo";

		default:
			return "Hata";
		}

	}

}
