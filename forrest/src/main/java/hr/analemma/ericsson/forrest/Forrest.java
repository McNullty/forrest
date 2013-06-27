package hr.analemma.ericsson.forrest;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Hello world!
 * 
 */
public class Forrest {
	private static final int X_MIN = 1;
	private static final int Y_MIN = 1;
	private static final int X_MAX = 100;
	private static final int Y_MAX = 100;

	public BigDecimal starost = new BigDecimal(0);

	private ArrayList<RationalNumber> line;

	public Forrest() {
		line = new ArrayList<RationalNumber>();
	}

	/**
	 * Provjerava da li je drvo vidljivo
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean checkTree(int x, int y) {
		RationalNumber k = new RationalNumber(y, x);

		// Ako već postoji ta linija onda je drvo zakriveno
		boolean ret = line.contains(k);
		if (!ret)
			line.add(k);

		return !ret;
	}

	public void checkForrest() {
		for (int i = X_MIN; i < X_MAX; i++) {
			for (int j = Y_MIN; j < Y_MAX; j++) {
				if (checkTree(i, j)) {
					int sum = i + j;
					starost.add(new BigDecimal(sum));
				}
			}
		}
	}



	public static void main(String[] args) {
		Forrest f = new Forrest();
		f.checkForrest();

		System.out.println(f.starost.toString());
	}
}
