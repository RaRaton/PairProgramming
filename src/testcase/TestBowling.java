package testcase;

import static org.junit.Assert.*;
import logic.Bowling;

import org.junit.Test;

public class TestBowling {
	Bowling bowling = new Bowling();
	
	@Test
	public void perfectScore() {
		assertEquals(300, bowling.finalScore("XXXXXXXXXXXX"));
	}
	
	@Test
	public void score90() {
		assertEquals(90, bowling.finalScore("9-9-9-9-9-9-9-9-9-9-"));
	}
	
	@Test
	public void score150() {
		assertEquals(150, bowling.finalScore("5/5/5/5/5/5/5/5/5/5/5"));
	}
	
	@Test
	public void score0() {
		assertEquals(0, bowling.finalScore("--------------------"));
	}
	
	@Test
	public void score90Numbers() {
		assertEquals(90, bowling.finalScore("63541872366345368127"));
	}
	
	@Test
	public void scoreCombination1() {
		assertEquals(100, bowling.finalScore("6354189-3663X368127"));
	}
	
	@Test
	public void scoreCombination2() {
		assertEquals(110, bowling.finalScore("6354189-3663X3/8127"));
	}
	
	@Test
	public void scoreCombination3() {
		assertEquals(121, bowling.finalScore("6354189-3663X3/81X8/"));
	}
	
	@Test
	public void scoreCombination4() {
		assertEquals(131, bowling.finalScore("6354189-3663X3/81XXX"));
	}
}
