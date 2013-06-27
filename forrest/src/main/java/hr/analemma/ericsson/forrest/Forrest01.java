package hr.analemma.ericsson.forrest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Referentna implementacija. točni iznosi za 4x4 i 10x10
 * 
 * @author mladenc
 * 
 */
public class Forrest01 {

	private List<RationalNumber> drva = new ArrayList<RationalNumber>();
	private BigDecimal suma = new BigDecimal(0.);

	private int MAX_X;
	private int MAX_Y;

	public Forrest01(int x, int y) {
		this.MAX_X = x;
		this.MAX_Y = y;
	}

	public String getSuma() {
		return suma.toString();
	}

	public void process() {
		for (int i = 1; i <= MAX_X; i++) {
			for (int j = i + 1; j <= MAX_Y; j++) {
				RationalNumber num = new RationalNumber(i, j);

				if (!check(num)) {
					drva.add(num);
					suma = suma.add(new BigDecimal(i + j));
				}
			}
		}
		suma = suma.multiply(new BigDecimal(2.));
		suma = suma.add(new BigDecimal(2));
	}

	private boolean check(RationalNumber num) {
		return drva.contains(num);
	}
}