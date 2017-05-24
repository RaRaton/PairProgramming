package testcase;

import static org.junit.Assert.*;
import logic.ConnectFour;

import org.junit.Test;

public class TestConnectFour {

	ConnectFour game = new ConnectFour();
	
	@Test
	public void testRow() {
		assertEquals(1, game.getRow(0, 'B'));
	}
	
	@Test
	public void testRow2() {
		assertEquals(3, game.getRow(2, 'D'));
	}
	
	@Test
	public void testRow3() {
		assertEquals(6, game.getRow(5, 'F'));
	}
	
	@Test
	public void testWinnerHorizontal(){
		//Yellow -> 1
		//Red -> 2
		int [ ][ ] grid = { { 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 1, 1, 1, 1, 0, 0, 0 }};
		
		assertEquals("Yellow", game.play(grid));
	}
	
	@Test
	public void testWinnerVertical(){
		//Yellow -> 1
		//Red -> 2
		int [ ][ ] grid = { { 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 2, 0, 0, 0, 0, 0, 0 },
				   			{ 2, 0, 0, 0, 0, 0, 0 },
				   			{ 2, 0, 0, 0, 0, 0, 0 },
				   			{ 2, 0, 0, 0, 0, 0, 0 }};
		
		assertEquals("Red", game.play(grid));
	}
	
/*	@Test
	public void testWinnerNone(){
		//Yellow -> 1
		//Red -> 2
		int [ ][ ] grid = { { 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 }};
		
		assertEquals("None", game.play(grid));
	}
*/	
	@Test
	public void testWinnerDiagonal(){
		//Yellow -> 1
		//Red -> 2
		int [ ][ ] grid = { { 0, 0, 0, 0, 0, 0, 0 },
				   			{ 0, 0, 0, 0, 0, 0, 0 },
				   			{ 1, 2, 2, 2, 0, 0, 0 },
				   			{ 1, 1, 2, 1, 0, 0, 0 },
				   			{ 1, 2, 1, 2, 0, 0, 0 },
				   			{ 2, 1, 2, 2, 0, 0, 0 }};
		
		assertEquals("Red", game.play(grid));
	}
}
