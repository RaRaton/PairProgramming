package testcase;

import static org.junit.Assert.*;
import logic.RomanToNumber;

import org.junit.Test;

public class TestRomanToNumber {

	public RomanToNumber myRomanToNumber;

	@Test
	public void testM(){
		myRomanToNumber = new RomanToNumber("M");
		assertEquals(1000, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testD(){
		myRomanToNumber = new RomanToNumber("D");
		assertEquals(500, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testC(){
		myRomanToNumber = new RomanToNumber("C");
		assertEquals(100, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testL(){
		myRomanToNumber = new RomanToNumber("L");
		assertEquals(50, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testX(){
		myRomanToNumber = new RomanToNumber("X");
		assertEquals(10, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testV(){
		myRomanToNumber = new RomanToNumber("V");
		assertEquals(5, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testI(){
		myRomanToNumber = new RomanToNumber("I");
		assertEquals(1, myRomanToNumber.getNumber());
	}
	
	@Test
	public void testSustraction(){
		myRomanToNumber = new RomanToNumber("IV");
		assertEquals(4, myRomanToNumber.getNumber());
	}
	
	@Test
	public void test3(){
		myRomanToNumber = new RomanToNumber("III");
		assertEquals(3, myRomanToNumber.getNumber());	
	}
	
	@Test
	public void testMLXVI(){
		myRomanToNumber = new RomanToNumber("MLXVI");
		assertEquals(1066, myRomanToNumber.getNumber());	
	}
	
	@Test
	public void testMCMLXXXIX(){
		myRomanToNumber = new RomanToNumber("MCMLXXXIX");
		assertEquals(1989, myRomanToNumber.getNumber());	
	}
	
	@Test
	public void testMCMLXXXI(){
		myRomanToNumber = new RomanToNumber("MCMLXXXI");
		assertEquals(1981, myRomanToNumber.getNumber());	
	}
	
	
}
