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
		f.process();

		System.out.println("100x100: " + f.getSuma());
	}

	@Test
	public void test10x10() {
		Forrest02 f = new Forrest02(10);
		f.process();

		System.out.println("10x10: " + f.getSuma());
	}
}
