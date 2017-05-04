package testcase;

import static org.junit.Assert.*;
import logic.APIKatas;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestFizzBuzz {
	protected static APIKatas myKatas;
	
	@BeforeClass 
	public static void setUpOnce(){
		 myKatas = new APIKatas();
	}
	
	
	@Test
	public void firstCaseTest() {
		assertEquals("1", myKatas.FizzBuzz(1));
	}

	@Test
	public void secondCaseTest() {
		assertEquals("fizz", myKatas.FizzBuzz(3));
	}
	
	@Test
	public void secondCase2StageTest() {
		assertEquals("fizz", myKatas.FizzBuzz(9));
	}
	
	@Test
	public void thridCaseTest() {
		assertEquals("buzz", myKatas.FizzBuzz(5));
	}
	
	@Test
	public void thridCase2StageTest() {
		assertEquals("buzz", myKatas.FizzBuzz(25));
	}
	
	@Test
	public void fourCaseTest() {
		assertEquals("fizzbuzz", myKatas.FizzBuzz(15));
	}
	
	@Test
	public void fourCase2StageTest() {
		assertEquals("fizzbuzz", myKatas.FizzBuzz(15*4));
	}
	
	@Test
	public void fifthCaseTest() {
		assertEquals("pop", myKatas.FizzBuzz(7));
	}
	
	@Test
	public void fifthCase2StageeTest() {
		assertEquals("pop", myKatas.FizzBuzz(14));
	}
	
	@Test
	public void sixCaseTest() {
		assertEquals("fizzpop", myKatas.FizzBuzz(21));
		assertEquals("fizzpop", myKatas.FizzBuzz(63));
		assertEquals("fizzpop", myKatas.FizzBuzz(126));
	}
	
	@Test
	public void sevenCaseTest() {
		assertEquals("buzzpop", myKatas.FizzBuzz(35));
		assertEquals("buzzpop", myKatas.FizzBuzz(140));
	}
	
	@Test
	public void eigthCaseTest() {
		assertEquals("fizzbuzzpop", myKatas.FizzBuzz(105));
	}
}
