package com.techelevator.swtch; // "swtch" misspelling intentional, "switch" is a Java keyword, and not allowed in package name.

public class SwitchTest {

	public static void main(String[] args) {
		
		boolean allTestsPassed = true;
		
		/*** New switches are off ***/
		Switch mySwitch = new Switch();
		if(mySwitch.isOn()) {
			allTestsPassed = false;
			System.out.println("Test 1 FAILED: A new switch should be off, but this one is on.");
		}
		
		if(mySwitch.isOff() == false) {
			allTestsPassed = false;
			System.out.println("Test 1 FAILED: A new switch should be off, but this one is not off.");
		}
		
		/*** turnOn should turn the switch on ***/
		mySwitch.turnOn();
		if(mySwitch.isOff()) {
			allTestsPassed = false;
			System.out.println("Test 2 FAILED: A switch should be on after being turned on, but this one is off.");
		}
		
		if(mySwitch.isOn() == false) {
			allTestsPassed = false;
			System.out.println("Test 2 FAILED: A switch should be on after being turned on, but this one is not on.");
		}
		
		/*** turnOff should turn the switch off ***/
		mySwitch.turnOff();
		if(mySwitch.isOn()) {
			allTestsPassed = false;
			System.out.println("Test 3 FAILED: A switch should be off after being turned off, but this one is on.");
		}
		
		if(mySwitch.isOff() == false) {
			allTestsPassed = false;
			System.out.println("Test 3 FAILED: A switch should be off after being turned off, but this one is not off.");
		}
		
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}

	}

}
