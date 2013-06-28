package hr.analemma.ericsson.forrest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Forrest02 {

	private int N;

	private BigDecimal sumaUkupno = new BigDecimal(0);

	private List<Integer> primBrojevi;

	public Forrest02(int n) {
		this.N = n;

		primBrojevi = getAllPrimes();
	}

	protected List<Integer> getAllPrimes() {
		boolean[] sito = new boolean[N];
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
				while (j <= N) {
					sito[j - 1] = false;
					x++;
					j = (i1 * x);
				}
			}
		}

		return list;
	}

	public String getSuma() {
		return sumaUkupno.toString();
	}

	public void process() {

		BigDecimal sumaReda;
		for (int i = 2; i <= N; i++) {

			switch (checkNumber(i)) {
			case 1:
				// Broj je prim broj
				sumaReda = getSumAll(i);
//				System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.add(sumaReda);
				break;
			case 2:
				// broj ima parni broj prim djelitelja
				sumaReda = getSumAll(i);
//				System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.subtract(sumaReda);
				break;
			case 3:
				// broj ima neparni broj prim djelitelja
				sumaReda = getSumAll(i);
//				System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.add(sumaReda);
				break;

			default:
				// proj ima samo jedan prim djelitelj
				break;
			}
		}

		// zbrojimo s s osi 1;
		BigDecimal sum1 = new BigDecimal(sumNizReal(N));
		BigDecimal sveUkupno = sum1.multiply(new BigDecimal(N));

		sumaUkupno = sveUkupno.subtract(sumaUkupno);

		sumaUkupno = sumaUkupno.multiply(new BigDecimal(2));
	}

	/**
	 * Suma svih redova
	 * 
	 * @param i
	 * @return
	 */
	private BigDecimal getSumAll(int i) {
		BigDecimal ret = new BigDecimal(i);
		ret = ret.multiply(new BigDecimal(getX(i)));
		ret = ret.multiply(new BigDecimal(sumNiz(i)));

		return ret;
	}

	/**
	 * vraća 1 ako je i prim broj, 2 ako ima paran broj prim djelitelja, 3 ako
	 * ima neparan broj djelitelja, 4 ako ima samo jednog prim djelitelja
	 * 
	 * @param i
	 * @return
	 */
	private int checkNumber(int i) {
		int sum = 0;
		List<Integer> djelitelji = new ArrayList<Integer>();

		for (Integer prim : primBrojevi) {
			if (i == prim) {
				return 1;
			} else {
				if (i % prim == 0) {
					sum++;
					djelitelji.add(prim);
				}
			}
		}

		if (sum == 1) {
			return 4;
		} else if (sum % 2 == 0 && checkOsnovni(i, djelitelji)) {
			return 2;
		} else if(sum % 2 == 1 && checkOsnovni(i, djelitelji)){
			return 3;
		}

		return 5;
	}

	private boolean checkOsnovni(int i, List<Integer> djelitelji) {
		int umnozak = 1;
		for (Integer integer : djelitelji) {
			umnozak *= integer;
		}
		
		return (i==umnozak);
	}

	/**
	 * Do kuda ide niz i koliko puta se multiplicira niz
	 * 
	 * @param i
	 * @return
	 */
	private int getX(int i) {
		int N0 = N - (N % i);
		int x = N0 / i;
		// int x = N / i;

		return x;
	}

	private int sumNizReal(int x) {
		int ret = x * (x + 1);

		return ret / 2;
	}

	private int sumNiz(int i) {
		int x = getX(i);

		return sumNizReal(x);
	}
}