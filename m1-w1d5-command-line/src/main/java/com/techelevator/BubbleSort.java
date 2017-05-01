package com.techelevator;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedIntArray = new int[]{199,2,5,8,3,9,2,20,30,25,22,24,21,1};
	
		// sorted array
		int[] sortedArray = BubbleSortAscendingOrder(unsortedIntArray);

		for(int i = 0; i < sortedArray.length; i++){
			
			System.out.print(sortedArray[i] + ", ");
		}
		
	}
	
	public static int[] BubbleSortAscendingOrder(int[] intArray){
		int prev = 0;
		boolean changed = false;
		do {
			changed = false;
			for(int i = 0; i< intArray.length-1; i++){
				if(intArray[i] > intArray[i+1]){
					prev = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = prev;
					changed = true; 
				}
			}			
		}while(changed);

		return intArray;
	}

}
