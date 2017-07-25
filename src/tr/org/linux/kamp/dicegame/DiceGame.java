package tr.org.linux.kamp.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	private static Random rgen = new Random();

	public static void main(String[] args) {
		String gamer1 = null;
		String gamer2 = null;
		Scanner input = new Scanner(System.in);
		int resultOfGamer1;
		int resultOfGamer2;

		while (true) {
			System.out.println("Lütfen birinci oyuncunun adını giriniz!");
			gamer1 = input.next();
			resultOfGamer1 = zarSonuc();
			System.out.println("Atılan zar: " + resultOfGamer1);

			System.out.println("Lütfen ikinci oyuncunun adını giriniz!");
			gamer2 = input.next();
			resultOfGamer2 = zarSonuc();
			System.out.println("Atılan zar: " + resultOfGamer2);

			if (resultOfGamer1 > resultOfGamer2) {
				System.out.println(gamer1 + " isimli oyuncu " + resultOfGamer1 + " numaralı zarı atarak kazandı");
			} else if (resultOfGamer2 > resultOfGamer1) {
				System.out.println(gamer1 + " isimli oyuncu " + resultOfGamer2 + " numaralı zarı atarak kazandı");

			} else {
				System.out.println(resultOfGamer1 + " ve " + resultOfGamer2 + " ile berabere kalındı!");

			}

			// winner = (dice1>dice2) ? user1 : (dice1==dice2) ? :"Berabere" : user2 :
			// (dice2>dice1) ? user2;

		}

	}

	private static int zarSonuc() {
		int result = rgen.nextInt(6) + 1;

		return result;

	}

}
