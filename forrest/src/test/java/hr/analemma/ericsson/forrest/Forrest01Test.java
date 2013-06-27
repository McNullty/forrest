package hr.analemma.ericsson.forrest;

import org.junit.Test;

public class Forrest01Test {

	@Test
	public void test4x4() {
		Forrest01 f  =new Forrest01(4, 4);
		f.process();
		
		System.out.println("4x4: " + f.getSuma());
	}

	@Test
	public void test100x100() {
		Forrest01 f  =new Forrest01(100, 100);
		f.process();
		
		System.out.println("100x100: " + f.getSuma());
	}
	
	@Test
	public void test10x10() {
		Forrest01 f  =new Forrest01(10, 10);
		f.process();
		
		System.out.println("10x10: " + f.getSuma());
	}
}
