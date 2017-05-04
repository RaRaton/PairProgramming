package testcase;

import static org.junit.Assert.*;
import logic.RomanNumeral;

import org.junit.Test;

public class TestRomanNumeral {

	RomanNumeral myRomanNumeral; 

	@Test
	public void test1(){
		myRomanNumeral = new RomanNumeral(1);
		assertEquals("I", myRomanNumeral.getRoman());
	}
		
	@Test
	public void test5(){
		myRomanNumeral = new RomanNumeral(5);
		assertEquals("V", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test10(){
		myRomanNumeral = new RomanNumeral(10);
		assertEquals("X", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test50(){
		myRomanNumeral = new RomanNumeral(50);
		assertEquals("L", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test100(){
		myRomanNumeral = new RomanNumeral(100);
		assertEquals("C", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test500(){
		myRomanNumeral = new RomanNumeral(500);
		assertEquals("D", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test1000(){
		myRomanNumeral = new RomanNumeral(1000);
		assertEquals("M", myRomanNumeral.getRoman());
	}
	
	@Test
	public void testSustraction(){
		myRomanNumeral = new RomanNumeral(4);
		assertEquals("IV", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(9);
		assertEquals("IX", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(40);
		assertEquals("XL", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(90);
		assertEquals("XC", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(400);
		assertEquals("CD", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(900);
		assertEquals("CM", myRomanNumeral.getRoman());
	}
	
	@Test
	public void test3133(){
		myRomanNumeral = new RomanNumeral(3133);
		assertEquals("MMMCXXXIII", myRomanNumeral.getRoman());
	}
	
	@Test
	public void testOutLimit(){
		myRomanNumeral = new RomanNumeral(0);
		assertEquals("", myRomanNumeral.getRoman());
		
		myRomanNumeral = new RomanNumeral(4000);
		assertEquals("", myRomanNumeral.getRoman());
	}
}
