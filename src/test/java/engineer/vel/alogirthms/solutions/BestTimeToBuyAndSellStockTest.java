package engineer.vel.alogirthms.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

	BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

	@Test
	void testMaxProfit() {
		assertEquals(5, obj.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }), "Test Failed");
		assertEquals(0, obj.maxProfit(new int[] { 7, 6, 4, 3, 1 }), "Test Failed");
	}
}
