package hr.analemma.ericsson.forrest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class Forrest022Test {

	@Test
	public void testPrimes() {
		Forrest022 f = new Forrest022(100);

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
		Forrest022 f = new Forrest022(4);
		f.process();

		System.out.println("4x4: " + f.getSuma());
	}

	@Test
	public void test100x100() {
		Forrest022 f = new Forrest022(100);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("100x100: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Test
	public void test1000x1000() {
		Forrest022 f = new Forrest022(1000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("1000x1000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Ignore
	@Test
	public void test10000x10000() {
		Forrest022 f = new Forrest022(500000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("10000x10000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Ignore
	@Test
	public void testFinal() {
		Forrest022 f = new Forrest022(100000000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("1000x1000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}

	@Test
	public void test10x10() {
		Forrest022 f = new Forrest022(10);
		f.process();

		System.out.println("10x10: " + f.getSuma());
	}
	
	@Test
	public void test11x11() {
		Forrest022 f = new Forrest022(11);
		f.process();

		System.out.println("11x11: " + f.getSuma());
	}
	
	@Test
	public void test12x12() {
		Forrest022 f = new Forrest022(12);
		f.process();

		System.out.println("12x12: " + f.getSuma());
	}
	
	@Test
	public void test14x14() {
		Forrest022 f = new Forrest022(14);
		f.process();

		System.out.println("14x14: " + f.getSuma());
	}
	
	@Test
	public void test15x15() {
		Forrest022 f = new Forrest022(15);
		f.process();

		System.out.println("15x15: " + f.getSuma());
	}
	
	@Test
	public void test50x50() {
		Forrest022 f = new Forrest022(50);
		f.process();

		System.out.println("50x50: " + f.getSuma());
	}
	
	@Test
	public void test20x20() {
		Forrest022 f = new Forrest022(20);
		f.process();

		System.out.println("20x20: " + f.getSuma());
	}
}
