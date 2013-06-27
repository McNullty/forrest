package hr.analemma.ericsson.forrest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Optimiziran Forrest01, ne reducira racionalne brojeve do kraja
 * 
 * @author mladenc
 * 
 */
public class Forrest04 {

	private BigDecimal suma = new BigDecimal(0.);
	private List<Integer> primBrojevi;

	private int MAX_X;
	private int MAX_Y;

	public Forrest04(int x, int y) {
		this.MAX_X = x;
		this.MAX_Y = y;

		primBrojevi = getAllPrimes();
	}

	protected List<Integer> getAllPrimes() {
		boolean[] sito = new boolean[MAX_X];
		for (int i = 1; i < sito.length; i++) {
			sito[i] = true;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < sito.length; i++) {
			if (sito[i]) {
				int i1 = i + 1;
				list.add(i1);
				int x = 2;
				int j = (i1 * x);
				while (j <= MAX_X) {
					sito[j - 1] = false;
					x++;
					j = (i1 * x);
				}
			}
		}

		return list;
	}

	public String getSuma() {
		return suma.toString();
	}

	public void process() {
		for (int i = 1; i <= MAX_X; i++) {
			for (int j = i + 1; j <= MAX_Y; j++) {
				RationalNumber2 num = new RationalNumber2(i, j);

				if (check(num)) {
					suma = suma.add(new BigDecimal(i + j));
				}
			}
		}
		suma = suma.multiply(new BigDecimal(2.));
		suma = suma.add(new BigDecimal(2));
	}

	private boolean check(RationalNumber2 num) {
		for (Integer x : primBrojevi) {
			if(num.getNumerator() == 1){
				return true;
			}
			if((num.getNumerator()%x==0) && (num.getDenominator()%x == 0)){
				return false;
			}
		}
		return true;
	}
}