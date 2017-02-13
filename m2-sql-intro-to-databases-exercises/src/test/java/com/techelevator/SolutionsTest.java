package com.techelevator;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class SolutionsTest {

	static final String EOL = System.lineSeparator();
	
	@Test
	public void testParseSolutionsTheHappyPath() throws IOException {
		String string = "-- Preamble to solutions" + EOL + "A rambling preamble\n" +
						"-- 1. Exercise One problem statement" + EOL + EOL + "SELECT columns FROM table;" + EOL + EOL + 
						"-- 2. Exercise Two problem statement" + EOL + EOL + "INSERT INTO table (column) VALUES('value');" + EOL + EOL +
						"-- 3. Exercise Three problem statement" + EOL + EOL + "UPDATE table SET column='value';" + EOL + EOL +
						"-- 4. Exercise Four problem statement" + EOL + EOL + "DELETE table WHERE column='value';" + EOL;
		
		try (StringReader sr = new StringReader(string)) {
			Solutions s = new Solutions(sr);
			assertEquals("-- 1. Exercise One problem statement" + EOL + EOL + "SELECT columns FROM table;" + EOL + EOL, s.getSolutionCode("1"));
			assertEquals("-- 2. Exercise Two problem statement" + EOL + EOL + "INSERT INTO table (column) VALUES('value');" + EOL + EOL, s.getSolutionCode("2"));
			assertEquals("-- 3. Exercise Three problem statement" + EOL + EOL + "UPDATE table SET column='value';" + EOL + EOL, s.getSolutionCode("3"));
			assertEquals("-- 4. Exercise Four problem statement" + EOL + EOL + "DELETE table WHERE column='value';" + EOL, s.getSolutionCode("4"));
			assertEquals(null, s.getSolutionCode("5") );
		}
	}

	@Test
	public void testParseSolutionsIrregularWhitespace() throws IOException {
		String string = "--\tPreamble to solutions" + EOL + "A rambling preamble\n" +
						"--  1. Exercise One\tproblem statement" + EOL + EOL + "SELECT columns FROM table;" + EOL + EOL + 
						"-- 2.\t\tExercise Two problem statement" + EOL + EOL + "INSERT INTO table (column) VALUES('value');" + EOL + EOL +
						"--\t3. Exercise Three problem statement\t" + EOL + EOL + "UPDATE table SET column='value';" + EOL + EOL +
						"--\t \t4. \tExercise Four problem statement" + EOL + EOL + "DELETE table WHERE column='value';" + EOL;
		
		try (StringReader sr = new StringReader(string)) {
			Solutions s = new Solutions(sr);
			assertEquals("--  1. Exercise One\tproblem statement" + EOL + EOL + "SELECT columns FROM table;" + EOL + EOL, s.getSolutionCode("1"));
			assertEquals("-- 2.\t\tExercise Two problem statement" + EOL + EOL + "INSERT INTO table (column) VALUES('value');" + EOL + EOL, s.getSolutionCode("2"));
			assertEquals("--\t3. Exercise Three problem statement\t" + EOL + EOL + "UPDATE table SET column='value';" + EOL + EOL, s.getSolutionCode("3"));
			assertEquals("--\t \t4. \tExercise Four problem statement" + EOL + EOL + "DELETE table WHERE column='value';" + EOL, s.getSolutionCode("4"));
		}
	}

}
