package com.techelevator.shoppingcart;

/**
 * This class represents a shopping cart that you can add different priced items to.  
 */
public class ShoppingCart {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	
	public ShoppingCart() {

	}
	
	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems the number of items being added to the cart
	 * @param pricePerItem the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {

	}
	
	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {
		return 0;
	}
	
	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {
		return 0;
	}
	
	/**
	 * The average price of all items that have been added to the cart.  This should be equal to 
	 * the totalAmountOwed divided by the totalNumberOfItems.
	 * 
	 * @return the average price of items added to the cart
	 */
	public double getAveragePricePerItem() {
		return 0;
	}

	/**
	 * Removes all items from this cart.
	 */
	public void empty() {
		
	}
}
