package vendormachine;

import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vendormachine.vendors.enums.BRANDS;
import vendormachine.vendors.item.Snack;

public class DrinkVendingMachineTEST {
	
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */

	@Test
	public void testDefaultConstructor() {
		DrinkVendingMachine machine = new DrinkVendingMachine();
		assertNotNull(machine, "Machine should not be null after default constructor");
	}

	@Test
	public void testConstructorWithParameters() {
		DrinkVendingMachine machine = new DrinkVendingMachine(100.0f, BRANDS.InFuse);
		assertEquals(100.0f, machine.getAvailableCredit(), "Available credit should be 100 after constructor with parameters");
		assertEquals(BRANDS.InFuse, machine.getBrandName(), "Brand name should be CocaCola after constructor with parameters");
	}

	@Test
	public void testAddCredit() {
		DrinkVendingMachine machine = new DrinkVendingMachine();
		Wallet wallet = machine.getWallet(); // Assuming you have a getWallet method
		wallet.addCredit(50.0f);
		assertEquals(50.5f, wallet.getAllCredit(), "Available credit should be 50.5 after adding 50 to the initial 0.5");
	}

	@Test
	public void testSelectDrink() {
		DrinkVendingMachine machine = new DrinkVendingMachine(100.0f, BRANDS.InFuse);
		Snack drink = machine.selectDrink(0);
		assertNotNull(drink, "Drink should not be null after selecting a drink");
	}
}

