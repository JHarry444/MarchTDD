package main;

public class BlackJack {

	public static int play(int p1, int p2) {
		if (p1 > 21 && p2 > 21) {
			return 0;
		} else if (p1 > 21) {
			return p2;
		} else if (p2 > 21) {
			return p1;
		}
		return Math.max(p1, p2);
	}

}
