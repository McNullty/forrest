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
	
	@Test
	public void test11x11() {
		Forrest01 f  =new Forrest01(11, 11);
		f.process();
		
		System.out.println("11x11: " + f.getSuma());
	}
	
	@Test
	public void test12x12() {
		Forrest01 f  =new Forrest01(12, 12);
		f.process();
		
		System.out.println("12x12: " + f.getSuma());
	}
	
	@Test
	public void test14x14() {
		Forrest01 f  =new Forrest01(14, 14);
		f.process();
		
		System.out.println("14x14: " + f.getSuma());
	}
	
	@Test
	public void test15x15() {
		Forrest01 f  =new Forrest01(15, 15);
		f.process();
		
		System.out.println("15x15: " + f.getSuma());
	}
	
	@Test
	public void test50x50() {
		Forrest01 f  =new Forrest01(50, 50);
		f.process();
		
		System.out.println("50x50: " + f.getSuma());
	}
	
	@Test
	public void test20x20() {
		Forrest01 f  =new Forrest01(20, 20);
		f.process();
		
		System.out.println("20x20: " + f.getSuma());
	}
}
