package hr.analemma.ericsson.forrest;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class Forrest023Test {

	@Test
	public void testPrimes() {
		Forrest023 f = new Forrest023(100);

		System.out.println("Mapa:");
		int[] map = f.getMap();
		for (int i = 1; i < map.length; i++) {
			System.out.print(i+1 + "\t");
		}
		System.out.println();
		for (int i = 1; i < map.length; i++) {
			System.out.print(map[i] + "\t");
		}
		
		List<Integer> list = f.getAllPrimes();

		System.out.println();
		System.out.println("Prim brojevi:");
		for (Integer integer : list) {
			System.out.print(integer.toString() + " ");
		}
		
		
		
	}

	@Test
	public void test4x4() {
		Forrest023 f = new Forrest023(4);
		f.process();

		System.out.println("4x4: " + f.getSuma());
	}

	@Test
	public void test100x100() {
		Forrest023 f = new Forrest023(100);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("100x100: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Test
	public void test1000x1000() {
		Forrest023 f = new Forrest023(1000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("1000x1000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
//	@Ignore
	@Test
	public void test500000x500000() {
		Forrest023 f = new Forrest023(500000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("500000x500000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
//	@Ignore
	@Test
	public void testFinal() {
		Forrest023 f = new Forrest023(100000000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("100000000x100000000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}

	@Test
	public void test10x10() {
		Forrest023 f = new Forrest023(10);
		f.process();

		System.out.println("10x10: " + f.getSuma());
	}
	
	@Test
	public void test11x11() {
		Forrest023 f = new Forrest023(11);
		f.process();

		System.out.println("11x11: " + f.getSuma());
	}
	
	@Test
	public void test12x12() {
		Forrest023 f = new Forrest023(12);
		f.process();

		System.out.println("12x12: " + f.getSuma());
	}
	
	@Test
	public void test14x14() {
		Forrest023 f = new Forrest023(14);
		f.process();

		System.out.println("14x14: " + f.getSuma());
	}
	
	@Test
	public void test15x15() {
		Forrest023 f = new Forrest023(15);
		f.process();

		System.out.println("15x15: " + f.getSuma());
	}
	
	@Test
	public void test50x50() {
		Forrest023 f = new Forrest023(50);
		f.process();

		System.out.println("50x50: " + f.getSuma());
	}
	
	@Test
	public void test20x20() {
		Forrest023 f = new Forrest023(20);
		f.process();

		System.out.println("20x20: " + f.getSuma());
	}
	
	@Test
	public void testBigInteger() {
		BigDecimal bd = new BigDecimal(100000000);
		
		System.out.println(bd.toString());
		bd = bd.pow(3);
		System.out.println(bd.toString());
	}
}
