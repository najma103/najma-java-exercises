package com.techelevator.shoppingcart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		boolean allTestsPassed = true;
		
		/*** totalNumberOfItems should start at zero ***/
		ShoppingCart cart = new ShoppingCart();
		if(cart.getTotalNumberOfItems() != 0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a new cart is created, totalNumberOfItems should start at zero.");
		}
		
		/*** totalAmountOwed should start at zero ***/
		if(cart.getTotalAmountOwed() != 0.0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a new cart is created, totalAmountOwed should start at zero.");
		}
		
		/*** averagePricePerItem should start at zero ***/
		if(cart.getAveragePricePerItem() != 0.0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a new cart is created, averagePricePerItem should start at zero.");
		}
		
		/*** totalNumberOfItems tracks the number of items added to the cart ***/
		cart.addItems(2, 1.00);
		cart.addItems(3, 1.00);
		cart.addItems(4, 1.00);
		if(cart.getTotalNumberOfItems() != 9) {
			allTestsPassed = false;
			System.out.println("Test FAILED: 9 items were added to the cart, but totalNumberOfItems is "+cart.getTotalNumberOfItems());
		}
		
		/*** Emptying the cart should reset all totals ***/
		cart.empty();
		if(cart.getTotalNumberOfItems() != 0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a cart is emptied, totalNumberOfItems should start at zero.");
		}
		
		if(cart.getTotalAmountOwed() != 0.0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a cart is emptied, totalAmountOwed should start at zero.");
		}
		
		if(cart.getAveragePricePerItem() != 0.0) {
			allTestsPassed = false;
			System.out.println("Test FAILED: When a cart is emptied, averagePricePerItem should start at zero.");
		}
		
		/*** totalAmountOwed tracks the total amount owed for all items added to the cart ***/
		cart.addItems(2, 7.50);
		cart.addItems(3, 6.00);
		cart.addItems(4, 5.75);
		if(cart.getTotalAmountOwed() != 56.00) {
			allTestsPassed = false;
			System.out.println("Test FAILED: 56.00 worth of items were added to the cart, but totalAmountOwed is "+cart.getTotalAmountOwed());
		}
		
		/*** averagePricePerItem returns the average price of all items added to the cart ***/
		cart.empty();
		cart.addItems(3, 2.00);
		cart.addItems(4, 3.00);
		cart.addItems(1, 2.00);
		if(cart.getAveragePricePerItem() != 2.50) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The average price of items added to the cart should have been 2.50, but  averagePricePerItem was "+cart.getAveragePricePerItem());
		}
				
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}

	}

}
