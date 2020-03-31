package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BlackJack;

public class BlackJackTest {
	
	@Test
	public void testHighestWins() {
		assertEquals("Highest value not returned", 19, BlackJack.play(19, 12));
	}
	
	@Test
	public void testP1Bust() {
		assertEquals(15, BlackJack.play(23, 15));
	}

	@Test
	public void testP2Bust() {
		assertEquals(15, BlackJack.play(15, 23));
	}
	
	@Test
	public void testBothBust() {
		assertEquals(0, BlackJack.play(23, 23));
	}
	
}
