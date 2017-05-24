package testcase;

import static org.junit.Assert.*;
import logic.RockPaperScissors;

import org.junit.Test;

public class TestRockPaperScissors {

	RockPaperScissors game = new RockPaperScissors();

	@Test
	public void testRockBeatsScissors() {
		assertEquals("Player1", game.play("Rock","Scissors"));
	}
	
	@Test
	public void testRockBeatsScissors2() {
		assertEquals("Player2", game.play("Scissors","Rock"));
	}

	@Test
	public void testScissorsBeatsPaper() {
		assertEquals("Player1", game.play("Scissors","Paper"));
	}
	
	@Test
	public void testScissorsBeatsPaper2() {
		assertEquals("Player2", game.play("Paper","Scissors"));
	}
	
	@Test
	public void testPaperBeatsRock() {
		assertEquals("Player1", game.play("Paper","Rock"));
	}
	
	@Test
	public void testPaperBeatsRock2() {
		assertEquals("Player2", game.play("Rock","Paper"));
	}
	
	@Test
	public void testRockDraw() {
		assertEquals("Draw", game.play("Rock","Rock"));
	}
	
	@Test
	public void testScissorsDraw() {
		assertEquals("Draw", game.play("Scissors","Scissors"));
	}
	
	@Test
	public void testPaperDraw() {
		assertEquals("Draw", game.play("Paper","Paper"));
	}
}
