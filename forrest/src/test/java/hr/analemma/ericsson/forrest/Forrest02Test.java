package hr.analemma.ericsson.forrest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Forrest02Test {

	@Test
	public void testPrimes() {
		Forrest02 f = new Forrest02(50);

		List<Integer> list = f.getAllPrimes();

		for (Integer integer : list) {
			System.out.print(integer.toString() + " ");
		}
	}

	@Test
	public void test4x4() {
		Forrest02 f = new Forrest02(4);
		f.process();

		System.out.println("4x4: " + f.getSuma());
	}

	@Test
	public void test100x100() {
		Forrest02 f = new Forrest02(100);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("100x100: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Test
	public void test1000x1000() {
		Forrest02 f = new Forrest02(1000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("1000x1000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}

	@Test
	public void test10x10() {
		Forrest02 f = new Forrest02(10);
		f.process();

		System.out.println("10x10: " + f.getSuma());
	}
	
	@Test
	public void test11x11() {
		Forrest02 f = new Forrest02(11);
		f.process();

		System.out.println("11x11: " + f.getSuma());
	}
	
	@Test
	public void test12x12() {
		Forrest02 f = new Forrest02(12);
		f.process();

		System.out.println("12x12: " + f.getSuma());
	}
	
	@Test
	public void test14x14() {
		Forrest02 f = new Forrest02(14);
		f.process();

		System.out.println("14x14: " + f.getSuma());
	}
	
	@Test
	public void test15x15() {
		Forrest02 f = new Forrest02(15);
		f.process();

		System.out.println("15x15: " + f.getSuma());
	}
	
	@Test
	public void test50x50() {
		Forrest02 f = new Forrest02(50);
		f.process();

		System.out.println("50x50: " + f.getSuma());
	}
	
	@Test
	public void test20x20() {
		Forrest02 f = new Forrest02(20);
		f.process();

		System.out.println("20x20: " + f.getSuma());
	}
}
