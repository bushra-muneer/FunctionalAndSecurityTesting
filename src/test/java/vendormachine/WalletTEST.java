package vendormachine;

import vendormachine.users.util.Wallet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.

	@Test
	public void testAddCredit() {
		Wallet wallet = new Wallet();
		wallet.addCredit(100.0f);
		assertEquals(100.5f, wallet.getAllCredit(), "Credit should be 100.5 after adding 100 to the initial 0.5");
	}

	@Test
	public void testGetCredit() {
		Wallet wallet = new Wallet(200.0f);
		float retrieved = wallet.getCredit(50.0f);
		assertEquals(50.0f, retrieved, "Should retrieve 50 credit");
		assertEquals(150.0f, wallet.getAllCredit(), "150 credit should remain after retrieving 50");
	}

	@Test
	public void testGetCreditExceedsStored() {
		Wallet wallet = new Wallet(100.0f);
		float retrieved = wallet.getCredit(200.0f);
		assertEquals(0.0f, retrieved, "Should return 0 when trying to retrieve more credit than stored");
		assertEquals(100.0f, wallet.getAllCredit(), "100 credit should remain after failed retrieval");
	}

	@Test
	public void testBrand() {
		Wallet wallet = new Wallet("BrandName", 100.0f);
		assertEquals("BrandName", wallet.getBrand("BrandName"), "Brand should be BrandName");
	}

	@Test
	public void testSetCredit() {
		Wallet wallet = new Wallet();
		wallet.setCredit(300.0f);
		assertEquals(300.0f, wallet.getAllCredit(), "Credit should be 300 after setting 300");
	}

	@Test
	public void testSetBrand() {
		Wallet wallet = new Wallet();
		wallet.setBrand("NewBrand");
		assertEquals("NewBrand", wallet.getBrand("NewBrand"), "Brand should be NewBrand after setting NewBrand");
	}

	}
