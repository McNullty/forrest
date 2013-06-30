package hr.analemma.ericsson.forrest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Optimizirano tako da se stvaranju liste prim brojeva napravi lista da li se
 * za taj redak treba zbrajati, oduzimati ili ništa
 * 
 * @author mladen
 * 
 */
public class Forrest022 {

	private int N;

	private BigDecimal sumaUkupno = new BigDecimal(0);

	private int[] mapa;
	private List<Integer> primBrojevi;

	public Forrest022(int n) {
		this.N = n;
		primBrojevi = getAllPrimes();
	}

	public int[] getMap() {
		return mapa;
	}

	private void printMap2(int n, int[] m) {
		System.out.println((n + 1) + ". Mapa:");
		for (int i = 1; i < m.length; i++) {
			System.out.print(i + 1 + "\t");
		}
		System.out.println();
		for (int i = 1; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();
	}

	protected List<Integer> getAllPrimes() {
		boolean[] sito = new boolean[N];
		mapa = new int[N];

		for (int i = 1; i < sito.length; i++) {
			sito[i] = true;
			mapa[i] = 1;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < sito.length; i++) {
			if (sito[i]) {
				int i1 = i + 1;
				list.add(i1);
				// mapa se ne dira jer je već označena s 1

				int x = 2;
				int j = (i1 * x);
				while (j <= N) {
					sito[j - 1] = false;
					mapa[j - 1]--;// oduzmemo sve višekratnike

					x++;
					j = (i1 * x);
				}
			} else if (mapa[i] == -1) {
				mapa[i] = 2; // postavimo oznaku da se treba ukoniti

				int i1 = i + 1;
				// dodamo sve višekratnike
				for (int j = i1 * 2; j <= sito.length; j += i1) {
					mapa[j - 1] += 1;
				}
			} else if (mapa[i] == 1) {
				mapa[i] = 3; // postavimo oznaku da se treba dodati

				int i1 = i + 1;
				// oduzmemo sve višekratnike
				for (int j = i1 * 2; j <= sito.length; j += i1) {
					mapa[j - 1] -= 1;
				}
			}

//			printMap2(i, mapa);
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
//				 System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.add(sumaReda);
				break;
			case 2:
				// broj ima parni broj prim djelitelja
				sumaReda = getSumAll(i);
//				 System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.subtract(sumaReda);
				break;
			case 3:
				// broj ima neparni broj prim djelitelja
				sumaReda = getSumAll(i);
//				 System.out.println(i + ": " + sumaReda.toString());
				sumaUkupno = sumaUkupno.add(sumaReda);
				break;

			default:
				// proj ima samo jedan prim djelitelj
				break;
			}
		}

		// zbrojimo s s osi 1;
		BigDecimal sum1 = sumNizReal(N);
		System.out.println("Suma niza: " + sum1.toString());
		BigDecimal sveUkupno = sum1.multiply(new BigDecimal(N));
		System.out.println("Ukupna Suma niza: " + sveUkupno.toString());

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
		ret = ret.multiply(sumNiz(i));

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
		return mapa[i-1];
	}

	private boolean checkOsnovni(int i, List<Integer> djelitelji) {
		int umnozak = 1;
		for (Integer integer : djelitelji) {
			umnozak *= integer;
		}

		return (i == umnozak);
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

	private BigDecimal sumNizReal(int x) {
		BigDecimal ret = new BigDecimal(x); //x * (x + 1);
		ret = ret.multiply(new BigDecimal(x+1));

		return ret.divide(new BigDecimal(2));
	}

	private BigDecimal sumNiz(int i) {
		int x = getX(i);

		return sumNizReal(x);
	}
}