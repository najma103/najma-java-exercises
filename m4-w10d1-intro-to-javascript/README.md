# Client-Side Scripting Exercises

For each exercise, create separate html and javascript file. You'll write your javascript file to have a function that matches the signature below
and be responsible for calling and implementing it.


1. **SumDouble** Given two int values, return their sum. Unless the two values are the same, then return double their sum.

		sumDouble(1, 2) → 3
		sumDouble(3, 2) → 5
		sumDouble(2, 2) → 8
		
		
		window.onload = function() { 
			
			console.log(sumDouble(1, 2));
			console.log(sumDouble(3, 2));
			console.log(sumDouble(2, 2));
			
			function sumDouble(x, y) {
				// do logic here
				// return result;
				return x + y;
			}
		};
		

2. **HasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true

3. **LastDigit** Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.

		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true

4. **SeeColor** Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

		seeColor("redxx") → "red"
		seeColor("xxred") → ""
		seeColor("blueTimes") → "blue"

5. **MiddleThree** Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

		middleThree("Candy") → "and"
		middleThree("and") → "and"
		middleThree("solving") → "lvi"

6. **FrontAgain** Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

		frontAgain("edited") → true
		frontAgain("edit") → false
		frontAgain("ed") → true

7. **AlarmClock** Write a function that given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, displays the weeday name, and the time in the form of "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

		alarmClock(1, false) → "Monday 7:00"
		alarmClock(5, true) → "Frday 10:00"
		alarmClock(0, false) → "Sunday 10:00"

8. **MakeMiddle** Write a function that given an array of ints of even length, returns a new array length 2 containing the middle two elements from the original array. If the original array length is not even, or at least 2 elements in length, return an empty array.

		makeMiddle([1, 2, 3, 4]) → [2, 3]
		makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
		makeMiddle([1, 2]) → [1, 2]

9. **OddOnly** Write a function that given an array of integer of any length, filters out the even number, and returns a new array of just the the odd numbers.

		oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
		oddOnly([2, 4, 8, 32, 256]); → []

10. **Weave** Write a function that given two arrays, interleaves the two arrays one element from each array at a time to return a new array made up of the interwoven elements of the original two arrays.

		weave([1, 3, 5], [2, 4]); → [1, 2, 3, 4, 5]
		weave([1, 3, 5], [2, 4, 6, 8]); → [1, 2, 3, 4, 5, 6, 8]

11. **CigarParty** When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Write a squirrel party function that return true if the party with the given values is successful, or false otherwise.

		cigarParty(30, false) → false
		cigarParty(50, false) → true
		cigarParty(70, true) → true

12. **StringSplosion** Write a function that given a non-empty string like "Code" returns a string like "CCoCodCode". 

		stringSplosion("Code") → "CCoCodCode"
		stringSplosion("supercalifragilisticexpialidocious") → "ssusupsupesupersupercsupercasupercalsupercalisupercalifsupercalifrsupercalifrasupercalifragsupercalifragisupercalifragilsupercalifragilisupercalifragilissupercalifragilistsupercalifragilistisupercalifragilisticsupercalifragilisticesupercalifragilisticexsupercalifragilisticexpsupercalifragilisticexpisupercalifragilisticexpiasupercalifragilisticexpialsupercalifragilisticexpialisupercalifragilisticexpialidsupercalifragilisticexpialidosupercalifragilisticexpialidocsupercalifragilisticexpialidocisupercalifragilisticexpialidociosupercalifragilisticexpialidociousupercalifragilisticexpialidocious"

13. **FizzBuzz** Because you know you can't live without it, FizzBuzz. 
	
		Based on a traditional English children's game.
			Print the numbers 1..100
			For multiples of 3, print "Fizz" instead of the number
			For multiples of 5, print "Buzz" instead of the number
			For multiples of 3 and 5, print "FizzBuzz" instead of the number
		
		fizzBuzz() → 	
			1
			2
			Fizz
			4
			Buzz
			Fizz
			7
			8
			Fizz
			Buzz
			11
			Fizz
			13
			14
			FizzBuzz
			.
			.
			.			

14. **CountValues** Write a function that accepts an array of integer values, count of the number of times each value is found in the array, and then display the values and their count.

		 countValues([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107])  → 	
			1 : 1
			99 : 3
			43 : 1
			2 : 2
			55 : 1
			78 : 1
			2345 : 1
			438 : 1
			107 : 1

15. **ReverseArray** Write an function that accepts an array of integer values, and display them in the reverse order they appeared in the array. One obvious solution is to simply loop through the integer array in reserve order, but see if you can come up with an alternative.

		reverseArray([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107]) → 
		1 99 43 2 55 78 2345 438 107

16. **BlackJack** Write a function that given 2 int values greater than 0, returns whichever value is nearest to 21 without going over. Return 0 if they both go over. 

		blackjack(19, 21) → 21
		blackjack(21, 19) → 21
		blackjack(19, 22) → 19
		