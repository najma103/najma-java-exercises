package com.techelevator;
import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pleasae enter the Finonacci Numer: ");
		int input = scanner.nextInt();
		int[] arr = new int[input];
		
		arr[0] = 0;
		arr[1] = 1;
		if(input > 1){
			for(int i = 2; i < input; i++){
				int temp = arr[i - 2] + arr[i - 1];
				if(temp > input){
					break;
				} else {
					arr[i] = temp;
				}
			}
		}
		System.out.print(arr[0] + ", ");
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > 0){
				System.out.print(arr[i] + ", ");
			}
		}
		
		//System.out.println(String.join(arr.toString(),  ","));
	}

}
