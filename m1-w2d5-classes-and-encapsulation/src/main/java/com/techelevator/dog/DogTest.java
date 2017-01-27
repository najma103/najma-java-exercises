package com.techelevator.dog;

public class DogTest {

	public static void main(String[] args) {

		boolean allTestsPassed = true;
				
		/*** New dogs are awake ***/
		Dog spot = new Dog();
		if(spot.isSleeping()) {
			allTestsPassed = false;
			System.out.println("Test FAILED: New dogs should be awake, but this one is sleeping.");
		}
		
		/*** Dog should sleep after being told to go to sleep ***/
		spot.sleep();
		if(spot.isSleeping() == false) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The dog should be sleeping after being told to sleep.");
		}
		
		/*** Dog should be awake after being told to wake up ***/
		spot.wakeUp();
		if(spot.isSleeping()) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The dog should be awake after being told to wake up, but he is sleeping.");
		}
		
		/*** Dog should say "woof!" when awake ***/
		String sound = spot.makeSound();
		if("woof!".equals(sound) == false) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The dog should say \"woof!\" when awake.");
		}
		
		/*** Dog should say "Zzzz..." when sleeping ***/
		spot.sleep();
		sound = spot.makeSound();
		if("Zzzz...".equals(sound) == false) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The dog should say \"Zzzz...\" when sleeping.");
		}
		
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}

	}

}
