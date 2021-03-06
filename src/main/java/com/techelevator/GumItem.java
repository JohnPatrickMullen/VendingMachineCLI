package com.techelevator;

public class GumItem implements Item{
	
	/*********************************************
	 * Instance Variables
	 *********************************************/
	
	private String name = "";
	private String slot = "";
	private Double price = 0.00;
	private int inventory = 5;
	
	/*********************************************
	 * Getters
	 *********************************************/

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getSlot() {
		return slot;
	}
	@Override
	public int getInventory() {
		return inventory;
	}

	/*********************************************
	 * Setters
	 *********************************************/
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSlot(String slot) {
		this.slot = slot;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	/*********************************************
	 * Methods
	 * 
	 * Purchase - takes one from the inventory
	 * 
	 * Dispense - if the item isn't sold out,
	 *  take one away from the inventory,
	 *   Print the sound 
	 *    Return the message
	 * 
	 * @param getName
	 *********************************************/

	@Override
	public void purchase() {
		// First we need to check if we have enough
		if (this.inventory > 0) {
			this.inventory -= 1;
		}
		
	}

	
	public String dispense(String getName) {
		String returnMessage = "";
		if (this.inventory == 0) {
			returnMessage += "This item is sold out";
		} else {
			System.out.println("Chew Chew, Yum!");
			returnMessage += "You Selected " + getName;
			this.inventory -= 1;
			
		}
		return returnMessage;
		
	}
}