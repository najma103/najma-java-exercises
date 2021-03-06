# File I/O Part 1 Exercises

## WordSearch

#### Part 1

Write a program that does the following:

1) prompts the user to enter a "search term"
2) prompts the user to enter a file system path for a text file
3) searches the file for occurrences of the search string and each time it finds the search string, displays the line number and contents of the line it was found in on the console. 

As a special treat, and a break from arrays, line numbers begin with 1. 

Example output:

```
Enter the search term >>> Alice
Enter the file system path >>> /Users/Bob/alices_adventures_in_wonderland.txt

1) Project Gutenberg's Alice's Adventures in Wonderland, by Lewis Carroll
9) Title: Alice's Adventures in Wonderland
43) [Illustration: "Alice"]

...and the output continues
```

#### Part 2

Modify the program so the user can choose to execute a case insensitive search.

```
Enter the search term >>> Alice
Enter the file system path >>> /Users/Bob/alices_adventures_in_wonderland.txt
Do you want the search to be case sensitive? (y or n) >>> n

1) Project Gutenberg's Alice's Adventures in Wonderland, by Lewis Carroll
9) Title: Alice's Adventures in Wonderland
41) ALICE'S ADVENTURES IN WONDERLAND
43) [Illustration: "Alice"]

...and the output continues

```

## QuizMaker

#### Challenge

Create a quiz maker program which asks the user a question, presents multiple choice answers, and allows the user to specify a correct answer.

The program will read the questions from an input file during startup. The questions and answers will be pipe delimited | and correct answers will be marked with an asterisk in the file.

```
Question-1|answer-1|answer-2|correct-answer*|answer-4
```

Example file

```
What color is the sky?|yellow|blue*|green|red
What are Cleveland's odds of winning a championship?|Not likely*|Highly likely|Fat chance|Who cares??
```

**Tips**

* Create a class that can model a quiz question, available answers, and a correct answer.
* While reading the input file, create an instance of the `quiz question` class and store it in a collection of quiz questions.

**Step 1**

Ask a single question to the user when the application is opened. Don't show the right answer in the list of choices.

Example

```
What color is the sky?
1. Yellow
2. Blue
3. Green
4. Red

Your answer: 2

WRONG!
``` 

**Step 2**

Go through all of the available quiz questions and ask the user each one sequentially, recording how many answers they got correct.

Example

```
What color is the sky?
1. Yellow
2. Blue
3. Green
4. Red

Your answer: 2

WRONG!

What are Cleveland's odds of winning a championship?
1. Not likely
2. Highly likely
3. Fat chance
4. Who cares??

Your answer: 1

RIGHT!

You got 1 answers correct out of the total 2 questions asked
```