package hr.analemma.ericsson.forrest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Forrest04Test {

	@Test
	public void test4x4() {
		Forrest04 f  =new Forrest04(4, 4);
		f.process();
		
		System.out.println("4x4: " + f.getSuma());
		
		Forrest01 f2  =new Forrest01(4, 4);
		f2.process();
		assertEquals(f2.getSuma(), f.getSuma());
	}

	@Test
	public void test100x100() {
		Forrest04 f  =new Forrest04(100, 100);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("100x100: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Test
	public void test1000x1000() {
		Forrest04 f  =new Forrest04(1000, 1000);
		long start = System.currentTimeMillis();
		f.process();
		long end = System.currentTimeMillis();
		
		System.out.println("1000x1000: " + f.getSuma());
		System.out.println("elapsed: " + (end - start) + " ms");
	}
	
	@Test
	public void test10x10() {
		Forrest04 f  =new Forrest04(10, 10);
		f.process();
		
		System.out.println("10x10: " + f.getSuma());
		
		Forrest01 f2  =new Forrest01(10, 10);
		f2.process();
		assertEquals(f2.getSuma(), f.getSuma());
	}
	
//	@Test
//	public void testFinal() {
//		Forrest04 f  =new Forrest04(100000000, 100000000);
//		f.process();
//		
//		System.out.println("100000000x100000000: " + f.getSuma());		
//	}
}
